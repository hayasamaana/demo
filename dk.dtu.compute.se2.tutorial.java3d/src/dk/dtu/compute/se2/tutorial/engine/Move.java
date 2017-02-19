package dk.dtu.compute.se2.tutorial.engine;

import javax.media.j3d.Transform3D;
import javax.media.j3d.TransformGroup;
import javax.vecmath.Quat4f;
import javax.vecmath.Vector3f;

import geometry.petri.geometry.Line;
import geometry.petri.geometry.Point;

public class Move extends Animation {

	private float speed = 100f; // 2*((float)Math.random()+0.4f); // (unit/s)

	private Transform3D transform;
	private TransformGroup transformGroup;

	private float elapsed;

	// source point coordinates
	private float x1;
	private float y1;
	private float z1;

	// target point coordinates
	private float x2;
	private float y2;
	private float z2;

	// direction from source to target
	private float xd;
	private float yd;
	private float zd;

	// distance from source to target
	private float d;

	private boolean terminated;

	final private Vector3f xdirection = new Vector3f(1,0 ,0);
	
	public void init(Line line, TransformGroup  transformGroup) {
		elapsed = 0.0f;
		this.transformGroup = transformGroup;
		
		if (transformGroup != null && line != null) {
			Point start = line.getStart();
			Point end = line.getEnd();
			if (start != null && end != null) {
				// hayaaaaa
				// TODO compute correct transformation and rotation
                  x1=start.getX();
                  y1=start.getY();
                  z1=0;// start.getz();
                  x2=end.getX();
                  y2=end.getY();
                  z2=0;// end.getz();
                  xd=x2-x1;
                  yd=y2-y1;
                  zd=z2-z1;
                  d=(float) Math.sqrt(xd*xd+yd*yd+zd*zd);
                  xd=xd/d;
                  yd=yd/d; // normalization so the direction of length 1
                  zd=zd/d;
                  //set the position of the object to the source point
                  transform=new Transform3D();
                  transform.setTranslation(new Vector3f(x1,y1,z1));
                  // set the direction of the object
                  Vector3f direction=new Vector3f(xd,yd,zd);
                  Vector3f axis=new Vector3f();
                  axis.cross(xdirection, direction);
                  axis.normalize();
                  if(Float.isNaN(axis.x)||Float.isNaN(axis.y)||Float.isNaN(axis.z)){
                	  axis.x=0;
                	  axis.y=0;
                	  axis.z=-1;
                	  
                  }
                  float angle=xdirection.angle(direction);
                  float sinAngle=(float) Math.sin(angle/2);
                  float a=axis.x*sinAngle;
                  float b=axis.y*sinAngle;
                  float c=axis.z*sinAngle;
                  float d=(float) Math.cos(angle/2);
                  Quat4f quat=new Quat4f(a,b,c,d);
                  transform.setRotation(quat);

			
				transformGroup.setTransform(transform);
			}
		}	
	}

    public boolean update(float delta) {
    	if (!terminated) {
    	   elapsed = elapsed + delta;
    	   if (elapsed * speed >= d) {
				transform.setTranslation(new Vector3f(x2,y2,z2));
				terminated = true;
    	   } else {
    		   float factor = elapsed * speed;
                   // haya TODO update transformation (translation to correct position)
    		   transform.setTranslation(new Vector3f(x1+factor*xd,y1+factor*yd,z1+factor*zd));
    		   transformGroup.setTransform(transform);
    	   }   	
    	}
    	
    	return terminated;
    }

    public boolean isTerminated() {
    	return terminated;
    }

	@Override
	public void terminate() {
		terminated = true;
	}

}

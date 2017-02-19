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

				// TODO compute correct transformation and rotation
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
                   // TODO update transformation (translation to correct position)
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

package dk.dtu.compute.se2.tutorial.engine;

import javax.media.j3d.TransformGroup;

import geometry.petri.geometry.Line;

public abstract class Animation {
	
	public abstract void init(Line line, TransformGroup transformGroup);
	
    public abstract boolean update(float delta);
    
    public abstract boolean isTerminated();
    
    public abstract void terminate();
	
}

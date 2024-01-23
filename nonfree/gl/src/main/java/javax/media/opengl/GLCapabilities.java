package javax.media.opengl;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("gl!javax/media/opengl/GLCapabilities")
public final class GLCapabilities implements Cloneable {

	@OriginalMember(owner = "gl!javax/media/opengl/GLCapabilities", name = "pbufferFloatingPointBuffers", descriptor = "Z")
	private boolean pbufferFloatingPointBuffers;

	@OriginalMember(owner = "gl!javax/media/opengl/GLCapabilities", name = "doubleBuffered", descriptor = "Z")
	private boolean doubleBuffered = true;

	@OriginalMember(owner = "gl!javax/media/opengl/GLCapabilities", name = "stereo", descriptor = "Z")
	private boolean stereo = false;

	@OriginalMember(owner = "gl!javax/media/opengl/GLCapabilities", name = "hardwareAccelerated", descriptor = "Z")
	private boolean hardwareAccelerated = true;

	@OriginalMember(owner = "gl!javax/media/opengl/GLCapabilities", name = "depthBits", descriptor = "I")
	private int depthBits = 24;

	@OriginalMember(owner = "gl!javax/media/opengl/GLCapabilities", name = "stencilBits", descriptor = "I")
	private int stencilBits = 0;

	@OriginalMember(owner = "gl!javax/media/opengl/GLCapabilities", name = "redBits", descriptor = "I")
	private int redBits = 8;

	@OriginalMember(owner = "gl!javax/media/opengl/GLCapabilities", name = "greenBits", descriptor = "I")
	private int greenBits = 8;

	@OriginalMember(owner = "gl!javax/media/opengl/GLCapabilities", name = "blueBits", descriptor = "I")
	private int blueBits = 8;

	@OriginalMember(owner = "gl!javax/media/opengl/GLCapabilities", name = "alphaBits", descriptor = "I")
	private int alphaBits = 0;

	@OriginalMember(owner = "gl!javax/media/opengl/GLCapabilities", name = "accumRedBits", descriptor = "I")
	private int accumRedBits = 0;

	@OriginalMember(owner = "gl!javax/media/opengl/GLCapabilities", name = "accumGreenBits", descriptor = "I")
	private int accumGreenBits = 0;

	@OriginalMember(owner = "gl!javax/media/opengl/GLCapabilities", name = "accumBlueBits", descriptor = "I")
	private int accumBlueBits = 0;

	@OriginalMember(owner = "gl!javax/media/opengl/GLCapabilities", name = "accumAlphaBits", descriptor = "I")
	private int accumAlphaBits = 0;

	@OriginalMember(owner = "gl!javax/media/opengl/GLCapabilities", name = "sampleBuffers", descriptor = "Z")
	private boolean sampleBuffers = false;

	@OriginalMember(owner = "gl!javax/media/opengl/GLCapabilities", name = "numSamples", descriptor = "I")
	private int numSamples = 2;

	@OriginalMember(owner = "gl!javax/media/opengl/GLCapabilities", name = "clone", descriptor = "()Ljava/lang/Object;")
	@Override
	public Object clone() {
		try {
			return super.clone();
		} catch (@Pc(3) CloneNotSupportedException local3) {
			throw new GLException(local3);
		}
	}

	@OriginalMember(owner = "gl!javax/media/opengl/GLCapabilities", name = "getDoubleBuffered", descriptor = "()Z")
	public boolean getDoubleBuffered() {
		return this.doubleBuffered;
	}

	@OriginalMember(owner = "gl!javax/media/opengl/GLCapabilities", name = "setDoubleBuffered", descriptor = "(Z)V")
	public void setDoubleBuffered(@OriginalArg(0) boolean arg0) {
		this.doubleBuffered = arg0;
	}

	@OriginalMember(owner = "gl!javax/media/opengl/GLCapabilities", name = "getStereo", descriptor = "()Z")
	public boolean getStereo() {
		return this.stereo;
	}

	@OriginalMember(owner = "gl!javax/media/opengl/GLCapabilities", name = "setStereo", descriptor = "(Z)V")
	public void setStereo(@OriginalArg(0) boolean arg0) {
		this.stereo = arg0;
	}

	@OriginalMember(owner = "gl!javax/media/opengl/GLCapabilities", name = "getHardwareAccelerated", descriptor = "()Z")
	public boolean getHardwareAccelerated() {
		return this.hardwareAccelerated;
	}

	@OriginalMember(owner = "gl!javax/media/opengl/GLCapabilities", name = "setHardwareAccelerated", descriptor = "(Z)V")
	public void setHardwareAccelerated(@OriginalArg(0) boolean arg0) {
		this.hardwareAccelerated = arg0;
	}

	@OriginalMember(owner = "gl!javax/media/opengl/GLCapabilities", name = "getDepthBits", descriptor = "()I")
	public int getDepthBits() {
		return this.depthBits;
	}

	@OriginalMember(owner = "gl!javax/media/opengl/GLCapabilities", name = "setDepthBits", descriptor = "(I)V")
	public void setDepthBits(@OriginalArg(0) int arg0) {
		this.depthBits = arg0;
	}

	@OriginalMember(owner = "gl!javax/media/opengl/GLCapabilities", name = "getStencilBits", descriptor = "()I")
	public int getStencilBits() {
		return this.stencilBits;
	}

	@OriginalMember(owner = "gl!javax/media/opengl/GLCapabilities", name = "setStencilBits", descriptor = "(I)V")
	public void setStencilBits(@OriginalArg(0) int arg0) {
		this.stencilBits = arg0;
	}

	@OriginalMember(owner = "gl!javax/media/opengl/GLCapabilities", name = "getRedBits", descriptor = "()I")
	public int getRedBits() {
		return this.redBits;
	}

	@OriginalMember(owner = "gl!javax/media/opengl/GLCapabilities", name = "setRedBits", descriptor = "(I)V")
	public void setRedBits(@OriginalArg(0) int arg0) {
		this.redBits = arg0;
	}

	@OriginalMember(owner = "gl!javax/media/opengl/GLCapabilities", name = "getGreenBits", descriptor = "()I")
	public int getGreenBits() {
		return this.greenBits;
	}

	@OriginalMember(owner = "gl!javax/media/opengl/GLCapabilities", name = "setGreenBits", descriptor = "(I)V")
	public void setGreenBits(@OriginalArg(0) int arg0) {
		this.greenBits = arg0;
	}

	@OriginalMember(owner = "gl!javax/media/opengl/GLCapabilities", name = "getBlueBits", descriptor = "()I")
	public int getBlueBits() {
		return this.blueBits;
	}

	@OriginalMember(owner = "gl!javax/media/opengl/GLCapabilities", name = "setBlueBits", descriptor = "(I)V")
	public void setBlueBits(@OriginalArg(0) int arg0) {
		this.blueBits = arg0;
	}

	@OriginalMember(owner = "gl!javax/media/opengl/GLCapabilities", name = "getAlphaBits", descriptor = "()I")
	public int getAlphaBits() {
		return this.alphaBits;
	}

	@OriginalMember(owner = "gl!javax/media/opengl/GLCapabilities", name = "setAlphaBits", descriptor = "(I)V")
	public void setAlphaBits(@OriginalArg(0) int arg0) {
		this.alphaBits = arg0;
	}

	@OriginalMember(owner = "gl!javax/media/opengl/GLCapabilities", name = "getAccumRedBits", descriptor = "()I")
	public int getAccumRedBits() {
		return this.accumRedBits;
	}

	@OriginalMember(owner = "gl!javax/media/opengl/GLCapabilities", name = "setAccumRedBits", descriptor = "(I)V")
	public void setAccumRedBits(@OriginalArg(0) int arg0) {
		this.accumRedBits = arg0;
	}

	@OriginalMember(owner = "gl!javax/media/opengl/GLCapabilities", name = "getAccumGreenBits", descriptor = "()I")
	public int getAccumGreenBits() {
		return this.accumGreenBits;
	}

	@OriginalMember(owner = "gl!javax/media/opengl/GLCapabilities", name = "setAccumGreenBits", descriptor = "(I)V")
	public void setAccumGreenBits(@OriginalArg(0) int arg0) {
		this.accumGreenBits = arg0;
	}

	@OriginalMember(owner = "gl!javax/media/opengl/GLCapabilities", name = "getAccumBlueBits", descriptor = "()I")
	public int getAccumBlueBits() {
		return this.accumBlueBits;
	}

	@OriginalMember(owner = "gl!javax/media/opengl/GLCapabilities", name = "setAccumBlueBits", descriptor = "(I)V")
	public void setAccumBlueBits(@OriginalArg(0) int arg0) {
		this.accumBlueBits = arg0;
	}

	@OriginalMember(owner = "gl!javax/media/opengl/GLCapabilities", name = "getAccumAlphaBits", descriptor = "()I")
	public int getAccumAlphaBits() {
		return this.accumAlphaBits;
	}

	@OriginalMember(owner = "gl!javax/media/opengl/GLCapabilities", name = "setAccumAlphaBits", descriptor = "(I)V")
	public void setAccumAlphaBits(@OriginalArg(0) int arg0) {
		this.accumAlphaBits = arg0;
	}

	@OriginalMember(owner = "gl!javax/media/opengl/GLCapabilities", name = "setSampleBuffers", descriptor = "(Z)V")
	public void setSampleBuffers(@OriginalArg(0) boolean arg0) {
		this.sampleBuffers = arg0;
	}

	@OriginalMember(owner = "gl!javax/media/opengl/GLCapabilities", name = "getSampleBuffers", descriptor = "()Z")
	public boolean getSampleBuffers() {
		return this.sampleBuffers;
	}

	@OriginalMember(owner = "gl!javax/media/opengl/GLCapabilities", name = "setNumSamples", descriptor = "(I)V")
	public void setNumSamples(@OriginalArg(0) int arg0) {
		this.numSamples = arg0;
	}

	@OriginalMember(owner = "gl!javax/media/opengl/GLCapabilities", name = "getNumSamples", descriptor = "()I")
	public int getNumSamples() {
		return this.numSamples;
	}

	@OriginalMember(owner = "gl!javax/media/opengl/GLCapabilities", name = "setPbufferFloatingPointBuffers", descriptor = "(Z)V")
	public void setPbufferFloatingPointBuffers(@OriginalArg(0) boolean arg0) {
		this.pbufferFloatingPointBuffers = arg0;
	}

	@OriginalMember(owner = "gl!javax/media/opengl/GLCapabilities", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "GLCapabilities [DoubleBuffered: " + this.doubleBuffered + ", Stereo: " + this.stereo + ", HardwareAccelerated: " + this.hardwareAccelerated + ", DepthBits: " + this.depthBits + ", StencilBits: " + this.stencilBits + ", Red: " + this.redBits + ", Green: " + this.greenBits + ", Blue: " + this.blueBits + ", Alpha: " + this.alphaBits + ", Red Accum: " + this.accumRedBits + ", Green Accum: " + this.accumGreenBits + ", Blue Accum: " + this.accumBlueBits + ", Alpha Accum: " + this.accumAlphaBits + ", Multisample: " + this.sampleBuffers + (this.sampleBuffers ? ", Num samples: " + this.numSamples : "") + " ]";
	}
}

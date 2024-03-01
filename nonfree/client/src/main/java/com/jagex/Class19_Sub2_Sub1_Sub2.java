package com.jagex;

import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aoy")
public class Class19_Sub2_Sub1_Sub2 extends Class19_Sub2_Sub1 {

	@OriginalMember(owner = "client!aoy", name = "x", descriptor = "I")
	int anInt2890;

	@OriginalMember(owner = "client!aoy", name = "h", descriptor = "I")
	int anInt2891;

	@OriginalMember(owner = "client!aoy", name = "a", descriptor = "Ljava/awt/Canvas;")
	final Canvas aCanvas5;

	@OriginalMember(owner = "client!aoy", name = "g", descriptor = "Lclient!jaggl/OpenGL;")
	final OpenGL anOpenGL4;

	@OriginalMember(owner = "client!aoy", name = "l", descriptor = "J")
	long aLong221;

	@OriginalMember(owner = "client!aoy", name = "<init>", descriptor = "(Lclient!akk;Ljava/awt/Canvas;)V", line = 17)
	Class19_Sub2_Sub1_Sub2(@OriginalArg(0) Class21_Sub3_Sub1 arg0, @OriginalArg(1) Canvas arg1) {
		this(arg0, arg1, arg0.anOpenGL2.prepareSurface(arg1));
	}

	@OriginalMember(owner = "client!aoy", name = "<init>", descriptor = "(Lclient!akk;Ljava/awt/Canvas;J)V", line = 21)
	Class19_Sub2_Sub1_Sub2(@OriginalArg(0) Class21_Sub3_Sub1 arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) long arg2) {
		super(arg0);
		this.aCanvas5 = arg1;
		this.anOpenGL4 = arg0.anOpenGL2;
		this.aLong221 = arg2;
		this.method21427();
	}

	@OriginalMember(owner = "client!aoy", name = "d", descriptor = "()I", line = 29)
	@Override
	public int method21405() {
		return this.anInt2891;
	}

	@OriginalMember(owner = "client!aoy", name = "p", descriptor = "()I", line = 29)
	@Override
	public int method21390() {
		return this.anInt2891;
	}

	@OriginalMember(owner = "client!aoy", name = "q", descriptor = "()I", line = 29)
	@Override
	public int method21389() {
		return this.anInt2891;
	}

	@OriginalMember(owner = "client!aoy", name = "a", descriptor = "()I", line = 33)
	@Override
	public int method21391() {
		return this.anInt2890;
	}

	@OriginalMember(owner = "client!aoy", name = "x", descriptor = "()I", line = 33)
	@Override
	public int method21394() {
		return this.anInt2890;
	}

	@OriginalMember(owner = "client!aoy", name = "s", descriptor = "()I", line = 33)
	@Override
	public int method21404() {
		return this.anInt2890;
	}

	@OriginalMember(owner = "client!aoy", name = "i", descriptor = "(II)V", line = 37)
	@Override
	void method21414(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aLong221 == 0L) {
			throw new IllegalStateException("");
		}
		this.anOpenGL4.surfaceResized(this.aLong221);
		this.method21427();
		super.method21414(arg0, arg1);
	}

	@OriginalMember(owner = "client!aoy", name = "f", descriptor = "(II)V", line = 37)
	@Override
	void method21415(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aLong221 == 0L) {
			throw new IllegalStateException("");
		}
		this.anOpenGL4.surfaceResized(this.aLong221);
		this.method21427();
		super.method21414(arg0, arg1);
	}

	@OriginalMember(owner = "client!aoy", name = "k", descriptor = "(II)V", line = 37)
	@Override
	void method21417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aLong221 == 0L) {
			throw new IllegalStateException("");
		}
		this.anOpenGL4.surfaceResized(this.aLong221);
		this.method21427();
		super.method21414(arg0, arg1);
	}

	@OriginalMember(owner = "client!aoy", name = "at", descriptor = "(II)V", line = 37)
	@Override
	void method21411(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aLong221 == 0L) {
			throw new IllegalStateException("");
		}
		this.anOpenGL4.surfaceResized(this.aLong221);
		this.method21427();
		super.method21414(arg0, arg1);
	}

	@OriginalMember(owner = "client!aoy", name = "m", descriptor = "()V", line = 44)
	void method21427() {
		@Pc(3) Dimension local3 = this.aCanvas5.getSize();
		this.anInt2890 = local3.height;
		this.anInt2891 = local3.width;
	}

	@OriginalMember(owner = "client!aoy", name = "v", descriptor = "()V", line = 44)
	void method21428() {
		@Pc(3) Dimension local3 = this.aCanvas5.getSize();
		this.anInt2890 = local3.height;
		this.anInt2891 = local3.width;
	}

	@OriginalMember(owner = "client!aoy", name = "w", descriptor = "()I", line = 50)
	@Override
	public int method21412() {
		if (this.aLong221 == 0L) {
			throw new IllegalStateException("");
		}
		this.anOpenGL4.swapBuffers(this.aLong221);
		return 0;
	}

	@OriginalMember(owner = "client!aoy", name = "af", descriptor = "()I", line = 50)
	@Override
	public int method21418() {
		if (this.aLong221 == 0L) {
			throw new IllegalStateException("");
		}
		this.anOpenGL4.swapBuffers(this.aLong221);
		return 0;
	}

	@OriginalMember(owner = "client!aoy", name = "ak", descriptor = "()I", line = 50)
	@Override
	public int method21419() {
		if (this.aLong221 == 0L) {
			throw new IllegalStateException("");
		}
		this.anOpenGL4.swapBuffers(this.aLong221);
		return 0;
	}

	@OriginalMember(owner = "client!aoy", name = "o", descriptor = "(II)I", line = 56)
	@Override
	public int method21413(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return 0;
	}

	@OriginalMember(owner = "client!aoy", name = "aa", descriptor = "(II)I", line = 56)
	@Override
	public int method21420(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return 0;
	}

	@OriginalMember(owner = "client!aoy", name = "ah", descriptor = "(II)I", line = 56)
	@Override
	public int method21416(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return 0;
	}

	@OriginalMember(owner = "client!aoy", name = "l", descriptor = "()Z", line = 60)
	@Override
	boolean method21393() {
		if (this.aLong221 == 0L) {
			throw new IllegalStateException("");
		}
		return this.anOpenGL4.setSurface(this.aLong221) && super.method21393();
	}

	@OriginalMember(owner = "client!aoy", name = "y", descriptor = "()Z", line = 60)
	@Override
	boolean method21397() {
		if (this.aLong221 == 0L) {
			throw new IllegalStateException("");
		}
		return this.anOpenGL4.setSurface(this.aLong221) && super.method21393();
	}

	@OriginalMember(owner = "client!aoy", name = "u", descriptor = "()Z", line = 60)
	@Override
	boolean method21396() {
		if (this.aLong221 == 0L) {
			throw new IllegalStateException("");
		}
		return this.anOpenGL4.setSurface(this.aLong221) && super.method21393();
	}

	@OriginalMember(owner = "client!aoy", name = "h", descriptor = "()Z", line = 65)
	@Override
	boolean method21400() {
		return true;
	}

	@OriginalMember(owner = "client!aoy", name = "z", descriptor = "()Z", line = 65)
	@Override
	boolean method21398() {
		return true;
	}

	@OriginalMember(owner = "client!aoy", name = "j", descriptor = "()Z", line = 65)
	@Override
	boolean method21401() {
		return true;
	}

	@OriginalMember(owner = "client!aoy", name = "c", descriptor = "()Z", line = 65)
	@Override
	boolean method21399() {
		return true;
	}

	@OriginalMember(owner = "client!aoy", name = "b", descriptor = "()Z", line = 65)
	@Override
	boolean method21403() {
		return true;
	}

	@OriginalMember(owner = "client!aoy", name = "g", descriptor = "()V", line = 69)
	@Override
	public void method21392() {
		if (this.aLong221 != 0L) {
			this.anOpenGL4.releaseSurface(this.aCanvas5, this.aLong221);
			this.aLong221 = 0L;
		}
	}

	@OriginalMember(owner = "client!aoy", name = "n", descriptor = "()V", line = 69)
	@Override
	public void method21402() {
		if (this.aLong221 != 0L) {
			this.anOpenGL4.releaseSurface(this.aCanvas5, this.aLong221);
			this.aLong221 = 0L;
		}
	}

	@OriginalMember(owner = "client!aoy", name = "e", descriptor = "()V", line = 69)
	@Override
	public void method21406() {
		if (this.aLong221 != 0L) {
			this.anOpenGL4.releaseSurface(this.aCanvas5, this.aLong221);
			this.aLong221 = 0L;
		}
	}

	@OriginalMember(owner = "client!aoy", name = "r", descriptor = "()V", line = 69)
	@Override
	public void method21395() {
		if (this.aLong221 != 0L) {
			this.anOpenGL4.releaseSurface(this.aCanvas5, this.aLong221);
			this.aLong221 = 0L;
		}
	}
}

package com.jagex;

import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aox")
public class Class92_Sub2_Sub3 extends Class92_Sub2 {

	@OriginalMember(owner = "client!aox", name = "q", descriptor = "Z")
	boolean aBoolean378;

	@OriginalMember(owner = "client!aox", name = "p", descriptor = "Lclient!aeq;")
	final Class86_Sub3 aClass86_Sub3_33;

	@OriginalMember(owner = "client!aox", name = "v", descriptor = "Lclient!jaggl/OpenGL;")
	final OpenGL anOpenGL2;

	@OriginalMember(owner = "client!aox", name = "l", descriptor = "J")
	final long aLong111;

	@OriginalMember(owner = "client!aox", name = "y", descriptor = "I")
	int anInt2541;

	@OriginalMember(owner = "client!aox", name = "w", descriptor = "I")
	int anInt2542;

	@OriginalMember(owner = "client!aox", name = "c", descriptor = "Ljava/awt/Canvas;")
	final Canvas aCanvas3;

	@OriginalMember(owner = "client!aox", name = "t", descriptor = "Z")
	boolean aBoolean379;

	@OriginalMember(owner = "client!aox", name = "<init>", descriptor = "(Lclient!aeq;Ljava/awt/Canvas;)V", line = 18)
	Class92_Sub2_Sub3(@OriginalArg(0) Class86_Sub3 arg0, @OriginalArg(1) Canvas arg1) {
		this(arg0, arg1, arg0.anOpenGL1.prepareSurface(arg1));
	}

	@OriginalMember(owner = "client!aox", name = "<init>", descriptor = "(Lclient!aeq;Ljava/awt/Canvas;J)V", line = 21)
	Class92_Sub2_Sub3(@OriginalArg(0) Class86_Sub3 arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) long arg2) {
		this.aBoolean379 = false;
		this.aBoolean378 = false;
		this.aClass86_Sub3_33 = arg0;
		this.aCanvas3 = arg1;
		this.anOpenGL2 = arg0.anOpenGL1;
		this.aLong111 = arg2;
		this.method18276();
	}

	@OriginalMember(owner = "client!aox", name = "p", descriptor = "()I", line = 30)
	@Override
	public int method23491() {
		return this.anInt2541;
	}

	@OriginalMember(owner = "client!aox", name = "w", descriptor = "()I", line = 30)
	@Override
	public int method23497() {
		return this.anInt2541;
	}

	@OriginalMember(owner = "client!aox", name = "t", descriptor = "()I", line = 34)
	@Override
	public int method23498() {
		return this.anInt2542;
	}

	@OriginalMember(owner = "client!aox", name = "q", descriptor = "()I", line = 34)
	@Override
	public int method23499() {
		return this.anInt2542;
	}

	@OriginalMember(owner = "client!aox", name = "c", descriptor = "()I", line = 34)
	@Override
	public int method23493() {
		return this.anInt2542;
	}

	@OriginalMember(owner = "client!aox", name = "m", descriptor = "(II)V", line = 38)
	@Override
	void method23350(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean379) {
			throw new IllegalStateException();
		}
		this.anOpenGL2.surfaceResized(this.aLong111);
		this.method18276();
		if (this.aClass86_Sub3_33.method19940() == this) {
			this.aClass86_Sub3_33.method6053();
		}
	}

	@OriginalMember(owner = "client!aox", name = "h", descriptor = "(II)V", line = 38)
	@Override
	void method23351(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean379) {
			throw new IllegalStateException();
		}
		this.anOpenGL2.surfaceResized(this.aLong111);
		this.method18276();
		if (this.aClass86_Sub3_33.method19940() == this) {
			this.aClass86_Sub3_33.method6053();
		}
	}

	@OriginalMember(owner = "client!aox", name = "e", descriptor = "()V", line = 45)
	void method18276() {
		@Pc(3) Dimension local3 = this.aCanvas3.getSize();
		this.anInt2542 = local3.height;
		this.anInt2541 = local3.width;
	}

	@OriginalMember(owner = "client!aox", name = "f", descriptor = "()V", line = 45)
	void method18277() {
		@Pc(3) Dimension local3 = this.aCanvas3.getSize();
		this.anInt2542 = local3.height;
		this.anInt2541 = local3.width;
	}

	@OriginalMember(owner = "client!aox", name = "o", descriptor = "()V", line = 45)
	void method18278() {
		@Pc(3) Dimension local3 = this.aCanvas3.getSize();
		this.anInt2542 = local3.height;
		this.anInt2541 = local3.width;
	}

	@OriginalMember(owner = "client!aox", name = "b", descriptor = "()V", line = 45)
	void method18279() {
		@Pc(3) Dimension local3 = this.aCanvas3.getSize();
		this.anInt2542 = local3.height;
		this.anInt2541 = local3.width;
	}

	@OriginalMember(owner = "client!aox", name = "n", descriptor = "()I", line = 51)
	@Override
	public int method23348() {
		if (this.aBoolean379) {
			throw new IllegalStateException();
		}
		this.anOpenGL2.swapBuffers(this.aLong111);
		return 0;
	}

	@OriginalMember(owner = "client!aox", name = "al", descriptor = "()I", line = 51)
	@Override
	public int method23354() {
		if (this.aBoolean379) {
			throw new IllegalStateException();
		}
		this.anOpenGL2.swapBuffers(this.aLong111);
		return 0;
	}

	@OriginalMember(owner = "client!aox", name = "ag", descriptor = "()I", line = 51)
	@Override
	public int method23355() {
		if (this.aBoolean379) {
			throw new IllegalStateException();
		}
		this.anOpenGL2.swapBuffers(this.aLong111);
		return 0;
	}

	@OriginalMember(owner = "client!aox", name = "aj", descriptor = "()I", line = 51)
	@Override
	public int method23352() {
		if (this.aBoolean379) {
			throw new IllegalStateException();
		}
		this.anOpenGL2.swapBuffers(this.aLong111);
		return 0;
	}

	@OriginalMember(owner = "client!aox", name = "ai", descriptor = "()I", line = 51)
	@Override
	public int method23347() {
		if (this.aBoolean379) {
			throw new IllegalStateException();
		}
		this.anOpenGL2.swapBuffers(this.aLong111);
		return 0;
	}

	@OriginalMember(owner = "client!aox", name = "a", descriptor = "(II)I", line = 57)
	@Override
	public int method23349(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return 0;
	}

	@OriginalMember(owner = "client!aox", name = "ao", descriptor = "(II)I", line = 57)
	@Override
	public int method23353(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return 0;
	}

	@OriginalMember(owner = "client!aox", name = "l", descriptor = "()Z", line = 61)
	@Override
	boolean method23508() {
		if (this.aBoolean379) {
			throw new IllegalStateException();
		}
		if (!this.aBoolean378) {
			this.anOpenGL2.setSurface(this.aLong111);
			this.aBoolean378 = true;
		}
		this.aClass86_Sub3_33.method6048();
		return true;
	}

	@OriginalMember(owner = "client!aox", name = "x", descriptor = "()Z", line = 61)
	@Override
	boolean method23500() {
		if (this.aBoolean379) {
			throw new IllegalStateException();
		}
		if (!this.aBoolean378) {
			this.anOpenGL2.setSurface(this.aLong111);
			this.aBoolean378 = true;
		}
		this.aClass86_Sub3_33.method6048();
		return true;
	}

	@OriginalMember(owner = "client!aox", name = "s", descriptor = "()Z", line = 61)
	@Override
	boolean method23494() {
		if (this.aBoolean379) {
			throw new IllegalStateException();
		}
		if (!this.aBoolean378) {
			this.anOpenGL2.setSurface(this.aLong111);
			this.aBoolean378 = true;
		}
		this.aClass86_Sub3_33.method6048();
		return true;
	}

	@OriginalMember(owner = "client!aox", name = "r", descriptor = "()Z", line = 61)
	@Override
	boolean method23495() {
		if (this.aBoolean379) {
			throw new IllegalStateException();
		}
		if (!this.aBoolean378) {
			this.anOpenGL2.setSurface(this.aLong111);
			this.aBoolean378 = true;
		}
		this.aClass86_Sub3_33.method6048();
		return true;
	}

	@OriginalMember(owner = "client!aox", name = "d", descriptor = "()Z", line = 61)
	@Override
	boolean method23492() {
		if (this.aBoolean379) {
			throw new IllegalStateException();
		}
		if (!this.aBoolean378) {
			this.anOpenGL2.setSurface(this.aLong111);
			this.aBoolean378 = true;
		}
		this.aClass86_Sub3_33.method6048();
		return true;
	}

	@OriginalMember(owner = "client!aox", name = "y", descriptor = "()Z", line = 71)
	@Override
	boolean method23496() {
		return true;
	}

	@OriginalMember(owner = "client!aox", name = "z", descriptor = "()Z", line = 71)
	@Override
	boolean method23504() {
		return true;
	}

	@OriginalMember(owner = "client!aox", name = "j", descriptor = "()Z", line = 71)
	@Override
	boolean method23505() {
		return true;
	}

	@OriginalMember(owner = "client!aox", name = "g", descriptor = "()Z", line = 71)
	@Override
	boolean method23503() {
		return true;
	}

	@OriginalMember(owner = "client!aox", name = "v", descriptor = "()V", line = 75)
	@Override
	public void method23506() {
		if (this.aBoolean379) {
			throw new IllegalStateException();
		}
		this.anOpenGL2.releaseSurface(this.aCanvas3, this.aLong111);
		this.aBoolean379 = true;
		this.aBoolean378 = false;
	}

	@OriginalMember(owner = "client!aox", name = "i", descriptor = "()V", line = 75)
	@Override
	public void method23502() {
		if (this.aBoolean379) {
			throw new IllegalStateException();
		}
		this.anOpenGL2.releaseSurface(this.aCanvas3, this.aLong111);
		this.aBoolean379 = true;
		this.aBoolean378 = false;
	}

	@OriginalMember(owner = "client!aox", name = "k", descriptor = "()V", line = 75)
	@Override
	public void method23507() {
		if (this.aBoolean379) {
			throw new IllegalStateException();
		}
		this.anOpenGL2.releaseSurface(this.aCanvas3, this.aLong111);
		this.aBoolean379 = true;
		this.aBoolean378 = false;
	}

	@OriginalMember(owner = "client!aox", name = "u", descriptor = "()V", line = 75)
	@Override
	public void method23501() {
		if (this.aBoolean379) {
			throw new IllegalStateException();
		}
		this.anOpenGL2.releaseSurface(this.aCanvas3, this.aLong111);
		this.aBoolean379 = true;
		this.aBoolean378 = false;
	}
}

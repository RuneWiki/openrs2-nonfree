package com.jagex;

import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!asq")
public class Class92_Sub2_Sub1_Sub2 extends Class92_Sub2_Sub1 {

	@OriginalMember(owner = "client!asq", name = "t", descriptor = "Z")
	boolean aBoolean509;

	@OriginalMember(owner = "client!asq", name = "v", descriptor = "Lclient!jaggl/OpenGL;")
	final OpenGL anOpenGL4;

	@OriginalMember(owner = "client!asq", name = "l", descriptor = "J")
	long aLong211;

	@OriginalMember(owner = "client!asq", name = "y", descriptor = "I")
	int anInt3151;

	@OriginalMember(owner = "client!asq", name = "w", descriptor = "I")
	int anInt3152;

	@OriginalMember(owner = "client!asq", name = "c", descriptor = "Ljava/awt/Canvas;")
	final Canvas aCanvas5;

	@OriginalMember(owner = "client!asq", name = "<init>", descriptor = "(Lclient!apr;Ljava/awt/Canvas;)V", line = 18)
	Class92_Sub2_Sub1_Sub2(@OriginalArg(0) Class86_Sub1_Sub2 arg0, @OriginalArg(1) Canvas arg1) {
		this(arg0, arg1, arg0.anOpenGL3.prepareSurface(arg1));
	}

	@OriginalMember(owner = "client!asq", name = "<init>", descriptor = "(Lclient!apr;Ljava/awt/Canvas;J)V", line = 22)
	Class92_Sub2_Sub1_Sub2(@OriginalArg(0) Class86_Sub1_Sub2 arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) long arg2) {
		super(arg0);
		this.aBoolean509 = false;
		this.aCanvas5 = arg1;
		this.anOpenGL4 = arg0.anOpenGL3;
		this.aLong211 = arg2;
		this.method23356();
	}

	@OriginalMember(owner = "client!asq", name = "p", descriptor = "()I", line = 30)
	@Override
	public int method23491() {
		return this.anInt3151;
	}

	@OriginalMember(owner = "client!asq", name = "w", descriptor = "()I", line = 30)
	@Override
	public int method23497() {
		return this.anInt3151;
	}

	@OriginalMember(owner = "client!asq", name = "c", descriptor = "()I", line = 34)
	@Override
	public int method23493() {
		return this.anInt3152;
	}

	@OriginalMember(owner = "client!asq", name = "t", descriptor = "()I", line = 34)
	@Override
	public int method23498() {
		return this.anInt3152;
	}

	@OriginalMember(owner = "client!asq", name = "q", descriptor = "()I", line = 34)
	@Override
	public int method23499() {
		return this.anInt3152;
	}

	@OriginalMember(owner = "client!asq", name = "m", descriptor = "(II)V", line = 38)
	@Override
	void method23350(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aLong211 == 0L) {
			throw new IllegalStateException("");
		}
		this.anOpenGL4.surfaceResized(this.aLong211);
		this.method23356();
		super.method23350(arg0, arg1);
	}

	@OriginalMember(owner = "client!asq", name = "h", descriptor = "(II)V", line = 38)
	@Override
	void method23351(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aLong211 == 0L) {
			throw new IllegalStateException("");
		}
		this.anOpenGL4.surfaceResized(this.aLong211);
		this.method23356();
		super.method23350(arg0, arg1);
	}

	@OriginalMember(owner = "client!asq", name = "e", descriptor = "()V", line = 45)
	void method23356() {
		@Pc(3) Dimension local3 = this.aCanvas5.getSize();
		this.anInt3152 = local3.height;
		this.anInt3151 = local3.width;
	}

	@OriginalMember(owner = "client!asq", name = "b", descriptor = "()V", line = 45)
	void method23357() {
		@Pc(3) Dimension local3 = this.aCanvas5.getSize();
		this.anInt3152 = local3.height;
		this.anInt3151 = local3.width;
	}

	@OriginalMember(owner = "client!asq", name = "f", descriptor = "()V", line = 45)
	void method23358() {
		@Pc(3) Dimension local3 = this.aCanvas5.getSize();
		this.anInt3152 = local3.height;
		this.anInt3151 = local3.width;
	}

	@OriginalMember(owner = "client!asq", name = "o", descriptor = "()V", line = 45)
	void method23359() {
		@Pc(3) Dimension local3 = this.aCanvas5.getSize();
		this.anInt3152 = local3.height;
		this.anInt3151 = local3.width;
	}

	@OriginalMember(owner = "client!asq", name = "n", descriptor = "()I", line = 51)
	@Override
	public int method23348() {
		if (this.aLong211 == 0L) {
			throw new IllegalStateException("");
		}
		this.anOpenGL4.swapBuffers(this.aLong211);
		return 0;
	}

	@OriginalMember(owner = "client!asq", name = "aj", descriptor = "()I", line = 51)
	@Override
	public int method23352() {
		if (this.aLong211 == 0L) {
			throw new IllegalStateException("");
		}
		this.anOpenGL4.swapBuffers(this.aLong211);
		return 0;
	}

	@OriginalMember(owner = "client!asq", name = "ai", descriptor = "()I", line = 51)
	@Override
	public int method23347() {
		if (this.aLong211 == 0L) {
			throw new IllegalStateException("");
		}
		this.anOpenGL4.swapBuffers(this.aLong211);
		return 0;
	}

	@OriginalMember(owner = "client!asq", name = "ag", descriptor = "()I", line = 51)
	@Override
	public int method23355() {
		if (this.aLong211 == 0L) {
			throw new IllegalStateException("");
		}
		this.anOpenGL4.swapBuffers(this.aLong211);
		return 0;
	}

	@OriginalMember(owner = "client!asq", name = "al", descriptor = "()I", line = 51)
	@Override
	public int method23354() {
		if (this.aLong211 == 0L) {
			throw new IllegalStateException("");
		}
		this.anOpenGL4.swapBuffers(this.aLong211);
		return 0;
	}

	@OriginalMember(owner = "client!asq", name = "ao", descriptor = "(II)I", line = 57)
	@Override
	public int method23353(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return 0;
	}

	@OriginalMember(owner = "client!asq", name = "a", descriptor = "(II)I", line = 57)
	@Override
	public int method23349(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return 0;
	}

	@OriginalMember(owner = "client!asq", name = "x", descriptor = "()Z", line = 61)
	@Override
	boolean method23500() {
		if (this.aLong211 == 0L) {
			throw new IllegalStateException("");
		}
		@Pc(11) boolean local11 = true;
		if (!this.aBoolean509) {
			local11 = this.anOpenGL4.setSurface(this.aLong211);
			this.aBoolean509 = true;
		}
		return local11 && super.method23508();
	}

	@OriginalMember(owner = "client!asq", name = "l", descriptor = "()Z", line = 61)
	@Override
	boolean method23508() {
		if (this.aLong211 == 0L) {
			throw new IllegalStateException("");
		}
		@Pc(11) boolean local11 = true;
		if (!this.aBoolean509) {
			local11 = this.anOpenGL4.setSurface(this.aLong211);
			this.aBoolean509 = true;
		}
		return local11 && super.method23508();
	}

	@OriginalMember(owner = "client!asq", name = "d", descriptor = "()Z", line = 61)
	@Override
	boolean method23492() {
		if (this.aLong211 == 0L) {
			throw new IllegalStateException("");
		}
		@Pc(11) boolean local11 = true;
		if (!this.aBoolean509) {
			local11 = this.anOpenGL4.setSurface(this.aLong211);
			this.aBoolean509 = true;
		}
		return local11 && super.method23508();
	}

	@OriginalMember(owner = "client!asq", name = "r", descriptor = "()Z", line = 61)
	@Override
	boolean method23495() {
		if (this.aLong211 == 0L) {
			throw new IllegalStateException("");
		}
		@Pc(11) boolean local11 = true;
		if (!this.aBoolean509) {
			local11 = this.anOpenGL4.setSurface(this.aLong211);
			this.aBoolean509 = true;
		}
		return local11 && super.method23508();
	}

	@OriginalMember(owner = "client!asq", name = "s", descriptor = "()Z", line = 61)
	@Override
	boolean method23494() {
		if (this.aLong211 == 0L) {
			throw new IllegalStateException("");
		}
		@Pc(11) boolean local11 = true;
		if (!this.aBoolean509) {
			local11 = this.anOpenGL4.setSurface(this.aLong211);
			this.aBoolean509 = true;
		}
		return local11 && super.method23508();
	}

	@OriginalMember(owner = "client!asq", name = "z", descriptor = "()Z", line = 71)
	@Override
	boolean method23504() {
		return true;
	}

	@OriginalMember(owner = "client!asq", name = "y", descriptor = "()Z", line = 71)
	@Override
	boolean method23496() {
		return true;
	}

	@OriginalMember(owner = "client!asq", name = "g", descriptor = "()Z", line = 71)
	@Override
	boolean method23503() {
		return true;
	}

	@OriginalMember(owner = "client!asq", name = "j", descriptor = "()Z", line = 71)
	@Override
	boolean method23505() {
		return true;
	}

	@OriginalMember(owner = "client!asq", name = "v", descriptor = "()V", line = 75)
	@Override
	public void method23506() {
		if (this.aLong211 != 0L) {
			this.anOpenGL4.releaseSurface(this.aCanvas5, this.aLong211);
			this.aLong211 = 0L;
		}
	}

	@OriginalMember(owner = "client!asq", name = "k", descriptor = "()V", line = 75)
	@Override
	public void method23507() {
		if (this.aLong211 != 0L) {
			this.anOpenGL4.releaseSurface(this.aCanvas5, this.aLong211);
			this.aLong211 = 0L;
		}
	}

	@OriginalMember(owner = "client!asq", name = "i", descriptor = "()V", line = 75)
	@Override
	public void method23502() {
		if (this.aLong211 != 0L) {
			this.anOpenGL4.releaseSurface(this.aCanvas5, this.aLong211);
			this.aLong211 = 0L;
		}
	}

	@OriginalMember(owner = "client!asq", name = "u", descriptor = "()V", line = 75)
	@Override
	public void method23501() {
		if (this.aLong211 != 0L) {
			this.anOpenGL4.releaseSurface(this.aCanvas5, this.aLong211);
			this.aLong211 = 0L;
		}
	}
}

package com.jagex;

import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!akz")
public class Class19_Sub2_Sub3 extends Class19_Sub2 {

	@OriginalMember(owner = "client!akz", name = "x", descriptor = "I")
	int anInt2544;

	@OriginalMember(owner = "client!akz", name = "h", descriptor = "I")
	int anInt2545;

	@OriginalMember(owner = "client!akz", name = "s", descriptor = "Z")
	boolean aBoolean460;

	@OriginalMember(owner = "client!akz", name = "p", descriptor = "Lclient!abt;")
	final Class21_Sub2 aClass21_Sub2_34;

	@OriginalMember(owner = "client!akz", name = "a", descriptor = "Ljava/awt/Canvas;")
	final Canvas aCanvas3;

	@OriginalMember(owner = "client!akz", name = "g", descriptor = "Lclient!jaggl/OpenGL;")
	final OpenGL anOpenGL3;

	@OriginalMember(owner = "client!akz", name = "l", descriptor = "J")
	final long aLong108;

	@OriginalMember(owner = "client!akz", name = "<init>", descriptor = "(Lclient!abt;Ljava/awt/Canvas;)V", line = 17)
	Class19_Sub2_Sub3(@OriginalArg(0) Class21_Sub2 arg0, @OriginalArg(1) Canvas arg1) {
		this(arg0, arg1, arg0.anOpenGL1.prepareSurface(arg1));
	}

	@OriginalMember(owner = "client!akz", name = "<init>", descriptor = "(Lclient!abt;Ljava/awt/Canvas;J)V", line = 20)
	Class19_Sub2_Sub3(@OriginalArg(0) Class21_Sub2 arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) long arg2) {
		this.aBoolean460 = false;
		this.aClass21_Sub2_34 = arg0;
		this.aCanvas3 = arg1;
		this.anOpenGL3 = arg0.anOpenGL1;
		this.aLong108 = arg2;
		this.method17997();
	}

	@OriginalMember(owner = "client!akz", name = "p", descriptor = "()I", line = 29)
	@Override
	public int method21390() {
		return this.anInt2545;
	}

	@OriginalMember(owner = "client!akz", name = "d", descriptor = "()I", line = 29)
	@Override
	public int method21405() {
		return this.anInt2545;
	}

	@OriginalMember(owner = "client!akz", name = "q", descriptor = "()I", line = 29)
	@Override
	public int method21389() {
		return this.anInt2545;
	}

	@OriginalMember(owner = "client!akz", name = "x", descriptor = "()I", line = 33)
	@Override
	public int method21394() {
		return this.anInt2544;
	}

	@OriginalMember(owner = "client!akz", name = "s", descriptor = "()I", line = 33)
	@Override
	public int method21404() {
		return this.anInt2544;
	}

	@OriginalMember(owner = "client!akz", name = "a", descriptor = "()I", line = 33)
	@Override
	public int method21391() {
		return this.anInt2544;
	}

	@OriginalMember(owner = "client!akz", name = "i", descriptor = "(II)V", line = 37)
	@Override
	void method21414(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean460) {
			throw new IllegalStateException();
		}
		this.anOpenGL3.surfaceResized(this.aLong108);
		this.method17997();
		if (this.aClass21_Sub2_34.method17037() == this) {
			this.aClass21_Sub2_34.method4029();
		}
	}

	@OriginalMember(owner = "client!akz", name = "f", descriptor = "(II)V", line = 37)
	@Override
	void method21415(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean460) {
			throw new IllegalStateException();
		}
		this.anOpenGL3.surfaceResized(this.aLong108);
		this.method17997();
		if (this.aClass21_Sub2_34.method17037() == this) {
			this.aClass21_Sub2_34.method4029();
		}
	}

	@OriginalMember(owner = "client!akz", name = "k", descriptor = "(II)V", line = 37)
	@Override
	void method21417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean460) {
			throw new IllegalStateException();
		}
		this.anOpenGL3.surfaceResized(this.aLong108);
		this.method17997();
		if (this.aClass21_Sub2_34.method17037() == this) {
			this.aClass21_Sub2_34.method4029();
		}
	}

	@OriginalMember(owner = "client!akz", name = "at", descriptor = "(II)V", line = 37)
	@Override
	void method21411(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean460) {
			throw new IllegalStateException();
		}
		this.anOpenGL3.surfaceResized(this.aLong108);
		this.method17997();
		if (this.aClass21_Sub2_34.method17037() == this) {
			this.aClass21_Sub2_34.method4029();
		}
	}

	@OriginalMember(owner = "client!akz", name = "v", descriptor = "()V", line = 44)
	void method17996() {
		@Pc(3) Dimension local3 = this.aCanvas3.getSize();
		this.anInt2544 = local3.height;
		this.anInt2545 = local3.width;
	}

	@OriginalMember(owner = "client!akz", name = "m", descriptor = "()V", line = 44)
	void method17997() {
		@Pc(3) Dimension local3 = this.aCanvas3.getSize();
		this.anInt2544 = local3.height;
		this.anInt2545 = local3.width;
	}

	@OriginalMember(owner = "client!akz", name = "w", descriptor = "()I", line = 50)
	@Override
	public int method21412() {
		if (this.aBoolean460) {
			throw new IllegalStateException();
		}
		this.anOpenGL3.swapBuffers(this.aLong108);
		return 0;
	}

	@OriginalMember(owner = "client!akz", name = "af", descriptor = "()I", line = 50)
	@Override
	public int method21418() {
		if (this.aBoolean460) {
			throw new IllegalStateException();
		}
		this.anOpenGL3.swapBuffers(this.aLong108);
		return 0;
	}

	@OriginalMember(owner = "client!akz", name = "ak", descriptor = "()I", line = 50)
	@Override
	public int method21419() {
		if (this.aBoolean460) {
			throw new IllegalStateException();
		}
		this.anOpenGL3.swapBuffers(this.aLong108);
		return 0;
	}

	@OriginalMember(owner = "client!akz", name = "o", descriptor = "(II)I", line = 56)
	@Override
	public int method21413(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return 0;
	}

	@OriginalMember(owner = "client!akz", name = "aa", descriptor = "(II)I", line = 56)
	@Override
	public int method21420(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return 0;
	}

	@OriginalMember(owner = "client!akz", name = "ah", descriptor = "(II)I", line = 56)
	@Override
	public int method21416(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return 0;
	}

	@OriginalMember(owner = "client!akz", name = "l", descriptor = "()Z", line = 60)
	@Override
	boolean method21393() {
		if (this.aBoolean460) {
			throw new IllegalStateException();
		}
		this.anOpenGL3.setSurface(this.aLong108);
		this.aClass21_Sub2_34.method4028();
		return true;
	}

	@OriginalMember(owner = "client!akz", name = "u", descriptor = "()Z", line = 60)
	@Override
	boolean method21396() {
		if (this.aBoolean460) {
			throw new IllegalStateException();
		}
		this.anOpenGL3.setSurface(this.aLong108);
		this.aClass21_Sub2_34.method4028();
		return true;
	}

	@OriginalMember(owner = "client!akz", name = "y", descriptor = "()Z", line = 60)
	@Override
	boolean method21397() {
		if (this.aBoolean460) {
			throw new IllegalStateException();
		}
		this.anOpenGL3.setSurface(this.aLong108);
		this.aClass21_Sub2_34.method4028();
		return true;
	}

	@OriginalMember(owner = "client!akz", name = "h", descriptor = "()Z", line = 67)
	@Override
	boolean method21400() {
		return true;
	}

	@OriginalMember(owner = "client!akz", name = "b", descriptor = "()Z", line = 67)
	@Override
	boolean method21403() {
		return true;
	}

	@OriginalMember(owner = "client!akz", name = "z", descriptor = "()Z", line = 67)
	@Override
	boolean method21398() {
		return true;
	}

	@OriginalMember(owner = "client!akz", name = "j", descriptor = "()Z", line = 67)
	@Override
	boolean method21401() {
		return true;
	}

	@OriginalMember(owner = "client!akz", name = "c", descriptor = "()Z", line = 67)
	@Override
	boolean method21399() {
		return true;
	}

	@OriginalMember(owner = "client!akz", name = "r", descriptor = "()V", line = 71)
	@Override
	public void method21395() {
		if (this.aBoolean460) {
			throw new IllegalStateException();
		}
		this.anOpenGL3.releaseSurface(this.aCanvas3, this.aLong108);
		this.aBoolean460 = true;
	}

	@OriginalMember(owner = "client!akz", name = "g", descriptor = "()V", line = 71)
	@Override
	public void method21392() {
		if (this.aBoolean460) {
			throw new IllegalStateException();
		}
		this.anOpenGL3.releaseSurface(this.aCanvas3, this.aLong108);
		this.aBoolean460 = true;
	}

	@OriginalMember(owner = "client!akz", name = "e", descriptor = "()V", line = 71)
	@Override
	public void method21406() {
		if (this.aBoolean460) {
			throw new IllegalStateException();
		}
		this.anOpenGL3.releaseSurface(this.aCanvas3, this.aLong108);
		this.aBoolean460 = true;
	}

	@OriginalMember(owner = "client!akz", name = "n", descriptor = "()V", line = 71)
	@Override
	public void method21402() {
		if (this.aBoolean460) {
			throw new IllegalStateException();
		}
		this.anOpenGL3.releaseSurface(this.aCanvas3, this.aLong108);
		this.aBoolean460 = true;
	}
}

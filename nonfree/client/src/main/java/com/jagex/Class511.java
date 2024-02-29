package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rj")
public class Class511 implements Interface21, Interface20, Interface56 {

	@OriginalMember(owner = "client!rj", name = "c", descriptor = "Lclient!dt;")
	final Class212 aClass212_28;

	@OriginalMember(owner = "client!rj", name = "p", descriptor = "Lclient!dl;")
	final Class206 aClass206_33;

	@OriginalMember(owner = "client!rj", name = "v", descriptor = "I")
	final int anInt5108;

	@OriginalMember(owner = "client!rj", name = "l", descriptor = "I")
	final int anInt5106;

	@OriginalMember(owner = "client!rj", name = "y", descriptor = "Lclient!apr;")
	final Class86_Sub1_Sub2 aClass86_Sub1_Sub2_11;

	@OriginalMember(owner = "client!rj", name = "w", descriptor = "I")
	int anInt5107;

	@OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(Lclient!apr;Lclient!dt;Lclient!dl;II)V", line = 16)
	Class511(@OriginalArg(0) Class86_Sub1_Sub2 arg0, @OriginalArg(1) Class212 arg1, @OriginalArg(2) Class206 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass212_28 = arg1;
		this.aClass206_33 = arg2;
		this.anInt5108 = arg3;
		this.anInt5106 = arg4;
		this.aClass86_Sub1_Sub2_11 = arg0;
		@Pc(19) int[] local19 = new int[1];
		OpenGL.glGenRenderbuffersEXT(1, local19, 0);
		this.anInt5107 = local19[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt5107);
		OpenGL.glRenderbufferStorageEXT(36161, Class86_Sub1_Sub2.method20812(this.aClass212_28, this.aClass206_33), arg3, arg4);
	}

	@OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(Lclient!apr;Lclient!dt;Lclient!dl;III)V", line = 29)
	Class511(@OriginalArg(0) Class86_Sub1_Sub2 arg0, @OriginalArg(1) Class212 arg1, @OriginalArg(2) Class206 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass212_28 = arg1;
		this.aClass206_33 = arg2;
		this.anInt5108 = arg3;
		this.anInt5106 = arg4;
		this.aClass86_Sub1_Sub2_11 = arg0;
		@Pc(19) int[] local19 = new int[1];
		OpenGL.glGenRenderbuffersEXT(1, local19, 0);
		this.anInt5107 = local19[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt5107);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg5, Class86_Sub1_Sub2.method20812(this.aClass212_28, this.aClass206_33), arg3, arg4);
	}

	@OriginalMember(owner = "client!rj", name = "y", descriptor = "()I", line = 43)
	@Override
	public int method30326() {
		return this.anInt5108;
	}

	@OriginalMember(owner = "client!rj", name = "p", descriptor = "()I", line = 43)
	@Override
	public int method30324() {
		return this.anInt5108;
	}

	@OriginalMember(owner = "client!rj", name = "l", descriptor = "()I", line = 43)
	@Override
	public int method30325() {
		return this.anInt5108;
	}

	@OriginalMember(owner = "client!rj", name = "q", descriptor = "()I", line = 47)
	@Override
	public int method30330() {
		return this.anInt5106;
	}

	@OriginalMember(owner = "client!rj", name = "t", descriptor = "()I", line = 47)
	@Override
	public int method30328() {
		return this.anInt5106;
	}

	@OriginalMember(owner = "client!rj", name = "c", descriptor = "()I", line = 47)
	@Override
	public int method30329() {
		return this.anInt5106;
	}

	@OriginalMember(owner = "client!rj", name = "w", descriptor = "()I", line = 47)
	@Override
	public int method30323() {
		return this.anInt5106;
	}

	@OriginalMember(owner = "client!rj", name = "x", descriptor = "()I", line = 47)
	@Override
	public int method30327() {
		return this.anInt5106;
	}

	@OriginalMember(owner = "client!rj", name = "d", descriptor = "()I", line = 47)
	@Override
	public int method30331() {
		return this.anInt5106;
	}

	@OriginalMember(owner = "client!rj", name = "z", descriptor = "(I)V", line = 51)
	@Override
	public void method30332(@OriginalArg(0) int arg0) {
		OpenGL.glFramebufferRenderbufferEXT(36160, arg0, 36161, this.anInt5107);
	}

	@OriginalMember(owner = "client!rj", name = "j", descriptor = "(I)V", line = 51)
	@Override
	public void method30333(@OriginalArg(0) int arg0) {
		OpenGL.glFramebufferRenderbufferEXT(36160, arg0, 36161, this.anInt5107);
	}

	@OriginalMember(owner = "client!rj", name = "v", descriptor = "()V", line = 55)
	@Override
	public void method30322() {
		if (this.anInt5107 != 0) {
			@Pc(5) int[] local5 = new int[] { this.anInt5107 };
			OpenGL.glDeleteRenderbuffersEXT(1, local5, 0);
			this.anInt5107 = 0;
		}
	}

	@OriginalMember(owner = "client!rj", name = "s", descriptor = "()V", line = 55)
	@Override
	public void method30320() {
		if (this.anInt5107 != 0) {
			@Pc(5) int[] local5 = new int[] { this.anInt5107 };
			OpenGL.glDeleteRenderbuffersEXT(1, local5, 0);
			this.anInt5107 = 0;
		}
	}

	@OriginalMember(owner = "client!rj", name = "r", descriptor = "()V", line = 55)
	@Override
	public void method30321() {
		if (this.anInt5107 != 0) {
			@Pc(5) int[] local5 = new int[] { this.anInt5107 };
			OpenGL.glDeleteRenderbuffersEXT(1, local5, 0);
			this.anInt5107 = 0;
		}
	}

	@OriginalMember(owner = "client!rj", name = "g", descriptor = "()V", line = 55)
	@Override
	public void method30319() {
		if (this.anInt5107 != 0) {
			@Pc(5) int[] local5 = new int[] { this.anInt5107 };
			OpenGL.glDeleteRenderbuffersEXT(1, local5, 0);
			this.anInt5107 = 0;
		}
	}

	@OriginalMember(owner = "client!rj", name = "k", descriptor = "()V", line = 64)
	void method30334() {
		if (this.anInt5107 != 0) {
			this.aClass86_Sub1_Sub2_11.method20800(this.anInt5107, this.anInt5108 * this.anInt5106 * this.aClass206_33.anInt3581 * 1899960707 * this.aClass212_28.anInt3679 * 1676120375);
			this.anInt5107 = 0;
		}
	}

	@OriginalMember(owner = "client!rj", name = "i", descriptor = "()V", line = 64)
	void method30335() {
		if (this.anInt5107 != 0) {
			this.aClass86_Sub1_Sub2_11.method20800(this.anInt5107, this.anInt5108 * this.anInt5106 * this.aClass206_33.anInt3581 * 1899960707 * this.aClass212_28.anInt3679 * 1676120375);
			this.anInt5107 = 0;
		}
	}

	@OriginalMember(owner = "client!rj", name = "u", descriptor = "()V", line = 64)
	void method30336() {
		if (this.anInt5107 != 0) {
			this.aClass86_Sub1_Sub2_11.method20800(this.anInt5107, this.anInt5108 * this.anInt5106 * this.aClass206_33.anInt3581 * 1899960707 * this.aClass212_28.anInt3679 * 1676120375);
			this.anInt5107 = 0;
		}
	}

	@OriginalMember(owner = "client!rj", name = "finalize", descriptor = "()V", line = 71)
	@Override
	void finalize() throws Throwable {
		this.method30335();
		super.finalize();
	}

	@OriginalMember(owner = "client!rj", name = "hc", descriptor = "()V", line = 71)
	void method30337() throws Throwable {
		this.method30335();
		super.finalize();
	}

	@OriginalMember(owner = "client!rj", name = "hd", descriptor = "()V", line = 71)
	void method30338() throws Throwable {
		this.method30335();
		super.finalize();
	}

	@OriginalMember(owner = "client!rj", name = "hp", descriptor = "()V", line = 71)
	void method30339() throws Throwable {
		this.method30335();
		super.finalize();
	}
}

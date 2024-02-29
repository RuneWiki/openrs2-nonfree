package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ade")
public class Class77_Sub1_Sub1 extends Class77_Sub1 implements Interface16 {

	@OriginalMember(owner = "client!ade", name = "s", descriptor = "[I")
	static final int[] anIntArray16 = new int[1];

	@OriginalMember(owner = "client!ade", name = "l", descriptor = "Lclient!aeq;")
	final Class86_Sub3 aClass86_Sub3_5;

	@OriginalMember(owner = "client!ade", name = "w", descriptor = "I")
	final int anInt227;

	@OriginalMember(owner = "client!ade", name = "t", descriptor = "I")
	final int anInt228;

	@OriginalMember(owner = "client!ade", name = "x", descriptor = "Lclient!dt;")
	final Class212 aClass212_1;

	@OriginalMember(owner = "client!ade", name = "q", descriptor = "Lclient!dl;")
	final Class206 aClass206_1;

	@OriginalMember(owner = "client!ade", name = "y", descriptor = "I")
	int anInt229;

	@OriginalMember(owner = "client!ade", name = "d", descriptor = "I")
	final int anInt226;

	@OriginalMember(owner = "client!ade", name = "<init>", descriptor = "(Lclient!aeq;Lclient!dt;Lclient!dl;II)V", line = 18)
	Class77_Sub1_Sub1(@OriginalArg(0) Class86_Sub3 arg0, @OriginalArg(1) Class212 arg1, @OriginalArg(2) Class206 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass86_Sub3_5 = arg0;
		this.anInt227 = arg3;
		this.anInt228 = arg4;
		this.aClass212_1 = arg1;
		this.aClass206_1 = arg2;
		OpenGL.glGenRenderbuffersEXT(1, anIntArray16, 0);
		this.anInt229 = anIntArray16[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt229);
		OpenGL.glRenderbufferStorageEXT(36161, Class86_Sub3.method6292(this.aClass212_1, this.aClass206_1), this.anInt227, this.anInt228);
		this.anInt226 = this.anInt227 * this.anInt228 * this.aClass212_1.anInt3679 * 1676120375 * this.aClass206_1.anInt3581 * 1899960707;
	}

	@OriginalMember(owner = "client!ade", name = "<init>", descriptor = "(Lclient!aeq;Lclient!dt;Lclient!dl;III)V", line = 31)
	Class77_Sub1_Sub1(@OriginalArg(0) Class86_Sub3 arg0, @OriginalArg(1) Class212 arg1, @OriginalArg(2) Class206 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass86_Sub3_5 = arg0;
		this.anInt227 = arg3;
		this.anInt228 = arg4;
		this.aClass212_1 = arg1;
		this.aClass206_1 = arg2;
		OpenGL.glGenRenderbuffersEXT(1, anIntArray16, 0);
		this.anInt229 = anIntArray16[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt229);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg5, Class86_Sub3.method6292(this.aClass212_1, this.aClass206_1), this.anInt227, this.anInt228);
		this.anInt226 = this.anInt227 * this.anInt228 * this.aClass212_1.anInt3679 * 1676120375 * this.aClass206_1.anInt3581 * 1899960707;
	}

	@OriginalMember(owner = "client!ade", name = "l", descriptor = "()I", line = 45)
	@Override
	public int method30325() {
		return this.anInt227;
	}

	@OriginalMember(owner = "client!ade", name = "p", descriptor = "()I", line = 45)
	@Override
	public int method30324() {
		return this.anInt227;
	}

	@OriginalMember(owner = "client!ade", name = "y", descriptor = "()I", line = 45)
	@Override
	public int method30326() {
		return this.anInt227;
	}

	@OriginalMember(owner = "client!ade", name = "c", descriptor = "()I", line = 49)
	@Override
	public int method30329() {
		return this.anInt228;
	}

	@OriginalMember(owner = "client!ade", name = "w", descriptor = "()I", line = 49)
	@Override
	public int method30323() {
		return this.anInt228;
	}

	@OriginalMember(owner = "client!ade", name = "t", descriptor = "()I", line = 49)
	@Override
	public int method30328() {
		return this.anInt228;
	}

	@OriginalMember(owner = "client!ade", name = "q", descriptor = "()I", line = 49)
	@Override
	public int method30330() {
		return this.anInt228;
	}

	@OriginalMember(owner = "client!ade", name = "x", descriptor = "()I", line = 49)
	@Override
	public int method30327() {
		return this.anInt228;
	}

	@OriginalMember(owner = "client!ade", name = "d", descriptor = "()I", line = 49)
	@Override
	public int method30331() {
		return this.anInt228;
	}

	@OriginalMember(owner = "client!ade", name = "z", descriptor = "(I)V", line = 53)
	@Override
	public void method25513(@OriginalArg(0) int arg0) {
		OpenGL.glFramebufferRenderbufferEXT(36160, arg0, 36161, this.anInt229);
	}

	@OriginalMember(owner = "client!ade", name = "j", descriptor = "(I)V", line = 53)
	@Override
	public void method25512(@OriginalArg(0) int arg0) {
		OpenGL.glFramebufferRenderbufferEXT(36160, arg0, 36161, this.anInt229);
	}

	@OriginalMember(owner = "client!ade", name = "g", descriptor = "()V", line = 57)
	@Override
	public void method30319() {
		if (this.anInt229 != 0) {
			@Pc(5) int[] local5 = new int[] { this.anInt229 };
			OpenGL.glDeleteRenderbuffersEXT(1, local5, 0);
			this.anInt229 = 0;
		}
	}

	@OriginalMember(owner = "client!ade", name = "s", descriptor = "()V", line = 57)
	@Override
	public void method30320() {
		if (this.anInt229 != 0) {
			@Pc(5) int[] local5 = new int[] { this.anInt229 };
			OpenGL.glDeleteRenderbuffersEXT(1, local5, 0);
			this.anInt229 = 0;
		}
	}

	@OriginalMember(owner = "client!ade", name = "v", descriptor = "()V", line = 57)
	@Override
	public void method30322() {
		if (this.anInt229 != 0) {
			@Pc(5) int[] local5 = new int[] { this.anInt229 };
			OpenGL.glDeleteRenderbuffersEXT(1, local5, 0);
			this.anInt229 = 0;
		}
	}

	@OriginalMember(owner = "client!ade", name = "r", descriptor = "()V", line = 57)
	@Override
	public void method30321() {
		if (this.anInt229 != 0) {
			@Pc(5) int[] local5 = new int[] { this.anInt229 };
			OpenGL.glDeleteRenderbuffersEXT(1, local5, 0);
			this.anInt229 = 0;
		}
	}

	@OriginalMember(owner = "client!ade", name = "b", descriptor = "()V", line = 66)
	void method1300() {
		if (this.anInt229 != 0) {
			this.aClass86_Sub3_5.method6279(this.anInt229, this.anInt226);
			this.anInt229 = 0;
		}
	}

	@OriginalMember(owner = "client!ade", name = "n", descriptor = "()V", line = 66)
	void method1301() {
		if (this.anInt229 != 0) {
			this.aClass86_Sub3_5.method6279(this.anInt229, this.anInt226);
			this.anInt229 = 0;
		}
	}

	@OriginalMember(owner = "client!ade", name = "finalize", descriptor = "()V", line = 73)
	@Override
	void finalize() throws Throwable {
		this.method1300();
		super.finalize();
	}

	@OriginalMember(owner = "client!ade", name = "hc", descriptor = "()V", line = 73)
	void method1302() throws Throwable {
		this.method1300();
		super.finalize();
	}

	@OriginalMember(owner = "client!ade", name = "hd", descriptor = "()V", line = 73)
	void method1303() throws Throwable {
		this.method1300();
		super.finalize();
	}

	@OriginalMember(owner = "client!ade", name = "hp", descriptor = "()V", line = 73)
	void method1304() throws Throwable {
		this.method1300();
		super.finalize();
	}
}

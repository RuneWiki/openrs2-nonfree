package com.jagex;

import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public abstract class Class81 {

	@OriginalMember(owner = "client!bq", name = "p", descriptor = "I")
	static final int anInt301 = 34962;

	@OriginalMember(owner = "client!bq", name = "c", descriptor = "I")
	static final int anInt304 = 34963;

	@OriginalMember(owner = "client!bq", name = "x", descriptor = "[I")
	static final int[] anIntArray25 = new int[1];

	@OriginalMember(owner = "client!bq", name = "q", descriptor = "Z")
	boolean aBoolean48 = false;

	@OriginalMember(owner = "client!bq", name = "v", descriptor = "Lclient!aeq;")
	final Class86_Sub3 aClass86_Sub3_18;

	@OriginalMember(owner = "client!bq", name = "l", descriptor = "I")
	final int anInt302;

	@OriginalMember(owner = "client!bq", name = "w", descriptor = "I")
	int anInt305;

	@OriginalMember(owner = "client!bq", name = "t", descriptor = "Z")
	boolean aBoolean47;

	@OriginalMember(owner = "client!bq", name = "y", descriptor = "I")
	final int anInt303;

	@OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(Lclient!aeq;I[BIZ)V", line = 18)
	Class81(@OriginalArg(0) Class86_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass86_Sub3_18 = arg0;
		this.anInt302 = arg1;
		this.anInt305 = arg3;
		this.aBoolean47 = arg4;
		OpenGL.glGenBuffersARB(1, anIntArray25, 0);
		this.anInt303 = anIntArray25[0];
		this.method1829();
		OpenGL.glBufferDataARBub(arg1, this.anInt305, arg2, 0, this.aBoolean47 ? 35040 : 35044);
		this.aClass86_Sub3_18.anInt679 += this.anInt305;
	}

	@OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(Lclient!aeq;ILclient!jaclib/memory/Buffer;IZ)V", line = 30)
	Class81(@OriginalArg(0) Class86_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass86_Sub3_18 = arg0;
		this.anInt302 = arg1;
		this.anInt305 = arg3;
		this.aBoolean47 = arg4;
		OpenGL.glGenBuffersARB(1, anIntArray25, 0);
		this.anInt303 = anIntArray25[0];
		this.method1829();
		OpenGL.glBufferDataARBa(arg1, this.anInt305, arg2.c(), this.aBoolean47 ? 35040 : 35044);
		this.aClass86_Sub3_18.anInt679 += this.anInt305;
	}

	@OriginalMember(owner = "client!bq", name = "e", descriptor = "([BI)V", line = 45)
	void method1821(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.method1829();
		if (arg1 > this.anInt305) {
			OpenGL.glBufferDataARBub(this.anInt302, arg1, arg0, 0, this.aBoolean47 ? 35040 : 35044);
			this.aClass86_Sub3_18.anInt679 += arg1 - this.anInt305;
			this.anInt305 = arg1;
		} else {
			OpenGL.glBufferSubDataARBub(this.anInt302, 0, arg1, arg0, 0);
		}
	}

	@OriginalMember(owner = "client!bq", name = "i", descriptor = "([BI)V", line = 45)
	void method1822(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.method1829();
		if (arg1 > this.anInt305) {
			OpenGL.glBufferDataARBub(this.anInt302, arg1, arg0, 0, this.aBoolean47 ? 35040 : 35044);
			this.aClass86_Sub3_18.anInt679 += arg1 - this.anInt305;
			this.anInt305 = arg1;
		} else {
			OpenGL.glBufferSubDataARBub(this.anInt302, 0, arg1, arg0, 0);
		}
	}

	@OriginalMember(owner = "client!bq", name = "u", descriptor = "([BI)V", line = 45)
	void method1823(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.method1829();
		if (arg1 > this.anInt305) {
			OpenGL.glBufferDataARBub(this.anInt302, arg1, arg0, 0, this.aBoolean47 ? 35040 : 35044);
			this.aClass86_Sub3_18.anInt679 += arg1 - this.anInt305;
			this.anInt305 = arg1;
		} else {
			OpenGL.glBufferSubDataARBub(this.anInt302, 0, arg1, arg0, 0);
		}
	}

	@OriginalMember(owner = "client!bq", name = "f", descriptor = "([BI)V", line = 45)
	void method1824(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.method1829();
		if (arg1 > this.anInt305) {
			OpenGL.glBufferDataARBub(this.anInt302, arg1, arg0, 0, this.aBoolean47 ? 35040 : 35044);
			this.aClass86_Sub3_18.anInt679 += arg1 - this.anInt305;
			this.anInt305 = arg1;
		} else {
			OpenGL.glBufferSubDataARBub(this.anInt302, 0, arg1, arg0, 0);
		}
	}

	@OriginalMember(owner = "client!bq", name = "o", descriptor = "([BI)V", line = 45)
	void method1825(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.method1829();
		if (arg1 > this.anInt305) {
			OpenGL.glBufferDataARBub(this.anInt302, arg1, arg0, 0, this.aBoolean47 ? 35040 : 35044);
			this.aClass86_Sub3_18.anInt679 += arg1 - this.anInt305;
			this.anInt305 = arg1;
		} else {
			OpenGL.glBufferSubDataARBub(this.anInt302, 0, arg1, arg0, 0);
		}
	}

	@OriginalMember(owner = "client!bq", name = "hd", descriptor = "()V", line = 55)
	void method1826() throws Throwable {
		if (!this.aBoolean48) {
			this.aClass86_Sub3_18.method6270(this.anInt303, this.anInt305);
			this.aBoolean48 = true;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!bq", name = "finalize", descriptor = "()V", line = 55)
	@Override
	void finalize() throws Throwable {
		if (!this.aBoolean48) {
			this.aClass86_Sub3_18.method6270(this.anInt303, this.anInt305);
			this.aBoolean48 = true;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!bq", name = "hc", descriptor = "()V", line = 55)
	void method1827() throws Throwable {
		if (!this.aBoolean48) {
			this.aClass86_Sub3_18.method6270(this.anInt303, this.anInt305);
			this.aBoolean48 = true;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!bq", name = "hp", descriptor = "()V", line = 55)
	void method1828() throws Throwable {
		if (!this.aBoolean48) {
			this.aClass86_Sub3_18.method6270(this.anInt303, this.anInt305);
			this.aBoolean48 = true;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!bq", name = "j", descriptor = "()V")
	abstract void method1829();

	@OriginalMember(owner = "client!bq", name = "k", descriptor = "()V")
	abstract void method1830();
}

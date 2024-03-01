package com.jagex;

import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public abstract class Class8 {

	@OriginalMember(owner = "client!be", name = "p", descriptor = "I")
	static final int anInt115 = 34962;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "I")
	static final int anInt116 = 34963;

	@OriginalMember(owner = "client!be", name = "y", descriptor = "[I")
	static final int[] anIntArray14 = new int[1];

	@OriginalMember(owner = "client!be", name = "u", descriptor = "Z")
	boolean aBoolean31 = false;

	@OriginalMember(owner = "client!be", name = "g", descriptor = "Lclient!abt;")
	final Class21_Sub2 aClass21_Sub2_14;

	@OriginalMember(owner = "client!be", name = "l", descriptor = "I")
	final int anInt118;

	@OriginalMember(owner = "client!be", name = "x", descriptor = "I")
	int anInt119;

	@OriginalMember(owner = "client!be", name = "s", descriptor = "Z")
	boolean aBoolean30;

	@OriginalMember(owner = "client!be", name = "h", descriptor = "I")
	final int anInt117;

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Lclient!abt;I[BIZ)V", line = 18)
	Class8(@OriginalArg(0) Class21_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass21_Sub2_14 = arg0;
		this.anInt118 = arg1;
		this.anInt119 = arg3;
		this.aBoolean30 = arg4;
		OpenGL.glGenBuffersARB(1, anIntArray14, 0);
		this.anInt117 = anIntArray14[0];
		this.method968();
		OpenGL.glBufferDataARBub(arg1, this.anInt119, arg2, 0, this.aBoolean30 ? 35040 : 35044);
		this.aClass21_Sub2_14.anInt410 += this.anInt119;
	}

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Lclient!abt;ILclient!jaclib/memory/Buffer;IZ)V", line = 30)
	Class8(@OriginalArg(0) Class21_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass21_Sub2_14 = arg0;
		this.anInt118 = arg1;
		this.anInt119 = arg3;
		this.aBoolean30 = arg4;
		OpenGL.glGenBuffersARB(1, anIntArray14, 0);
		this.anInt117 = anIntArray14[0];
		this.method968();
		OpenGL.glBufferDataARBa(arg1, this.anInt119, arg2.a(), this.aBoolean30 ? 35040 : 35044);
		this.aClass21_Sub2_14.anInt410 += this.anInt119;
	}

	@OriginalMember(owner = "client!be", name = "d", descriptor = "([BI)V", line = 45)
	void method965(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.method968();
		if (arg1 > this.anInt119) {
			OpenGL.glBufferDataARBub(this.anInt118, arg1, arg0, 0, this.aBoolean30 ? 35040 : 35044);
			this.aClass21_Sub2_14.anInt410 += arg1 - this.anInt119;
			this.anInt119 = arg1;
		} else {
			OpenGL.glBufferSubDataARBub(this.anInt118, 0, arg1, arg0, 0);
		}
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "([BI)V", line = 45)
	void method966(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.method968();
		if (arg1 > this.anInt119) {
			OpenGL.glBufferDataARBub(this.anInt118, arg1, arg0, 0, this.aBoolean30 ? 35040 : 35044);
			this.aClass21_Sub2_14.anInt410 += arg1 - this.anInt119;
			this.anInt119 = arg1;
		} else {
			OpenGL.glBufferSubDataARBub(this.anInt118, 0, arg1, arg0, 0);
		}
	}

	@OriginalMember(owner = "client!be", name = "n", descriptor = "([BI)V", line = 45)
	void method967(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.method968();
		if (arg1 > this.anInt119) {
			OpenGL.glBufferDataARBub(this.anInt118, arg1, arg0, 0, this.aBoolean30 ? 35040 : 35044);
			this.aClass21_Sub2_14.anInt410 += arg1 - this.anInt119;
			this.anInt119 = arg1;
		} else {
			OpenGL.glBufferSubDataARBub(this.anInt118, 0, arg1, arg0, 0);
		}
	}

	@OriginalMember(owner = "client!be", name = "e", descriptor = "([BI)V", line = 45)
	void method972(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.method968();
		if (arg1 > this.anInt119) {
			OpenGL.glBufferDataARBub(this.anInt118, arg1, arg0, 0, this.aBoolean30 ? 35040 : 35044);
			this.aClass21_Sub2_14.anInt410 += arg1 - this.anInt119;
			this.anInt119 = arg1;
		} else {
			OpenGL.glBufferSubDataARBub(this.anInt118, 0, arg1, arg0, 0);
		}
	}

	@OriginalMember(owner = "client!be", name = "r", descriptor = "([BI)V", line = 45)
	void method973(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.method968();
		if (arg1 > this.anInt119) {
			OpenGL.glBufferDataARBub(this.anInt118, arg1, arg0, 0, this.aBoolean30 ? 35040 : 35044);
			this.aClass21_Sub2_14.anInt410 += arg1 - this.anInt119;
			this.anInt119 = arg1;
		} else {
			OpenGL.glBufferSubDataARBub(this.anInt118, 0, arg1, arg0, 0);
		}
	}

	@OriginalMember(owner = "client!be", name = "hh", descriptor = "()V", line = 55)
	void method969() throws Throwable {
		if (!this.aBoolean31) {
			this.aClass21_Sub2_14.method4095(this.anInt117, this.anInt119);
			this.aBoolean31 = true;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!be", name = "finalize", descriptor = "()V", line = 55)
	@Override
	void finalize() throws Throwable {
		if (!this.aBoolean31) {
			this.aClass21_Sub2_14.method4095(this.anInt117, this.anInt119);
			this.aBoolean31 = true;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!be", name = "j", descriptor = "()V")
	abstract void method964();

	@OriginalMember(owner = "client!be", name = "y", descriptor = "()V")
	abstract void method968();

	@OriginalMember(owner = "client!be", name = "c", descriptor = "()V")
	abstract void method970();

	@OriginalMember(owner = "client!be", name = "z", descriptor = "()V")
	abstract void method971();
}

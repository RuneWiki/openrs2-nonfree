package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ahb")
public class Class114_Sub1 extends Class114 implements Interface34 {

	@OriginalMember(owner = "client!ahb", name = "z", descriptor = "I")
	final int anInt1125;

	@OriginalMember(owner = "client!ahb", name = "j", descriptor = "I")
	final int anInt1124;

	@OriginalMember(owner = "client!ahb", name = "i", descriptor = "I")
	final int anInt1123;

	@OriginalMember(owner = "client!ahb", name = "<init>", descriptor = "(Lclient!apr;Lclient!dt;IIIZ[B)V", line = 15)
	Class114_Sub1(@OriginalArg(0) Class86_Sub1_Sub2 arg0, @OriginalArg(1) Class212 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6) {
		super(arg0, 32879, arg1, Class206.aClass206_23, arg2 * arg3 * arg4, arg5);
		this.anInt1125 = arg2;
		this.anInt1124 = arg3;
		this.anInt1123 = arg4;
		this.aClass86_Sub1_Sub2_6.method20542(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(this.anInt1223, 0, Class86_Sub1_Sub2.method20812(this.aClass212_13, this.aClass206_13), this.anInt1125, this.anInt1124, this.anInt1123, 0, Class86_Sub1_Sub2.method20810(this.aClass212_13), 5121, arg6, 0);
		OpenGL.glPixelStorei(3317, 4);
		if (arg5) {
			this.method10572();
		}
	}

	@OriginalMember(owner = "client!ahb", name = "ay", descriptor = "()V", line = 29)
	@Override
	public void method10865() {
		super.method10865();
	}

	@OriginalMember(owner = "client!ahb", name = "an", descriptor = "()V", line = 29)
	@Override
	public void method10867() {
		super.method10865();
	}

	@OriginalMember(owner = "client!ahb", name = "ap", descriptor = "()V", line = 29)
	@Override
	public void method10866() {
		super.method10865();
	}

	@OriginalMember(owner = "client!ahb", name = "ab", descriptor = "()V", line = 29)
	@Override
	public void method10864() {
		super.method10865();
	}

	@OriginalMember(owner = "client!ahb", name = "aa", descriptor = "()V", line = 29)
	@Override
	public void method10868() {
		super.method10865();
	}

	@OriginalMember(owner = "client!ahb", name = "af", descriptor = "(Lclient!lo;)V", line = 33)
	@Override
	public void method10856(@OriginalArg(0) Class382 arg0) {
		super.method10856(arg0);
	}

	@OriginalMember(owner = "client!ahb", name = "aw", descriptor = "(Lclient!lo;)V", line = 33)
	@Override
	public void method10854(@OriginalArg(0) Class382 arg0) {
		super.method10856(arg0);
	}

	@OriginalMember(owner = "client!ahb", name = "az", descriptor = "(Lclient!lo;)V", line = 33)
	@Override
	public void method10855(@OriginalArg(0) Class382 arg0) {
		super.method10856(arg0);
	}

	@OriginalMember(owner = "client!ahb", name = "r", descriptor = "()V", line = 37)
	@Override
	public void method30321() {
		super.method30322();
	}

	@OriginalMember(owner = "client!ahb", name = "v", descriptor = "()V", line = 37)
	@Override
	public void method30322() {
		super.method30322();
	}

	@OriginalMember(owner = "client!ahb", name = "g", descriptor = "()V", line = 37)
	@Override
	public void method30319() {
		super.method30322();
	}

	@OriginalMember(owner = "client!ahb", name = "s", descriptor = "()V", line = 37)
	@Override
	public void method30320() {
		super.method30322();
	}
}

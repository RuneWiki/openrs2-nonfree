package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class Class167 implements Interface16 {

	@OriginalMember(owner = "client!be", name = "c", descriptor = "I")
	final int anInt3285;

	@OriginalMember(owner = "client!be", name = "v", descriptor = "Lclient!adf;")
	final Class78_Sub1 aClass78_Sub1_3;

	@OriginalMember(owner = "client!be", name = "p", descriptor = "I")
	final int anInt3286;

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Lclient!adf;II)V", line = 56)
	Class167(@OriginalArg(0) Class78_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt3285 = arg2;
		this.aClass78_Sub1_3 = arg0;
		this.anInt3286 = arg1;
	}

	@OriginalMember(owner = "client!be", name = "y", descriptor = "()I", line = 63)
	@Override
	public int method30326() {
		return this.aClass78_Sub1_3.anInt254;
	}

	@OriginalMember(owner = "client!be", name = "l", descriptor = "()I", line = 63)
	@Override
	public int method30325() {
		return this.aClass78_Sub1_3.anInt254;
	}

	@OriginalMember(owner = "client!be", name = "p", descriptor = "()I", line = 63)
	@Override
	public int method30324() {
		return this.aClass78_Sub1_3.anInt254;
	}

	@OriginalMember(owner = "client!be", name = "c", descriptor = "()I", line = 67)
	@Override
	public int method30329() {
		return this.aClass78_Sub1_3.anInt254;
	}

	@OriginalMember(owner = "client!be", name = "t", descriptor = "()I", line = 67)
	@Override
	public int method30328() {
		return this.aClass78_Sub1_3.anInt254;
	}

	@OriginalMember(owner = "client!be", name = "w", descriptor = "()I", line = 67)
	@Override
	public int method30323() {
		return this.aClass78_Sub1_3.anInt254;
	}

	@OriginalMember(owner = "client!be", name = "x", descriptor = "()I", line = 67)
	@Override
	public int method30327() {
		return this.aClass78_Sub1_3.anInt254;
	}

	@OriginalMember(owner = "client!be", name = "d", descriptor = "()I", line = 67)
	@Override
	public int method30331() {
		return this.aClass78_Sub1_3.anInt254;
	}

	@OriginalMember(owner = "client!be", name = "q", descriptor = "()I", line = 67)
	@Override
	public int method30330() {
		return this.aClass78_Sub1_3.anInt254;
	}

	@OriginalMember(owner = "client!be", name = "z", descriptor = "(I)V", line = 71)
	@Override
	public void method25513(@OriginalArg(0) int arg0) {
		OpenGL.glFramebufferTexture2DEXT(36160, arg0, this.anInt3286, this.aClass78_Sub1_3.anInt2410, this.anInt3285);
	}

	@OriginalMember(owner = "client!be", name = "j", descriptor = "(I)V", line = 71)
	@Override
	public void method25512(@OriginalArg(0) int arg0) {
		OpenGL.glFramebufferTexture2DEXT(36160, arg0, this.anInt3286, this.aClass78_Sub1_3.anInt2410, this.anInt3285);
	}

	@OriginalMember(owner = "client!be", name = "g", descriptor = "()V", line = 74)
	@Override
	public void method30319() {
	}

	@OriginalMember(owner = "client!be", name = "v", descriptor = "()V", line = 74)
	@Override
	public void method30322() {
	}

	@OriginalMember(owner = "client!be", name = "r", descriptor = "()V", line = 74)
	@Override
	public void method30321() {
	}

	@OriginalMember(owner = "client!be", name = "s", descriptor = "()V", line = 74)
	@Override
	public void method30320() {
	}
}

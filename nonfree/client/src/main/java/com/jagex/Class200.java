package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cz")
public class Class200 implements Interface16 {

	@OriginalMember(owner = "client!cz", name = "p", descriptor = "I")
	final int anInt3551;

	@OriginalMember(owner = "client!cz", name = "c", descriptor = "Lclient!adi;")
	final Class78_Sub2 aClass78_Sub2_7;

	@OriginalMember(owner = "client!cz", name = "<init>", descriptor = "(Lclient!adi;I)V", line = 190)
	Class200(@OriginalArg(0) Class78_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.anInt3551 = arg1;
		this.aClass78_Sub2_7 = arg0;
	}

	@OriginalMember(owner = "client!cz", name = "p", descriptor = "()I", line = 196)
	@Override
	public int method30324() {
		return this.aClass78_Sub2_7.anInt2412;
	}

	@OriginalMember(owner = "client!cz", name = "y", descriptor = "()I", line = 196)
	@Override
	public int method30326() {
		return this.aClass78_Sub2_7.anInt2412;
	}

	@OriginalMember(owner = "client!cz", name = "l", descriptor = "()I", line = 196)
	@Override
	public int method30325() {
		return this.aClass78_Sub2_7.anInt2412;
	}

	@OriginalMember(owner = "client!cz", name = "d", descriptor = "()I", line = 200)
	@Override
	public int method30331() {
		return this.aClass78_Sub2_7.anInt2413;
	}

	@OriginalMember(owner = "client!cz", name = "c", descriptor = "()I", line = 200)
	@Override
	public int method30329() {
		return this.aClass78_Sub2_7.anInt2413;
	}

	@OriginalMember(owner = "client!cz", name = "t", descriptor = "()I", line = 200)
	@Override
	public int method30328() {
		return this.aClass78_Sub2_7.anInt2413;
	}

	@OriginalMember(owner = "client!cz", name = "q", descriptor = "()I", line = 200)
	@Override
	public int method30330() {
		return this.aClass78_Sub2_7.anInt2413;
	}

	@OriginalMember(owner = "client!cz", name = "x", descriptor = "()I", line = 200)
	@Override
	public int method30327() {
		return this.aClass78_Sub2_7.anInt2413;
	}

	@OriginalMember(owner = "client!cz", name = "w", descriptor = "()I", line = 200)
	@Override
	public int method30323() {
		return this.aClass78_Sub2_7.anInt2413;
	}

	@OriginalMember(owner = "client!cz", name = "z", descriptor = "(I)V", line = 204)
	@Override
	public void method25513(@OriginalArg(0) int arg0) {
		OpenGL.glFramebufferTexture2DEXT(36160, arg0, this.aClass78_Sub2_7.anInt2408, this.aClass78_Sub2_7.anInt2410, this.anInt3551);
	}

	@OriginalMember(owner = "client!cz", name = "j", descriptor = "(I)V", line = 204)
	@Override
	public void method25512(@OriginalArg(0) int arg0) {
		OpenGL.glFramebufferTexture2DEXT(36160, arg0, this.aClass78_Sub2_7.anInt2408, this.aClass78_Sub2_7.anInt2410, this.anInt3551);
	}

	@OriginalMember(owner = "client!cz", name = "v", descriptor = "()V", line = 207)
	@Override
	public void method30322() {
	}

	@OriginalMember(owner = "client!cz", name = "g", descriptor = "()V", line = 207)
	@Override
	public void method30319() {
	}

	@OriginalMember(owner = "client!cz", name = "s", descriptor = "()V", line = 207)
	@Override
	public void method30320() {
	}

	@OriginalMember(owner = "client!cz", name = "r", descriptor = "()V", line = 207)
	@Override
	public void method30321() {
	}
}

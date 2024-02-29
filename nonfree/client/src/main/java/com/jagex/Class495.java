package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public class Class495 implements Interface56 {

	@OriginalMember(owner = "client!qr", name = "p", descriptor = "I")
	final int anInt5053;

	@OriginalMember(owner = "client!qr", name = "c", descriptor = "Lclient!aho;")
	final Class114_Sub3 aClass114_Sub3_1;

	@OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(Lclient!aho;I)V", line = 225)
	Class495(@OriginalArg(0) Class114_Sub3 arg0, @OriginalArg(1) int arg1) {
		this.anInt5053 = arg1;
		this.aClass114_Sub3_1 = arg0;
	}

	@OriginalMember(owner = "client!qr", name = "p", descriptor = "()I", line = 231)
	@Override
	public int method30324() {
		return this.aClass114_Sub3_1.method10631();
	}

	@OriginalMember(owner = "client!qr", name = "l", descriptor = "()I", line = 231)
	@Override
	public int method30325() {
		return this.aClass114_Sub3_1.method10631();
	}

	@OriginalMember(owner = "client!qr", name = "y", descriptor = "()I", line = 231)
	@Override
	public int method30326() {
		return this.aClass114_Sub3_1.method10631();
	}

	@OriginalMember(owner = "client!qr", name = "q", descriptor = "()I", line = 235)
	@Override
	public int method30330() {
		return this.aClass114_Sub3_1.method10603();
	}

	@OriginalMember(owner = "client!qr", name = "w", descriptor = "()I", line = 235)
	@Override
	public int method30323() {
		return this.aClass114_Sub3_1.method10603();
	}

	@OriginalMember(owner = "client!qr", name = "t", descriptor = "()I", line = 235)
	@Override
	public int method30328() {
		return this.aClass114_Sub3_1.method10603();
	}

	@OriginalMember(owner = "client!qr", name = "x", descriptor = "()I", line = 235)
	@Override
	public int method30327() {
		return this.aClass114_Sub3_1.method10603();
	}

	@OriginalMember(owner = "client!qr", name = "d", descriptor = "()I", line = 235)
	@Override
	public int method30331() {
		return this.aClass114_Sub3_1.method10603();
	}

	@OriginalMember(owner = "client!qr", name = "c", descriptor = "()I", line = 235)
	@Override
	public int method30329() {
		return this.aClass114_Sub3_1.method10603();
	}

	@OriginalMember(owner = "client!qr", name = "z", descriptor = "(I)V", line = 239)
	@Override
	public void method30332(@OriginalArg(0) int arg0) {
		OpenGL.glFramebufferTexture2DEXT(36160, arg0, this.aClass114_Sub3_1.anInt1223, this.aClass114_Sub3_1.anInt1219, this.anInt5053);
	}

	@OriginalMember(owner = "client!qr", name = "j", descriptor = "(I)V", line = 239)
	@Override
	public void method30333(@OriginalArg(0) int arg0) {
		OpenGL.glFramebufferTexture2DEXT(36160, arg0, this.aClass114_Sub3_1.anInt1223, this.aClass114_Sub3_1.anInt1219, this.anInt5053);
	}

	@OriginalMember(owner = "client!qr", name = "s", descriptor = "()V", line = 242)
	@Override
	public void method30320() {
	}

	@OriginalMember(owner = "client!qr", name = "v", descriptor = "()V", line = 242)
	@Override
	public void method30322() {
	}

	@OriginalMember(owner = "client!qr", name = "r", descriptor = "()V", line = 242)
	@Override
	public void method30321() {
	}

	@OriginalMember(owner = "client!qr", name = "g", descriptor = "()V", line = 242)
	@Override
	public void method30319() {
	}
}

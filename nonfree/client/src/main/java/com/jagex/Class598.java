package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vk")
public class Class598 implements Interface69 {

	@OriginalMember(owner = "client!vk", name = "c", descriptor = "Lclient!va;")
	Class590 aClass590_4 = Class590.aClass590_2;

	@OriginalMember(owner = "client!vk", name = "l", descriptor = "Lclient!pw;")
	Class478 aClass478_132;

	@OriginalMember(owner = "client!vk", name = "v", descriptor = "I")
	int anInt5509;

	@OriginalMember(owner = "client!vk", name = "p", descriptor = "Lclient!lj;")
	Class117 aClass117_4;

	@OriginalMember(owner = "client!vk", name = "y", descriptor = "Lclient!vf;")
	Interface68 anInterface68_1;

	@OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(Lclient!pw;ILclient!lj;Lclient!vf;)V", line = 16)
	public Class598(@OriginalArg(0) Class478 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class117 arg2, @OriginalArg(3) Interface68 arg3) {
		this.aClass478_132 = arg0;
		this.anInt5509 = arg1 * -1569134157;
		this.aClass117_4 = arg2;
		this.anInterface68_1 = arg3;
		this.aClass590_4 = Class590.aClass590_3;
	}

	@OriginalMember(owner = "client!vk", name = "c", descriptor = "(Lclient!pw;Lclient!xl;IS)[B", line = 23)
	static byte[] method31978(@OriginalArg(0) Class478 arg0, @OriginalArg(1) Class647 arg1, @OriginalArg(2) int arg2) {
		return arg1.method32842() > 1 ? arg0.method29725(arg1.method32846(arg2), arg1.method32847(arg2)) : arg0.method29725(arg1.anInt5724 * 1570156841, arg2);
	}

	@OriginalMember(owner = "client!vk", name = "p", descriptor = "(B)V", line = 25)
	@Override
	public void method32150() {
		if (this.aClass590_4 != Class590.aClass590_3) {
			return;
		}
		this.method31979();
		this.aClass590_4 = Class590.aClass590_1;
		if (this.anInterface68_1 != null) {
			this.anInterface68_1.method26109(this, 0, this.anInt5509 * 1371532667, true);
		}
	}

	@OriginalMember(owner = "client!vk", name = "f", descriptor = "()V", line = 25)
	@Override
	public void method32163() {
		if (this.aClass590_4 != Class590.aClass590_3) {
			return;
		}
		this.method31979();
		this.aClass590_4 = Class590.aClass590_1;
		if (this.anInterface68_1 != null) {
			this.anInterface68_1.method26109(this, 0, this.anInt5509 * 1371532667, true);
		}
	}

	@OriginalMember(owner = "client!vk", name = "e", descriptor = "()V", line = 25)
	@Override
	public void method32148() {
		if (this.aClass590_4 != Class590.aClass590_3) {
			return;
		}
		this.method31979();
		this.aClass590_4 = Class590.aClass590_1;
		if (this.anInterface68_1 != null) {
			this.anInterface68_1.method26109(this, 0, this.anInt5509 * 1371532667, true);
		}
	}

	@OriginalMember(owner = "client!vk", name = "c", descriptor = "(B)Lclient!qs;", line = 35)
	@Override
	public Class496 method32147() {
		@Pc(5) Class496 local5 = new Class496(this.aClass117_4);
		local5.method30090(this);
		return local5;
	}

	@OriginalMember(owner = "client!vk", name = "o", descriptor = "()Lclient!qs;", line = 35)
	@Override
	public Class496 method32164() {
		@Pc(5) Class496 local5 = new Class496(this.aClass117_4);
		local5.method30090(this);
		return local5;
	}

	@OriginalMember(owner = "client!vk", name = "b", descriptor = "()Lclient!qs;", line = 35)
	@Override
	public Class496 method32192() {
		@Pc(5) Class496 local5 = new Class496(this.aClass117_4);
		local5.method30090(this);
		return local5;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "()Lclient!qs;", line = 35)
	@Override
	public Class496 method32167() {
		@Pc(5) Class496 local5 = new Class496(this.aClass117_4);
		local5.method30090(this);
		return local5;
	}

	@OriginalMember(owner = "client!vk", name = "n", descriptor = "()Lclient!qs;", line = 35)
	@Override
	public Class496 method32166() {
		@Pc(5) Class496 local5 = new Class496(this.aClass117_4);
		local5.method30090(this);
		return local5;
	}

	@OriginalMember(owner = "client!vk", name = "v", descriptor = "(I)Lclient!va;", line = 41)
	@Override
	public Class590 method32180() {
		return this.aClass590_4;
	}

	@OriginalMember(owner = "client!vk", name = "m", descriptor = "()Lclient!va;", line = 41)
	@Override
	public Class590 method32161() {
		return this.aClass590_4;
	}

	@OriginalMember(owner = "client!vk", name = "l", descriptor = "(B)Z", line = 45)
	@Override
	public boolean method32149() {
		return true;
	}

	@OriginalMember(owner = "client!vk", name = "h", descriptor = "()Z", line = 45)
	@Override
	public boolean method32169() {
		return true;
	}

	@OriginalMember(owner = "client!vk", name = "aj", descriptor = "()Z", line = 45)
	@Override
	public boolean method32168() {
		return true;
	}

	@OriginalMember(owner = "client!vk", name = "y", descriptor = "(I)V", line = 48)
	void method31979() {
	}

	@OriginalMember(owner = "client!vk", name = "k", descriptor = "()V", line = 48)
	void method31980() {
	}

	@OriginalMember(owner = "client!vk", name = "t", descriptor = "(B)I", line = 51)
	@Override
	public int method32160() {
		return 0;
	}

	@OriginalMember(owner = "client!vk", name = "ak", descriptor = "()I", line = 51)
	@Override
	public int method32174() {
		return 0;
	}

	@OriginalMember(owner = "client!vk", name = "au", descriptor = "()I", line = 51)
	@Override
	public int method32175() {
		return 0;
	}

	@OriginalMember(owner = "client!vk", name = "ao", descriptor = "()I", line = 51)
	@Override
	public int method32154() {
		return 0;
	}

	@OriginalMember(owner = "client!vk", name = "q", descriptor = "(I)Lclient!qy;", line = 55)
	@Override
	public Class501 method32170() {
		return Class501.aClass501_4;
	}

	@OriginalMember(owner = "client!vk", name = "ax", descriptor = "()Lclient!qy;", line = 55)
	@Override
	public Class501 method32159() {
		return Class501.aClass501_4;
	}

	@OriginalMember(owner = "client!vk", name = "x", descriptor = "(I)I", line = 59)
	@Override
	public int method32165() {
		return this.anInt5509 * 1371532667;
	}

	@OriginalMember(owner = "client!vk", name = "ar", descriptor = "()I", line = 59)
	@Override
	public int method32177() {
		return this.anInt5509 * 1371532667;
	}

	@OriginalMember(owner = "client!vk", name = "ac", descriptor = "()I", line = 59)
	@Override
	public int method32153() {
		return this.anInt5509 * 1371532667;
	}

	@OriginalMember(owner = "client!vk", name = "ad", descriptor = "()I", line = 59)
	@Override
	public int method32178() {
		return this.anInt5509 * 1371532667;
	}

	@OriginalMember(owner = "client!vk", name = "w", descriptor = "(IB)[B", line = 63)
	@Override
	public byte[] method32151(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = arg0;
		if (arg0 == 0) {
			local1 = this.anInt5509 * 1371532667;
		}
		return this.aClass478_132.method29745(local1);
	}

	@OriginalMember(owner = "client!vk", name = "ag", descriptor = "(I)[B", line = 63)
	@Override
	public byte[] method32171(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = arg0;
		if (arg0 == 0) {
			local1 = this.anInt5509 * 1371532667;
		}
		return this.aClass478_132.method29745(local1);
	}

	@OriginalMember(owner = "client!vk", name = "al", descriptor = "(I)[B", line = 63)
	@Override
	public byte[] method32172(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = arg0;
		if (arg0 == 0) {
			local1 = this.anInt5509 * 1371532667;
		}
		return this.aClass478_132.method29745(local1);
	}

	@OriginalMember(owner = "client!vk", name = "bj", descriptor = "(Lclient!akv;)V", line = 68)
	@Override
	public void method32179(@OriginalArg(0) Class77_Sub39 arg0) {
	}

	@OriginalMember(owner = "client!vk", name = "d", descriptor = "(Lclient!akv;I)V", line = 68)
	@Override
	public void method32155(@OriginalArg(0) Class77_Sub39 arg0) {
	}

	@OriginalMember(owner = "client!vk", name = "bv", descriptor = "(Lclient!akv;)V", line = 68)
	@Override
	public void method32193(@OriginalArg(0) Class77_Sub39 arg0) {
	}

	@OriginalMember(owner = "client!vk", name = "aw", descriptor = "(Lclient!akv;)V", line = 68)
	@Override
	public void method32189(@OriginalArg(0) Class77_Sub39 arg0) {
	}

	@OriginalMember(owner = "client!vk", name = "az", descriptor = "(Lclient!akv;)V", line = 68)
	@Override
	public void method32190(@OriginalArg(0) Class77_Sub39 arg0) {
	}

	@OriginalMember(owner = "client!vk", name = "bc", descriptor = "(Lclient!akv;)V", line = 68)
	@Override
	public void method32191(@OriginalArg(0) Class77_Sub39 arg0) {
	}

	@OriginalMember(owner = "client!vk", name = "s", descriptor = "(II)Lclient!akv;", line = 71)
	@Override
	public Class77_Sub39 method32162(@OriginalArg(0) int arg0) {
		return null;
	}

	@OriginalMember(owner = "client!vk", name = "av", descriptor = "(I)Lclient!akv;", line = 71)
	@Override
	public Class77_Sub39 method32187(@OriginalArg(0) int arg0) {
		return null;
	}

	@OriginalMember(owner = "client!vk", name = "r", descriptor = "(IB)Z", line = 75)
	@Override
	public boolean method32158(@OriginalArg(0) int arg0) {
		return false;
	}

	@OriginalMember(owner = "client!vk", name = "at", descriptor = "(I)Z", line = 75)
	@Override
	public boolean method32181(@OriginalArg(0) int arg0) {
		return false;
	}

	@OriginalMember(owner = "client!vk", name = "ae", descriptor = "(I)Z", line = 75)
	@Override
	public boolean method32173(@OriginalArg(0) int arg0) {
		return false;
	}

	@OriginalMember(owner = "client!vk", name = "g", descriptor = "(I)Z", line = 79)
	@Override
	public boolean method32157() {
		return false;
	}

	@OriginalMember(owner = "client!vk", name = "ah", descriptor = "()Z", line = 79)
	@Override
	public boolean method32183() {
		return false;
	}

	@OriginalMember(owner = "client!vk", name = "as", descriptor = "()Z", line = 79)
	@Override
	public boolean method32184() {
		return false;
	}

	@OriginalMember(owner = "client!vk", name = "aq", descriptor = "()I", line = 83)
	@Override
	public int method32152() {
		return 0;
	}

	@OriginalMember(owner = "client!vk", name = "z", descriptor = "(B)I", line = 83)
	@Override
	public int method32156() {
		return 0;
	}

	@OriginalMember(owner = "client!vk", name = "am", descriptor = "(Z)V", line = 86)
	@Override
	public void method32186(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!vk", name = "j", descriptor = "(ZI)V", line = 86)
	@Override
	public void method32182(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!vk", name = "i", descriptor = "(I)Z", line = 89)
	@Override
	public boolean method32176() {
		return false;
	}

	@OriginalMember(owner = "client!vk", name = "ay", descriptor = "()Z", line = 89)
	@Override
	public boolean method32185() {
		return false;
	}

	@OriginalMember(owner = "client!vk", name = "af", descriptor = "()Z", line = 89)
	@Override
	public boolean method32188() {
		return false;
	}
}

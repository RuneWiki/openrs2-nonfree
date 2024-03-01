package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ady")
public class Class36_Sub2 extends Class36 {

	@OriginalMember(owner = "client!ady", name = "tl", descriptor = "I")
	static int anInt886;

	@OriginalMember(owner = "client!ady", name = "h", descriptor = "Lclient!fk;")
	Class25 aClass25_10;

	@OriginalMember(owner = "client!ady", name = "g", descriptor = "Lclient!fc;")
	Class24 aClass24_8;

	@OriginalMember(owner = "client!ady", name = "l", descriptor = "Lclient!alr;")
	Class3_Sub19_Sub1 aClass3_Sub19_Sub1_39;

	@OriginalMember(owner = "client!ady", name = "<init>", descriptor = "(Lclient!abv;)V", line = 14)
	public Class36_Sub2(@OriginalArg(0) Class21_Sub3 arg0) throws Exception_Sub1 {
		super(arg0);
		this.method8317();
	}

	@OriginalMember(owner = "client!ady", name = "h", descriptor = "(S)Z", line = 19)
	boolean method8317() throws Exception_Sub1 {
		this.aClass24_8 = this.aClass21_Sub3_23.method17435("BatchedSprite");
		this.aClass3_Sub19_Sub1_39 = this.aClass24_8.method6583("SpriteSampler");
		this.aClass25_10 = this.aClass24_8.method6555("Normal");
		this.aClass24_8.method6560(this.aClass25_10);
		return true;
	}

	@OriginalMember(owner = "client!ady", name = "x", descriptor = "()Z", line = 19)
	boolean method8318() throws Exception_Sub1 {
		this.aClass24_8 = this.aClass21_Sub3_23.method17435("BatchedSprite");
		this.aClass3_Sub19_Sub1_39 = this.aClass24_8.method6583("SpriteSampler");
		this.aClass25_10 = this.aClass24_8.method6555("Normal");
		this.aClass24_8.method6560(this.aClass25_10);
		return true;
	}

	@OriginalMember(owner = "client!ady", name = "s", descriptor = "()Z", line = 19)
	boolean method8319() throws Exception_Sub1 {
		this.aClass24_8 = this.aClass21_Sub3_23.method17435("BatchedSprite");
		this.aClass3_Sub19_Sub1_39 = this.aClass24_8.method6583("SpriteSampler");
		this.aClass25_10 = this.aClass24_8.method6555("Normal");
		this.aClass24_8.method6560(this.aClass25_10);
		return true;
	}

	@OriginalMember(owner = "client!ady", name = "g", descriptor = "()V", line = 27)
	@Override
	public void method8313() {
		this.aClass24_8.method6550();
		this.aClass24_8.method6622(this.aClass3_Sub19_Sub1_39, 0, this.anInterface20_20);
	}

	@OriginalMember(owner = "client!ady", name = "a", descriptor = "()V", line = 27)
	@Override
	public void method8315() {
		this.aClass24_8.method6550();
		this.aClass24_8.method6622(this.aClass3_Sub19_Sub1_39, 0, this.anInterface20_20);
	}

	@OriginalMember(owner = "client!ady", name = "p", descriptor = "()V", line = 27)
	@Override
	public void method8314() {
		this.aClass24_8.method6550();
		this.aClass24_8.method6622(this.aClass3_Sub19_Sub1_39, 0, this.anInterface20_20);
	}

	@OriginalMember(owner = "client!ady", name = "l", descriptor = "()V", line = 27)
	@Override
	public void method8316() {
		this.aClass24_8.method6550();
		this.aClass24_8.method6622(this.aClass3_Sub19_Sub1_39, 0, this.anInterface20_20);
	}

	@OriginalMember(owner = "client!ady", name = "a", descriptor = "(II)V", line = 41)
	public static void method8322(@OriginalArg(0) int arg0) {
		@Pc(5) Class3_Sub44 local5 = (Class3_Sub44) Class528.aClass581_39.method33217((long) arg0);
		if (local5 != null) {
			local5.aBoolean327 = !local5.aBoolean327;
			local5.aClass57_Sub1_1.method12238(local5.aBoolean327);
		}
	}

	@OriginalMember(owner = "client!ady", name = "a", descriptor = "(I)Z", line = 243)
	public static boolean method8320() {
		return Class231.aBoolean678;
	}

	@OriginalMember(owner = "client!ady", name = "g", descriptor = "(IB)Lclient!fw;", line = 272)
	public static Class186 method8321(@OriginalArg(0) int arg0) {
		return Class178.aClass186Array1[arg0 >> 16];
	}
}

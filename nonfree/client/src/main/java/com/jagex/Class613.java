package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vg")
public class Class613 implements Interface75 {

	@OriginalMember(owner = "client!vg", name = "e", descriptor = "Lclient!vg;")
	static final Class613 aClass613_2 = new Class613(0);

	@OriginalMember(owner = "client!vg", name = "n", descriptor = "Lclient!vg;")
	static final Class613 aClass613_3 = new Class613(1);

	@OriginalMember(owner = "client!vg", name = "m", descriptor = "Lclient!vg;")
	public static final Class613 aClass613_4 = new Class613(2);

	@OriginalMember(owner = "client!vg", name = "k", descriptor = "I")
	final int anInt5627;

	@OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(I)V", line = 17)
	Class613(@OriginalArg(0) int arg0) {
		this.anInt5627 = arg0 * 1474616659;
	}

	@OriginalMember(owner = "client!vg", name = "k", descriptor = "()I", line = 22)
	@Override
	public int method36919() {
		return this.anInt5627 * 919563995;
	}

	@OriginalMember(owner = "client!vg", name = "n", descriptor = "()I", line = 22)
	@Override
	public int method36920() {
		return this.anInt5627 * 919563995;
	}

	@OriginalMember(owner = "client!vg", name = "f", descriptor = "(IB)V", line = 153)
	static void method32065(@OriginalArg(0) int arg0) {
		@Pc(2) Class240 local2 = Class330.aClass240_79;
		synchronized (Class330.aClass240_79) {
			Class330.aClass240_79.method25832(arg0);
		}
	}

	@OriginalMember(owner = "client!vg", name = "uu", descriptor = "(Lclient!yf;I)V", line = 8699)
	static final void method32059(@OriginalArg(0) Class681 arg0) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32805(local12);
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local16.anInt4035 * -220894753;
	}

	@OriginalMember(owner = "client!vg", name = "ahq", descriptor = "(Lclient!yf;B)V", line = 10853)
	static final void method32060(@OriginalArg(0) Class681 arg0) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		@Pc(29) Class87 local29 = (Class87) Class124.aClass32_Sub21_7.method18261(local23);
		if (local29.method1508()) {
			arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = ((Class610) client.aClass532_1.method30466().method18261(local13)).method31984(local23, local29.aString11);
		} else {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = ((Class610) client.aClass532_1.method30466().method18261(local13)).method31986(local23, local29.anInt265 * 951920133);
		}
	}

	@OriginalMember(owner = "client!vg", name = "and", descriptor = "(Lclient!yf;I)V", line = 12186)
	static final void method32064(@OriginalArg(0) Class681 arg0) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		if (local12 < 0) {
			local12 = 0;
		}
		client.anInt3484 = (client.anInt3576 * 522759457 + local12) * 1541774401;
	}

	@OriginalMember(owner = "client!vg", name = "azh", descriptor = "(Lclient!yf;B)V", line = 14189)
	static final void method32061(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class51.aClass93_Sub36_1.aClass166_Sub4_1.method15426() ? 1 : 0;
	}

	@OriginalMember(owner = "client!vg", name = "bcr", descriptor = "(Lclient!yf;I)V", line = 14663)
	static final void method32063(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
	}

	@OriginalMember(owner = "client!vg", name = "bel", descriptor = "(Lclient!yf;I)V", line = 14836)
	static final void method32062(@OriginalArg(0) Class681 arg0) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = client.aClass270_1.method26278(local13).method26372(local23);
	}
}

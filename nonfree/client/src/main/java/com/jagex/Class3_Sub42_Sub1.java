package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ana")
public class Class3_Sub42_Sub1 extends Class3_Sub42 {

	@OriginalMember(owner = "client!ana", name = "b", descriptor = "I")
	public static int anInt2712;

	@OriginalMember(owner = "client!ana", name = "x", descriptor = "Lclient!vo;")
	final Class533 aClass533_1;

	@OriginalMember(owner = "client!ana", name = "<init>", descriptor = "(IILclient!vo;)V", line = 12)
	public Class3_Sub42_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class533 arg2) {
		super(arg0, arg1);
		this.aClass533_1 = arg2;
	}

	@OriginalMember(owner = "client!ana", name = "g", descriptor = "()Z", line = 17)
	@Override
	public boolean method20198() {
		@Pc(4) Class26_Sub1_Sub5_Sub1 local4 = this.aClass533_1.method32506();
		if (local4 == null) {
			return false;
		} else {
			Class26_Sub1_Sub1_Sub2.method9176(Class634.aClass634_11, this.anInt2796 * 1705574607, -1, this.aClass533_1, local4);
			return true;
		}
	}

	@OriginalMember(owner = "client!ana", name = "p", descriptor = "(B)Z", line = 17)
	@Override
	public boolean method20199() {
		@Pc(4) Class26_Sub1_Sub5_Sub1 local4 = this.aClass533_1.method32506();
		if (local4 == null) {
			return false;
		} else {
			Class26_Sub1_Sub1_Sub2.method9176(Class634.aClass634_11, this.anInt2796 * 1705574607, -1, this.aClass533_1, local4);
			return true;
		}
	}

	@OriginalMember(owner = "client!ana", name = "a", descriptor = "()Z", line = 17)
	@Override
	public boolean method20197() {
		@Pc(4) Class26_Sub1_Sub5_Sub1 local4 = this.aClass533_1.method32506();
		if (local4 == null) {
			return false;
		} else {
			Class26_Sub1_Sub1_Sub2.method9176(Class634.aClass634_11, this.anInt2796 * 1705574607, -1, this.aClass533_1, local4);
			return true;
		}
	}

	@OriginalMember(owner = "client!ana", name = "l", descriptor = "()Z", line = 17)
	@Override
	public boolean method20196() {
		@Pc(4) Class26_Sub1_Sub5_Sub1 local4 = this.aClass533_1.method32506();
		if (local4 == null) {
			return false;
		} else {
			Class26_Sub1_Sub1_Sub2.method9176(Class634.aClass634_11, this.anInt2796 * 1705574607, -1, this.aClass533_1, local4);
			return true;
		}
	}

	@OriginalMember(owner = "client!ana", name = "j", descriptor = "(Lclient!de;Lclient!su;IIIB)V", line = 392)
	static void method19546(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class467 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) Class628 local7 = Class342.aClass629_3.method33834(arg1.anInt5090 * 748511055);
		if (-508620177 * local7.anInt5581 == -1) {
			return;
		}
		if (arg1.aBoolean782) {
			@Pc(24) int local24 = arg2 + arg1.anInt5077 * -1259200615;
			arg2 = local24 & 0x3;
		} else {
			arg2 = 0;
		}
		@Pc(39) Class6 local39 = local7.method33828(arg0, arg2, arg1.aBoolean783);
		if (local39 == null) {
			return;
		}
		@Pc(47) int local47 = arg1.anInt5080 * -1872348475;
		@Pc(52) int local52 = arg1.anInt5113 * 1824726069;
		if ((arg2 & 0x1) == 1) {
			local47 = arg1.anInt5113 * 1824726069;
			local52 = arg1.anInt5080 * -1872348475;
		}
		@Pc(70) int local70 = local39.method16772();
		@Pc(73) int local73 = local39.method16779();
		if (local7.aBoolean853) {
			local70 = local47 * 4;
			local73 = local52 * 4;
		}
		if (local7.anInt5582 * -1966397477 == 0) {
			local39.method16786(arg3, arg4 - (local52 - 1) * 4, local70, local73);
		} else {
			local39.method16824(arg3, arg4 - (local52 - 1) * 4, local70, local73, 0, -1966397477 * local7.anInt5582 | 0xFF000000, 1);
		}
	}
}

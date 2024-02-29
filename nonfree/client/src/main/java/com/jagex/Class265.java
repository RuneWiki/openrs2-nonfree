package com.jagex;

import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!g")
public class Class265 {

	@OriginalMember(owner = "client!g", name = "p", descriptor = "I")
	static final int anInt3827 = 7;

	@OriginalMember(owner = "client!g", name = "c", descriptor = "I")
	static final int anInt3828 = 127;

	@OriginalMember(owner = "client!g", name = "jl", descriptor = "J")
	static long aLong250;

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "()V", line = 12)
	Class265() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!g", name = "p", descriptor = "(Ljava/awt/Component;ZI)Lclient!tt;", line = 12)
	public static Class138 method26456(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		return new Class138_Sub1(arg0, arg1);
	}

	@OriginalMember(owner = "client!g", name = "l", descriptor = "(Lclient!dx;IILclient!gm;)V", line = 17)
	static void method26457(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class277 arg3) {
		@Pc(1) byte local1 = 127;
		@Pc(3) byte local3 = 7;
		for (@Pc(5) int local5 = 63; local5 >= 0; local5--) {
			@Pc(23) int local23 = (local5 & 0x3F) << 10 | (local3 & 0x7) << 7 | local1 & 0x7F;
			Class463.method29543(false, true);
			@Pc(31) int local31 = Class424.anIntArray462[local23];
			Class459.method29505(false, true);
			arg0.method20088(arg1, arg2 + ((63 - local5) * -1279656873 * arg3.anInt3875 >> 6), arg3.anInt3874 * -881188269, (arg3.anInt3875 * -1279656873 >> 6) + 1, local31 | 0xFF000000, 0);
		}
	}

	@OriginalMember(owner = "client!g", name = "v", descriptor = "(Lclient!dx;IILclient!gm;)V", line = 17)
	static void method26458(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class277 arg3) {
		@Pc(1) byte local1 = 127;
		@Pc(3) byte local3 = 7;
		for (@Pc(5) int local5 = 63; local5 >= 0; local5--) {
			@Pc(23) int local23 = (local5 & 0x3F) << 10 | (local3 & 0x7) << 7 | local1 & 0x7F;
			Class463.method29543(false, true);
			@Pc(31) int local31 = Class424.anIntArray462[local23];
			Class459.method29505(false, true);
			arg0.method20088(arg1, arg2 + ((63 - local5) * -1279656873 * arg3.anInt3875 >> 6), arg3.anInt3874 * -881188269, (arg3.anInt3875 * -1279656873 >> 6) + 1, local31 | 0xFF000000, 0);
		}
	}

	@OriginalMember(owner = "client!g", name = "aj", descriptor = "(S)J", line = 656)
	static long method26459() {
		return Class504.aClass125_2.method12699();
	}

	@OriginalMember(owner = "client!g", name = "jb", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;S)V", line = 6226)
	static final void method26460(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		arg0.aString176 = (String) arg2.anObjectArray45[(arg2.anInt5781 -= 1460193483) * 1485266147];
	}

	@OriginalMember(owner = "client!g", name = "amy", descriptor = "(Lclient!yf;B)V", line = 11806)
	static final void method26461(@OriginalArg(0) Class665 arg0) throws Exception_Sub2 {
		Class597.aClass107_Sub1_2.method8797((float) arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307] / 1000.0F);
	}

	@OriginalMember(owner = "client!g", name = "azu", descriptor = "(Lclient!yf;B)V", line = 13730)
	static final void method26462(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = client.aClass248_1.method26141(local13).method26417(local23) ? 1 : 0;
	}
}

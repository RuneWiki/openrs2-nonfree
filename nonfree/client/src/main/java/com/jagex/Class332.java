package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iv")
final class Class332 implements Interface17 {

	@OriginalMember(owner = "client!iv", name = "j", descriptor = "I")
	public static int anInt4098;

	@OriginalMember(owner = "client!iv", name = "w", descriptor = "(Lclient!pd;II)Lclient!ci;", line = 523)
	@Override
	public Class75 method27607(@OriginalArg(0) Class127 arg0, @OriginalArg(1) int arg1) {
		return (Class75) ((Interface13) Class87_Sub1.aMap5.get(arg0)).method18319(arg1);
	}

	@OriginalMember(owner = "client!iv", name = "f", descriptor = "(Lclient!pd;I)Lclient!ci;", line = 523)
	@Override
	public Class75 method27608(@OriginalArg(0) Class127 arg0, @OriginalArg(1) int arg1) {
		return (Class75) ((Interface13) Class87_Sub1.aMap5.get(arg0)).method18319(arg1);
	}

	@OriginalMember(owner = "client!iv", name = "b", descriptor = "(I)Lclient!ji;", line = 527)
	@Override
	public Class343 method27609(@OriginalArg(0) int arg0) {
		return (Class343) Class61.aClass35_Sub11_1.method18319(arg0);
	}

	@OriginalMember(owner = "client!iv", name = "t", descriptor = "(II)Lclient!ji;", line = 527)
	@Override
	public Class343 method27606(@OriginalArg(0) int arg0) {
		return (Class343) Class61.aClass35_Sub11_1.method18319(arg0);
	}

	@OriginalMember(owner = "client!iv", name = "o", descriptor = "(I)Lclient!ji;", line = 527)
	@Override
	public Class343 method27610(@OriginalArg(0) int arg0) {
		return (Class343) Class61.aClass35_Sub11_1.method18319(arg0);
	}

	@OriginalMember(owner = "client!iv", name = "n", descriptor = "(I)Lclient!ji;", line = 527)
	@Override
	public Class343 method27611(@OriginalArg(0) int arg0) {
		return (Class343) Class61.aClass35_Sub11_1.method18319(arg0);
	}

	@OriginalMember(owner = "client!iv", name = "mp", descriptor = "(B)V", line = 12376)
	public static void method27612() {
		if (Class335.method27670() == Class513.aClass513_4) {
			return;
		}
		try {
			@Pc(9) String local9 = Class331.anApplet2.getParameter(Class417.aClass417_26.aString212);
			@Pc(17) int local17 = (int) (Class280.method26667() / 86400000L) - 11745;
			@Pc(30) String local30 = "usrdob=" + local17 + "; version=1; path=/; domain=" + local9;
			Class31.method516(Class331.anApplet2, "document.cookie=\"" + local30 + "\"");
		} catch (@Pc(45) Throwable local45) {
		}
	}
}

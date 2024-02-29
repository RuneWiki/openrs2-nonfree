package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fp")
public class Class254 {

	@OriginalMember(owner = "client!fp", name = "p", descriptor = "Ljava/lang/String;")
	String aString174;

	@OriginalMember(owner = "client!fp", name = "<init>", descriptor = "(Lclient!akv;ZZ)V", line = 8)
	Class254(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (arg1) {
			arg0.method22510();
		}
		if (arg2) {
			this.aString174 = arg0.method22520();
		} else {
			this.aString174 = null;
		}
	}

	@OriginalMember(owner = "client!fp", name = "y", descriptor = "()Ljava/lang/String;", line = 18)
	public String method26195() {
		return this.aString174;
	}

	@OriginalMember(owner = "client!fp", name = "p", descriptor = "(I)Ljava/lang/String;", line = 18)
	public String method26196() {
		return this.aString174;
	}

	@OriginalMember(owner = "client!fp", name = "v", descriptor = "()Ljava/lang/String;", line = 18)
	public String method26197() {
		return this.aString174;
	}

	@OriginalMember(owner = "client!fp", name = "l", descriptor = "()Ljava/lang/String;", line = 18)
	public String method26198() {
		return this.aString174;
	}

	@OriginalMember(owner = "client!fp", name = "c", descriptor = "()Ljava/lang/String;", line = 18)
	public String method26199() {
		return this.aString174;
	}

	@OriginalMember(owner = "client!fp", name = "p", descriptor = "(I)[Lclient!yy;", line = 20)
	public static Class681[] method26200() {
		return new Class681[] { Class681.aClass681_4, Class681.aClass681_6, Class681.aClass681_5, Class681.aClass681_2, Class681.aClass681_3, Class681.aClass681_8, Class681.aClass681_9, Class681.aClass681_7 };
	}

	@OriginalMember(owner = "client!fp", name = "c", descriptor = "(II)Lclient!acr;", line = 49)
	public static Class65 method26201(@OriginalArg(0) int arg0) {
		@Pc(2) Class65[] local2 = Class652.method32970();
		@Pc(4) Class65[] local4 = local2;
		for (@Pc(6) int local6 = 0; local6 < local4.length; local6++) {
			@Pc(14) Class65 local14 = local4[local6];
			if (arg0 == local14.anInt195 * 553739443) {
				return local14;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(II)V", line = 865)
	static void method26202(@OriginalArg(0) int arg0) {
		for (@Pc(4) Class77_Sub1_Sub7 local4 = (Class77_Sub1_Sub7) Class683.aClass695_55.method36395(); local4 != null; local4 = (Class77_Sub1_Sub7) Class683.aClass695_55.method36406()) {
			if (Class588.method31743(local4.anInt2987 * -1986934021) && local4.anInt2986 * -1180225371 >> 16 == arg0) {
				Class659.method33069(local4);
			}
		}
	}
}

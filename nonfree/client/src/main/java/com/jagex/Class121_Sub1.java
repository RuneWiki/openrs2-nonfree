package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ahm")
public class Class121_Sub1 extends Class121 {

	@OriginalMember(owner = "client!ahm", name = "ps", descriptor = "I")
	static int anInt1207;

	@OriginalMember(owner = "client!ahm", name = "w", descriptor = "I")
	public final int anInt1206;

	@OriginalMember(owner = "client!ahm", name = "<init>", descriptor = "(ILclient!my;Lclient!mk;III)V", line = 9)
	Class121_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class410 arg1, @OriginalArg(2) Class402 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt1206 = arg5 * 361516917;
	}

	@OriginalMember(owner = "client!ahm", name = "t", descriptor = "(Lclient!akv;)Lclient!ml;", line = 14)
	public static Class121 method10485(@OriginalArg(0) Class77_Sub39 arg0) {
		@Pc(3) Class121 local3 = Class676.method35969(arg0);
		@Pc(7) int local7 = arg0.method22496();
		return new Class121_Sub1(local3.anInt1202 * 1909682011, local3.aClass410_5, local3.aClass402_5, local3.anInt1203 * -1151439181, local3.anInt1204 * -963484815, local7);
	}

	@OriginalMember(owner = "client!ahm", name = "w", descriptor = "()Lclient!mt;", line = 20)
	@Override
	public Class406 method28560() {
		return Class406.aClass406_7;
	}

	@OriginalMember(owner = "client!ahm", name = "c", descriptor = "(I)Lclient!mt;", line = 20)
	@Override
	public Class406 method28557() {
		return Class406.aClass406_7;
	}

	@OriginalMember(owner = "client!ahm", name = "y", descriptor = "()Lclient!mt;", line = 20)
	@Override
	public Class406 method28559() {
		return Class406.aClass406_7;
	}

	@OriginalMember(owner = "client!ahm", name = "l", descriptor = "()Lclient!mt;", line = 20)
	@Override
	public Class406 method28558() {
		return Class406.aClass406_7;
	}

	@OriginalMember(owner = "client!ahm", name = "km", descriptor = "(Lclient!gm;I)V", line = 10155)
	static void method10486(@OriginalArg(0) Class277 arg0) {
		if (!client.aBoolean619) {
			return;
		}
		if (arg0.anObjectArray12 != null) {
			@Pc(14) Class277 local14 = Class60.method884(Class173.anInt3295 * -1808298539, client.anInt3475 * -985352023);
			if (local14 != null) {
				@Pc(21) Class77_Sub41 local21 = new Class77_Sub41();
				local21.aClass277_2 = arg0;
				local21.aClass277_3 = local14;
				local21.anObjectArray4 = arg0.anObjectArray12;
				Class72.method1019(local21);
			}
		}
		@Pc(40) Class77_Sub20 local40 = Class365.method28132(Class414.aClass414_29, client.aClass82_2.aClass16_1);
		local40.aClass77_Sub39_Sub1_2.method22609(arg0.anInt3927 * 1365669833);
		local40.aClass77_Sub39_Sub1_2.method22609(arg0.anInt3936 * 403396513);
		local40.aClass77_Sub39_Sub1_2.method22635(Class173.anInt3295 * -1808298539);
		local40.aClass77_Sub39_Sub1_2.method22635(arg0.anInt3863 * -1278450723);
		local40.aClass77_Sub39_Sub1_2.method22605(client.anInt3475 * -985352023);
		local40.aClass77_Sub39_Sub1_2.method22610(client.anInt3452 * -823724811);
		client.aClass82_2.method2004(local40);
	}
}

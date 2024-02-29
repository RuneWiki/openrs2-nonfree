package com.jagex;

import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fs")
public class Class257 implements Interface27 {

	@OriginalMember(owner = "client!fs", name = "c", descriptor = "Ljava/lang/Process;")
	static Process aProcess1;

	@OriginalMember(owner = "client!fs", name = "at", descriptor = "Ljava/io/File;")
	static File aFile2;

	// $FF: synthetic field
	@OriginalMember(owner = "client!fs", name = "this$0", descriptor = "Lclient!fc;")
	final Class242 this$0;

	@OriginalMember(owner = "client!fs", name = "p", descriptor = "I")
	final int anInt3808;

	@OriginalMember(owner = "client!fs", name = "p", descriptor = "(Lclient!pw;Lclient!pw;IB)V", line = 16)
	public static void method26224(@OriginalArg(0) Class478 arg0, @OriginalArg(1) Class478 arg1) {
		Class77_Sub1_Sub17.aClass478_85 = arg0;
		Class77_Sub1_Sub17.aClass478_84 = arg1;
	}

	@OriginalMember(owner = "client!fs", name = "c", descriptor = "(II)Lclient!arb;", line = 22)
	static Class77_Sub1_Sub9 method26225(@OriginalArg(0) int arg0) {
		@Pc(5) Class77_Sub1_Sub9 local5 = (Class77_Sub1_Sub9) Class657.aClass229_1.method25813((long) arg0);
		if (local5 != null) {
			return local5;
		}
		@Pc(16) byte[] local16 = Class322.aClass478_95.method29725(arg0, 0);
		if (local16 == null || local16.length <= 1) {
			return null;
		}
		try {
			local5 = Class305.method27240(local16);
		} catch (@Pc(31) Exception local31) {
			throw new RuntimeException(local31.getMessage() + " " + arg0);
		}
		Class657.aClass229_1.method25815(local5, (long) arg0);
		return local5;
	}

	@OriginalMember(owner = "client!fs", name = "w", descriptor = "(B)I", line = 94)
	public static int method26226() {
		return 10;
	}

	@OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(Lclient!fc;Lclient!akv;)V", line = 145)
	Class257(@OriginalArg(0) Class242 arg0, @OriginalArg(1) Class77_Sub39 arg1) {
		this.this$0 = arg0;
		this.anInt3808 = arg1.method22483() * -1828033981;
	}

	@OriginalMember(owner = "client!fs", name = "c", descriptor = "(Lclient!fd;)V", line = 150)
	@Override
	public void method26977(@OriginalArg(0) Class243 arg0) {
		@Pc(7) Class241 local7 = arg0.method26054(this.anInt3808 * -1417563541);
		local7.method25991();
		local7.method25952();
		arg0.method26066(this.anInt3808 * -1417563541);
	}

	@OriginalMember(owner = "client!fs", name = "p", descriptor = "(Lclient!fd;I)V", line = 150)
	@Override
	public void method26978(@OriginalArg(0) Class243 arg0) {
		@Pc(7) Class241 local7 = arg0.method26054(this.anInt3808 * -1417563541);
		local7.method25991();
		local7.method25952();
		arg0.method26066(this.anInt3808 * -1417563541);
	}

	@OriginalMember(owner = "client!fs", name = "v", descriptor = "(Lclient!fd;)V", line = 150)
	@Override
	public void method26979(@OriginalArg(0) Class243 arg0) {
		@Pc(7) Class241 local7 = arg0.method26054(this.anInt3808 * -1417563541);
		local7.method25991();
		local7.method25952();
		arg0.method26066(this.anInt3808 * -1417563541);
	}

	@OriginalMember(owner = "client!fs", name = "ai", descriptor = "(I)Z", line = 404)
	public static boolean method26227() {
		return Class529.aTwitchTV1 != null && Class529.aTwitchTV1.IsStreaming();
	}
}

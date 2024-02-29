package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aod")
public class Exception_Sub1 extends Exception {

	@OriginalMember(owner = "client!aod", name = "q", descriptor = "Z")
	public static boolean aBoolean376;

	@OriginalMember(owner = "client!aod", name = "c", descriptor = "I")
	public final int anInt2424;

	@OriginalMember(owner = "client!aod", name = "p", descriptor = "Ljava/lang/String;")
	public final String aString65;

	@OriginalMember(owner = "client!aod", name = "<init>", descriptor = "(ILjava/lang/String;)V", line = 8)
	Exception_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		this(arg0, arg1, (Throwable) null);
	}

	@OriginalMember(owner = "client!aod", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/Throwable;)V", line = 12)
	Exception_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Throwable arg2) {
		super(arg2);
		this.aString65 = arg1;
		this.anInt2424 = arg0 * 308403261;
	}

	@OriginalMember(owner = "client!aod", name = "a", descriptor = "(IB)V", line = 152)
	public static void method17633(@OriginalArg(0) int arg0) {
		@Pc(4) Class77_Sub1_Sub6 local4 = Class456.method29469(15, (long) arg0);
		local4.method21544();
	}

	@OriginalMember(owner = "client!aod", name = "ai", descriptor = "(IS)V", line = 162)
	public static void method17634(@OriginalArg(0) int arg0) {
		@Pc(4) Class77_Sub1_Sub6 local4 = Class456.method29469(22, (long) arg0);
		local4.method21544();
	}

	@OriginalMember(owner = "client!aod", name = "air", descriptor = "(Lclient!yf;I)V", line = 10960)
	static final void method17635(@OriginalArg(0) Class665 arg0) {
		Class610.method32204();
	}
}

package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aoo")
public class Exception_Sub4 extends Exception {

	@OriginalMember(owner = "client!aoo", name = "p", descriptor = "Ljava/lang/String;")
	public final String aString66;

	@OriginalMember(owner = "client!aoo", name = "c", descriptor = "I")
	public final int anInt2467;

	@OriginalMember(owner = "client!aoo", name = "<init>", descriptor = "(ILjava/lang/String;)V", line = 8)
	public Exception_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		this(arg0, arg1, (Throwable) null);
	}

	@OriginalMember(owner = "client!aoo", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/Throwable;)V", line = 12)
	public Exception_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Throwable arg2) {
		super(arg2);
		this.aString66 = arg1;
		this.anInt2467 = arg0 * -1985666287;
	}

	@OriginalMember(owner = "client!aoo", name = "kq", descriptor = "(B)V", line = 10120)
	public static void method17924() {
		if (!client.aBoolean619) {
			return;
		}
		@Pc(11) Class277 local11 = Class60.method884(Class173.anInt3295 * -1808298539, client.anInt3475 * -985352023);
		if (local11 != null && local11.anObjectArray6 != null) {
			@Pc(21) Class77_Sub41 local21 = new Class77_Sub41();
			local21.aClass277_2 = local11;
			local21.anObjectArray4 = local11.anObjectArray6;
			Class72.method1019(local21);
		}
		client.anInt3472 = 411567433;
		client.anInt3452 = -391845725;
		client.aBoolean619 = false;
		if (local11 != null) {
			Class461.method29531(local11);
		}
	}
}

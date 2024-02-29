package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fg")
public class Class246 implements Interface27 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!fg", name = "this$0", descriptor = "Lclient!fc;")
	final Class242 this$0;

	@OriginalMember(owner = "client!fg", name = "p", descriptor = "I")
	final int anInt3800;

	@OriginalMember(owner = "client!fg", name = "c", descriptor = "Lclient!fa;")
	final Class241 aClass241_1;

	@OriginalMember(owner = "client!fg", name = "p", descriptor = "(II)Lclient!iu;", line = 18)
	public static Class331 method26126(@OriginalArg(0) int arg0) {
		if (Class331.aClass331_5.anInt4097 * -1861794503 == arg0) {
			return Class331.aClass331_5;
		} else if (arg0 == Class331.aClass331_4.anInt4097 * -1861794503) {
			return Class331.aClass331_4;
		} else if (Class331.aClass331_7.anInt4097 * -1861794503 == arg0) {
			return Class331.aClass331_7;
		} else if (Class331.aClass331_6.anInt4097 * -1861794503 == arg0) {
			return Class331.aClass331_6;
		} else if (Class331.aClass331_3.anInt4097 * -1861794503 == arg0) {
			return Class331.aClass331_3;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!fg", name = "i", descriptor = "(I)Z", line = 225)
	static boolean method26127() {
		Class675.anInt5802 = -663357284;
		Class589.aClass82_3 = client.aClass82_2;
		return Class591.method31826(Class589.aLong290 * 5952060205682133295L == -1L, true, "", "", Class589.aLong290 * 5952060205682133295L);
	}

	@OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(Lclient!fc;Lclient!akv;)V", line = 278)
	Class246(@OriginalArg(0) Class242 arg0, @OriginalArg(1) Class77_Sub39 arg1) {
		this.this$0 = arg0;
		this.anInt3800 = arg1.method22483() * 601991867;
		this.aClass241_1 = new Class241(arg1, false, false, arg0.anInterface26_2);
	}

	@OriginalMember(owner = "client!fg", name = "p", descriptor = "(Lclient!fd;I)V", line = 284)
	@Override
	public void method26978(@OriginalArg(0) Class243 arg0) {
		arg0.method26096(this.anInt3800 * 806292083, this.aClass241_1);
	}

	@OriginalMember(owner = "client!fg", name = "c", descriptor = "(Lclient!fd;)V", line = 284)
	@Override
	public void method26977(@OriginalArg(0) Class243 arg0) {
		arg0.method26096(this.anInt3800 * 806292083, this.aClass241_1);
	}

	@OriginalMember(owner = "client!fg", name = "v", descriptor = "(Lclient!fd;)V", line = 284)
	@Override
	public void method26979(@OriginalArg(0) Class243 arg0) {
		arg0.method26096(this.anInt3800 * 806292083, this.aClass241_1);
	}

	@OriginalMember(owner = "client!fg", name = "md", descriptor = "(Ljava/lang/String;ZB)Ljava/lang/String;", line = 12391)
	static String method26128(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		@Pc(5) String local5 = arg1 ? "https://" : "http://";
		if (client.aClass661_1 == Class661.aClass661_2) {
			arg0 = arg0 + "-wtrc";
		} else if (client.aClass661_1 == Class661.aClass661_14) {
			arg0 = arg0 + "-wtqa";
		} else if (client.aClass661_1 == Class661.aClass661_13) {
			arg0 = arg0 + "-wtwip";
		} else if (Class661.aClass661_6 == client.aClass661_1) {
			arg0 = arg0 + "-wti";
		} else if (Class661.aClass661_10 == client.aClass661_1) {
			arg0 = arg0 + "-demo";
		} else if (Class661.aClass661_3 == client.aClass661_1) {
			arg0 = "local";
		}
		@Pc(77) String local77 = "";
		if (client.aString157 != null) {
			local77 = "/p=" + client.aString157;
		}
		@Pc(99) String local99 = client.aClass670_4.aString245 + ".com";
		return local5 + arg0 + "." + local99 + "/l=" + Class128.aClass667_3.anInt5789 * -473969159 + "/a=" + client.anInt3378 * 1844562269 + local77 + "/";
	}
}

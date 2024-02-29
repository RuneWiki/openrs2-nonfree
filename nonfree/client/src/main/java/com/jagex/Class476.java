package com.jagex;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Callable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pu")
public class Class476 implements Callable {

	@OriginalMember(owner = "client!pu", name = "hq", descriptor = "Lclient!any;")
	public static Class35_Sub16 aClass35_Sub16_1;

	// $FF: synthetic field
	@OriginalMember(owner = "client!pu", name = "this$0", descriptor = "Lclient!po;")
	final Class470 this$0;

	@OriginalMember(owner = "client!pu", name = "p", descriptor = "Ljava/net/URL;")
	URL anURL2;

	@OriginalMember(owner = "client!pu", name = "c", descriptor = "Lclient!ata;")
	Class77_Sub1_Sub18_Sub1 aClass77_Sub1_Sub18_Sub1_2;

	@OriginalMember(owner = "client!pu", name = "p", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Z", line = 11)
	public static final boolean method29694(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3) {
		if (arg0 == null || arg2 == null) {
			return false;
		} else if (arg0.startsWith("#") || arg2.startsWith("#")) {
			return arg0.equals(arg2);
		} else {
			return arg1.equals(arg3);
		}
	}

	@OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(Lclient!po;Ljava/net/URL;Lclient!ata;)V", line = 82)
	Class476(@OriginalArg(0) Class470 arg0, @OriginalArg(1) URL arg1, @OriginalArg(2) Class77_Sub1_Sub18_Sub1 arg2) {
		this.this$0 = arg0;
		this.anURL2 = arg1;
		this.aClass77_Sub1_Sub18_Sub1_2 = arg2;
	}

	@OriginalMember(owner = "client!pu", name = "call", descriptor = "()Ljava/lang/Object;", line = 88)
	@Override
	public Object call() throws Exception {
		@Pc(3) URLConnection local3 = this.anURL2.openConnection();
		local3.setConnectTimeout(10000);
		local3.setReadTimeout(60000);
		@Pc(11) boolean local11 = true;
		try {
			local3.connect();
		} catch (@Pc(15) IOException local15) {
			this.this$0.aLong277 = Class280.method26667() * -5105697228281306819L;
			local11 = false;
		}
		return new Class480(this.this$0, local11 ? local3.getInputStream() : null, this.aClass77_Sub1_Sub18_Sub1_2, this.anURL2);
	}

	@OriginalMember(owner = "client!pu", name = "p", descriptor = "()Ljava/lang/Object;", line = 88)
	public Object method29695() throws Exception {
		@Pc(3) URLConnection local3 = this.anURL2.openConnection();
		local3.setConnectTimeout(10000);
		local3.setReadTimeout(60000);
		@Pc(11) boolean local11 = true;
		try {
			local3.connect();
		} catch (@Pc(15) IOException local15) {
			this.this$0.aLong277 = Class280.method26667() * -5105697228281306819L;
			local11 = false;
		}
		return new Class480(this.this$0, local11 ? local3.getInputStream() : null, this.aClass77_Sub1_Sub18_Sub1_2, this.anURL2);
	}

	@OriginalMember(owner = "client!pu", name = "c", descriptor = "()Ljava/lang/Object;", line = 88)
	public Object method29696() throws Exception {
		@Pc(3) URLConnection local3 = this.anURL2.openConnection();
		local3.setConnectTimeout(10000);
		local3.setReadTimeout(60000);
		@Pc(11) boolean local11 = true;
		try {
			local3.connect();
		} catch (@Pc(15) IOException local15) {
			this.this$0.aLong277 = Class280.method26667() * -5105697228281306819L;
			local11 = false;
		}
		return new Class480(this.this$0, local11 ? local3.getInputStream() : null, this.aClass77_Sub1_Sub18_Sub1_2, this.anURL2);
	}

	@OriginalMember(owner = "client!pu", name = "pb", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;B)V", line = 7293)
	static final void method29697(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt5781 -= 1460193483) * 1485266147];
		if (Class139.method14334(local13, arg2) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray35 = Class73.method1040(local13, arg2);
		arg0.aBoolean681 = true;
	}
}

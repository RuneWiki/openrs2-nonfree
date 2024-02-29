package com.jagex;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aaz")
public class Class25 {

	@OriginalMember(owner = "client!aaz", name = "v", descriptor = "I")
	public int anInt120;

	@OriginalMember(owner = "client!aaz", name = "c", descriptor = "Ljava/lang/String;")
	public String aString5;

	@OriginalMember(owner = "client!aaz", name = "l", descriptor = "I")
	public int anInt121;

	@OriginalMember(owner = "client!aaz", name = "p", descriptor = "I")
	public int anInt122;

	@OriginalMember(owner = "client!aaz", name = "y", descriptor = "Z")
	boolean aBoolean14 = true;

	@OriginalMember(owner = "client!aaz", name = "w", descriptor = "Z")
	boolean aBoolean13 = false;

	@OriginalMember(owner = "client!aaz", name = "p", descriptor = "(I)Ljava/net/Socket;", line = 19)
	public Socket method446() throws IOException {
		return this.aBoolean13 ? Class668.method33169(this.aString5, this.aBoolean14 ? this.anInt121 * 1001670253 : this.anInt120 * 606493275).method16814() : new Socket(InetAddress.getByName(this.aString5), this.aBoolean14 ? this.anInt121 * 1001670253 : this.anInt120 * 606493275);
	}

	@OriginalMember(owner = "client!aaz", name = "l", descriptor = "()Ljava/net/Socket;", line = 19)
	public Socket method447() throws IOException {
		return this.aBoolean13 ? Class668.method33169(this.aString5, this.aBoolean14 ? this.anInt121 * 1001670253 : this.anInt120 * 606493275).method16814() : new Socket(InetAddress.getByName(this.aString5), this.aBoolean14 ? this.anInt121 * 1001670253 : this.anInt120 * 606493275);
	}

	@OriginalMember(owner = "client!aaz", name = "y", descriptor = "()Ljava/net/Socket;", line = 19)
	public Socket method448() throws IOException {
		return this.aBoolean13 ? Class668.method33169(this.aString5, this.aBoolean14 ? this.anInt121 * 1001670253 : this.anInt120 * 606493275).method16814() : new Socket(InetAddress.getByName(this.aString5), this.aBoolean14 ? this.anInt121 * 1001670253 : this.anInt120 * 606493275);
	}

	@OriginalMember(owner = "client!aaz", name = "w", descriptor = "()Ljava/net/Socket;", line = 19)
	public Socket method449() throws IOException {
		return this.aBoolean13 ? Class668.method33169(this.aString5, this.aBoolean14 ? this.anInt121 * 1001670253 : this.anInt120 * 606493275).method16814() : new Socket(InetAddress.getByName(this.aString5), this.aBoolean14 ? this.anInt121 * 1001670253 : this.anInt120 * 606493275);
	}

	@OriginalMember(owner = "client!aaz", name = "c", descriptor = "(B)V", line = 24)
	public void method450() {
		if (!this.aBoolean14) {
			this.aBoolean14 = true;
			this.aBoolean13 = true;
		} else if (this.aBoolean13) {
			this.aBoolean13 = false;
		} else {
			this.aBoolean14 = false;
		}
	}

	@OriginalMember(owner = "client!aaz", name = "x", descriptor = "(Lclient!aaz;)Z", line = 35)
	public boolean method451(@OriginalArg(0) Class25 arg0) {
		if (arg0 == null) {
			return false;
		} else {
			return this.anInt122 * -1664252895 == arg0.anInt122 * -1664252895 && this.aString5.equals(arg0.aString5) && this.anInt120 * 606493275 == arg0.anInt120 * 606493275 && arg0.anInt121 * 1001670253 == this.anInt121 * 1001670253;
		}
	}

	@OriginalMember(owner = "client!aaz", name = "v", descriptor = "(Lclient!aaz;I)Z", line = 35)
	public boolean method452(@OriginalArg(0) Class25 arg0) {
		if (arg0 == null) {
			return false;
		} else {
			return this.anInt122 * -1664252895 == arg0.anInt122 * -1664252895 && this.aString5.equals(arg0.aString5) && this.anInt120 * 606493275 == arg0.anInt120 * 606493275 && arg0.anInt121 * 1001670253 == this.anInt121 * 1001670253;
		}
	}

	@OriginalMember(owner = "client!aaz", name = "t", descriptor = "(Lclient!aaz;)Z", line = 35)
	public boolean method453(@OriginalArg(0) Class25 arg0) {
		if (arg0 == null) {
			return false;
		} else {
			return this.anInt122 * -1664252895 == arg0.anInt122 * -1664252895 && this.aString5.equals(arg0.aString5) && this.anInt120 * 606493275 == arg0.anInt120 * 606493275 && arg0.anInt121 * 1001670253 == this.anInt121 * 1001670253;
		}
	}

	@OriginalMember(owner = "client!aaz", name = "q", descriptor = "(Lclient!aaz;)Z", line = 35)
	public boolean method454(@OriginalArg(0) Class25 arg0) {
		if (arg0 == null) {
			return false;
		} else {
			return this.anInt122 * -1664252895 == arg0.anInt122 * -1664252895 && this.aString5.equals(arg0.aString5) && this.anInt120 * 606493275 == arg0.anInt120 * 606493275 && arg0.anInt121 * 1001670253 == this.anInt121 * 1001670253;
		}
	}

	@OriginalMember(owner = "client!aaz", name = "d", descriptor = "(Lclient!aaz;)Z", line = 35)
	public boolean method455(@OriginalArg(0) Class25 arg0) {
		if (arg0 == null) {
			return false;
		} else {
			return this.anInt122 * -1664252895 == arg0.anInt122 * -1664252895 && this.aString5.equals(arg0.aString5) && this.anInt120 * 606493275 == arg0.anInt120 * 606493275 && arg0.anInt121 * 1001670253 == this.anInt121 * 1001670253;
		}
	}

	@OriginalMember(owner = "client!aaz", name = "ac", descriptor = "(IIIII)V", line = 219)
	static void method456(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class77_Sub1_Sub6 local4 = Class456.method29469(4, (long) arg0);
		local4.method21545();
		local4.anInt2959 = arg1 * 517206857;
		local4.anInt2953 = arg2 * -1621355885;
		local4.anInt2954 = arg3 * -105177451;
	}

	@OriginalMember(owner = "client!aaz", name = "ip", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;B)V", line = 5992)
	static final void method457(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		arg0.aString177 = null;
		arg0.aClass283_1 = null;
	}
}

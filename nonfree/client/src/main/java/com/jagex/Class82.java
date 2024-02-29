package com.jagex;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public class Class82 {

	@OriginalMember(owner = "client!ae", name = "y", descriptor = "Lclient!aaq;")
	public Class16 aClass16_1;

	@OriginalMember(owner = "client!ae", name = "p", descriptor = "Lclient!ta;")
	Class139 aClass139_1;

	@OriginalMember(owner = "client!ae", name = "i", descriptor = "I")
	int anInt321;

	@OriginalMember(owner = "client!ae", name = "t", descriptor = "Lclient!aaq;")
	Class16 aClass16_2;

	@OriginalMember(owner = "client!ae", name = "g", descriptor = "I")
	int anInt324;

	@OriginalMember(owner = "client!ae", name = "z", descriptor = "I")
	int anInt325;

	@OriginalMember(owner = "client!ae", name = "j", descriptor = "I")
	int anInt326;

	@OriginalMember(owner = "client!ae", name = "e", descriptor = "Lclient!nh;")
	Class418 aClass418_2;

	@OriginalMember(owner = "client!ae", name = "u", descriptor = "Lclient!nh;")
	Class418 aClass418_3;

	@OriginalMember(owner = "client!ae", name = "k", descriptor = "Lclient!nh;")
	Class418 aClass418_4;

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "Lclient!zm;")
	Class695 aClass695_2 = new Class695();

	@OriginalMember(owner = "client!ae", name = "v", descriptor = "I")
	public int anInt320 = 0;

	@OriginalMember(owner = "client!ae", name = "l", descriptor = "Lclient!akv;")
	Class77_Sub39 aClass77_Sub39_1 = new Class77_Sub39(1700);

	@OriginalMember(owner = "client!ae", name = "w", descriptor = "Lclient!arc;")
	Class77_Sub39_Sub1 aClass77_Sub39_Sub1_1 = new Class77_Sub39_Sub1(40000);

	@OriginalMember(owner = "client!ae", name = "q", descriptor = "Lclient!nh;")
	Class418 aClass418_1 = null;

	@OriginalMember(owner = "client!ae", name = "x", descriptor = "I")
	int anInt327 = 0;

	@OriginalMember(owner = "client!ae", name = "d", descriptor = "Z")
	boolean aBoolean51 = true;

	@OriginalMember(owner = "client!ae", name = "s", descriptor = "I")
	int anInt323 = 0;

	@OriginalMember(owner = "client!ae", name = "r", descriptor = "I")
	public int anInt322 = 0;

	@OriginalMember(owner = "client!ae", name = "f", descriptor = "Z")
	public boolean aBoolean52 = false;

	@OriginalMember(owner = "client!ae", name = "o", descriptor = "Lclient!p;")
	Class459 aClass459_1 = new Class459();

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "(Ljava/io/InputStream;IB)[B", line = 26)
	static byte[] method1997(@OriginalArg(0) InputStream arg0, @OriginalArg(1) int arg1) throws IOException {
		@Pc(2) byte[] local2 = new byte[5];
		if (arg0.read(local2, 0, 5) != 5) {
			throw new IOException("2");
		}
		@Pc(19) ByteArrayOutputStream local19 = new ByteArrayOutputStream(arg1);
		@Pc(22) Class528 local22 = Class542.aClass528_1;
		synchronized (Class542.aClass528_1) {
			if (!Class542.aClass528_1.method30701(local2)) {
				throw new IOException("3");
			}
			Class542.aClass528_1.method30698(arg0, local19, (long) arg1);
		}
		local19.flush();
		return local19.toByteArray();
	}

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "()V", line = 36)
	Class82() {
		@Pc(50) Thread local50 = new Thread(this.aClass459_1);
		local50.setDaemon(true);
		local50.setPriority(1);
		local50.start();
	}

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "(II)Lclient!xb;", line = 37)
	public static Class638 method1998(@OriginalArg(0) int arg0) {
		@Pc(2) Class638[] local2 = Class311.method27295();
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			if (local2[local4].anInt5714 * 41641943 == arg0) {
				return local2[local4];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ae", name = "p", descriptor = "(I)V", line = 44)
	final void method1999() {
		this.aClass695_2.method36380();
		this.anInt320 = 0;
	}

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "(I)V", line = 49)
	public final void method2000() throws IOException {
		if (this.aClass139_1 == null || this.anInt320 * 1030372175 <= 0) {
			return;
		}
		this.aClass77_Sub39_1.anInt3089 = 0;
		while (true) {
			@Pc(18) Class77_Sub20 local18 = (Class77_Sub20) this.aClass695_2.method36395();
			if (local18 == null || local18.anInt1525 * 1766224355 > this.aClass77_Sub39_1.aByteArray53.length - this.aClass77_Sub39_1.anInt3089 * 31645619) {
				this.aClass139_1.method14341(this.aClass77_Sub39_1.aByteArray53, 0, this.aClass77_Sub39_1.anInt3089 * 31645619);
				this.anInt324 += this.aClass77_Sub39_1.anInt3089 * -1007092627;
				this.anInt322 = 0;
				break;
			}
			this.aClass77_Sub39_1.method22452(local18.aClass77_Sub39_Sub1_2.aByteArray53, 0, local18.anInt1525 * 1766224355);
			this.anInt320 -= local18.anInt1525 * 1748003629;
			local18.method24063();
			local18.aClass77_Sub39_Sub1_2.method22401();
			local18.method13505();
		}
	}

	@OriginalMember(owner = "client!ae", name = "x", descriptor = "()V", line = 49)
	public final void method2001() throws IOException {
		if (this.aClass139_1 == null || this.anInt320 * 1030372175 <= 0) {
			return;
		}
		this.aClass77_Sub39_1.anInt3089 = 0;
		while (true) {
			@Pc(18) Class77_Sub20 local18 = (Class77_Sub20) this.aClass695_2.method36395();
			if (local18 == null || local18.anInt1525 * 1766224355 > this.aClass77_Sub39_1.aByteArray53.length - this.aClass77_Sub39_1.anInt3089 * 31645619) {
				this.aClass139_1.method14341(this.aClass77_Sub39_1.aByteArray53, 0, this.aClass77_Sub39_1.anInt3089 * 31645619);
				this.anInt324 += this.aClass77_Sub39_1.anInt3089 * -1007092627;
				this.anInt322 = 0;
				break;
			}
			this.aClass77_Sub39_1.method22452(local18.aClass77_Sub39_Sub1_2.aByteArray53, 0, local18.anInt1525 * 1766224355);
			this.anInt320 -= local18.anInt1525 * 1748003629;
			local18.method24063();
			local18.aClass77_Sub39_Sub1_2.method22401();
			local18.method13505();
		}
	}

	@OriginalMember(owner = "client!ae", name = "d", descriptor = "()V", line = 49)
	public final void method2002() throws IOException {
		if (this.aClass139_1 == null || this.anInt320 * 1030372175 <= 0) {
			return;
		}
		this.aClass77_Sub39_1.anInt3089 = 0;
		while (true) {
			@Pc(18) Class77_Sub20 local18 = (Class77_Sub20) this.aClass695_2.method36395();
			if (local18 == null || local18.anInt1525 * 1766224355 > this.aClass77_Sub39_1.aByteArray53.length - this.aClass77_Sub39_1.anInt3089 * 31645619) {
				this.aClass139_1.method14341(this.aClass77_Sub39_1.aByteArray53, 0, this.aClass77_Sub39_1.anInt3089 * 31645619);
				this.anInt324 += this.aClass77_Sub39_1.anInt3089 * -1007092627;
				this.anInt322 = 0;
				break;
			}
			this.aClass77_Sub39_1.method22452(local18.aClass77_Sub39_Sub1_2.aByteArray53, 0, local18.anInt1525 * 1766224355);
			this.anInt320 -= local18.anInt1525 * 1748003629;
			local18.method24063();
			local18.aClass77_Sub39_Sub1_2.method22401();
			local18.method13505();
		}
	}

	@OriginalMember(owner = "client!ae", name = "r", descriptor = "(Lclient!ajt;)V", line = 68)
	public final void method2003(@OriginalArg(0) Class77_Sub20 arg0) {
		this.aClass695_2.method36383(arg0);
		arg0.anInt1525 = arg0.aClass77_Sub39_Sub1_2.anInt3089 * -1802238991;
		arg0.aClass77_Sub39_Sub1_2.anInt3089 = 0;
		this.anInt320 += arg0.anInt1525 * 1748003629;
	}

	@OriginalMember(owner = "client!ae", name = "v", descriptor = "(Lclient!ajt;B)V", line = 68)
	public final void method2004(@OriginalArg(0) Class77_Sub20 arg0) {
		this.aClass695_2.method36383(arg0);
		arg0.anInt1525 = arg0.aClass77_Sub39_Sub1_2.anInt3089 * -1802238991;
		arg0.aClass77_Sub39_Sub1_2.anInt3089 = 0;
		this.anInt320 += arg0.anInt1525 * 1748003629;
	}

	@OriginalMember(owner = "client!ae", name = "s", descriptor = "(Lclient!ajt;)V", line = 68)
	public final void method2005(@OriginalArg(0) Class77_Sub20 arg0) {
		this.aClass695_2.method36383(arg0);
		arg0.anInt1525 = arg0.aClass77_Sub39_Sub1_2.anInt3089 * -1802238991;
		arg0.aClass77_Sub39_Sub1_2.anInt3089 = 0;
		this.anInt320 += arg0.anInt1525 * 1748003629;
	}

	@OriginalMember(owner = "client!ae", name = "g", descriptor = "(Lclient!ajt;)V", line = 68)
	public final void method2006(@OriginalArg(0) Class77_Sub20 arg0) {
		this.aClass695_2.method36383(arg0);
		arg0.anInt1525 = arg0.aClass77_Sub39_Sub1_2.anInt3089 * -1802238991;
		arg0.aClass77_Sub39_Sub1_2.anInt3089 = 0;
		this.anInt320 += arg0.anInt1525 * 1748003629;
	}

	@OriginalMember(owner = "client!ae", name = "r", descriptor = "(Lclient!yf;B)V", line = 71)
	static void method2007(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class484.method29856();
	}

	@OriginalMember(owner = "client!ae", name = "z", descriptor = "()V", line = 75)
	void method2008() {
		if (client.anInt3414 % 50 == 0) {
			this.anInt326 = this.anInt324 * -543443321;
			this.anInt324 = 0;
			this.anInt321 = this.anInt325 * -960782787;
			this.anInt325 = 0;
		}
	}

	@OriginalMember(owner = "client!ae", name = "l", descriptor = "(I)V", line = 75)
	void method2009() {
		if (client.anInt3414 % 50 == 0) {
			this.anInt326 = this.anInt324 * -543443321;
			this.anInt324 = 0;
			this.anInt321 = this.anInt325 * -960782787;
			this.anInt325 = 0;
		}
	}

	@OriginalMember(owner = "client!ae", name = "i", descriptor = "(Lclient!ta;Ljava/lang/String;)V", line = 84)
	void method2010(@OriginalArg(0) Class139 arg0, @OriginalArg(1) String arg1) {
		this.aClass139_1 = arg0;
		this.aClass459_1.method29501(arg1);
	}

	@OriginalMember(owner = "client!ae", name = "k", descriptor = "(Lclient!ta;Ljava/lang/String;)V", line = 84)
	void method2011(@OriginalArg(0) Class139 arg0, @OriginalArg(1) String arg1) {
		this.aClass139_1 = arg0;
		this.aClass459_1.method29501(arg1);
	}

	@OriginalMember(owner = "client!ae", name = "y", descriptor = "(Lclient!ta;Ljava/lang/String;I)V", line = 84)
	void method2012(@OriginalArg(0) Class139 arg0, @OriginalArg(1) String arg1) {
		this.aClass139_1 = arg0;
		this.aClass459_1.method29501(arg1);
	}

	@OriginalMember(owner = "client!ae", name = "j", descriptor = "(Lclient!ta;Ljava/lang/String;)V", line = 84)
	void method2013(@OriginalArg(0) Class139 arg0, @OriginalArg(1) String arg1) {
		this.aClass139_1 = arg0;
		this.aClass459_1.method29501(arg1);
	}

	@OriginalMember(owner = "client!ae", name = "w", descriptor = "(B)V", line = 89)
	void method2014() {
		if (this.aClass139_1 != null) {
			this.aClass139_1.method14345();
			this.aClass139_1 = null;
		}
		this.aClass459_1.method29501(null);
	}

	@OriginalMember(owner = "client!ae", name = "u", descriptor = "()V", line = 89)
	void method2015() {
		if (this.aClass139_1 != null) {
			this.aClass139_1.method14345();
			this.aClass139_1 = null;
		}
		this.aClass459_1.method29501(null);
	}

	@OriginalMember(owner = "client!ae", name = "t", descriptor = "(I)V", line = 97)
	void method2016() {
		this.aClass139_1 = null;
		this.aClass459_1.method29501(null);
	}

	@OriginalMember(owner = "client!ae", name = "e", descriptor = "()V", line = 97)
	void method2017() {
		this.aClass139_1 = null;
		this.aClass459_1.method29501(null);
	}

	@OriginalMember(owner = "client!ae", name = "f", descriptor = "()V", line = 97)
	void method2018() {
		this.aClass139_1 = null;
		this.aClass459_1.method29501(null);
	}

	@OriginalMember(owner = "client!ae", name = "o", descriptor = "()V", line = 97)
	void method2019() {
		this.aClass139_1 = null;
		this.aClass459_1.method29501(null);
	}

	@OriginalMember(owner = "client!ae", name = "n", descriptor = "()Lclient!ta;", line = 102)
	public Class139 method2020() {
		return this.aClass139_1;
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "()Lclient!ta;", line = 102)
	public Class139 method2021() {
		return this.aClass139_1;
	}

	@OriginalMember(owner = "client!ae", name = "q", descriptor = "(I)Lclient!ta;", line = 102)
	public Class139 method2022() {
		return this.aClass139_1;
	}

	@OriginalMember(owner = "client!ae", name = "bw", descriptor = "(II)Z", line = 1416)
	static boolean method2023(@OriginalArg(0) int arg0) {
		return arg0 == 44 || arg0 == 45 || arg0 == 46 || arg0 == 47 || arg0 == 48 || arg0 == 49 || arg0 == 50 || arg0 == 51 || arg0 == 52 || arg0 == 53 || arg0 == 15;
	}

	@OriginalMember(owner = "client!ae", name = "cr", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;B)V", line = 4914)
	static final void method2024(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		arg2.anInt5784 -= 617999126;
		arg0.anInt3879 = arg2.anIntArray536[arg2.anInt5784 * 2088438307] * 1647781287;
		if (arg0.anInt3879 * -488164841 > arg0.anInt3881 * 1500908359 - arg0.anInt3874 * -881188269) {
			arg0.anInt3879 = arg0.anInt3881 * 98803281 - arg0.anInt3874 * -1988664539;
		}
		if (arg0.anInt3879 * -488164841 < 0) {
			arg0.anInt3879 = 0;
		}
		arg0.anInt3880 = arg2.anIntArray536[arg2.anInt5784 * 2088438307 + 1] * 170726965;
		if (arg0.anInt3880 * 2142374941 > arg0.anInt3882 * -166726847 - arg0.anInt3875 * -1279656873) {
			arg0.anInt3880 = arg0.anInt3882 * -1667108235 - arg0.anInt3875 * -226772989;
		}
		if (arg0.anInt3880 * 2142374941 < 0) {
			arg0.anInt3880 = 0;
		}
		Class461.method29531(arg0);
		if (arg0.anInt3927 * 1365669833 == -1 && !arg1.aBoolean662) {
			Class635.method32676(arg0.anInt3863 * -1278450723);
		}
	}

	@OriginalMember(owner = "client!ae", name = "io", descriptor = "(Lclient!yf;I)V", line = 6101)
	static final void method2025(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class283.method26703(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!ae", name = "uh", descriptor = "(Lclient!yf;I)V", line = 8350)
	static final void method2026(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class55.aClass124_1.method11091(local12);
	}

	@OriginalMember(owner = "client!ae", name = "alf", descriptor = "(Lclient!yf;I)V", line = 11511)
	static final void method2027(@OriginalArg(0) Class665 arg0) {
		if (Class597.aClass107_Sub1_2.method8880() != Class331.aClass331_5) {
			throw new RuntimeException();
		}
		arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = Class597.aClass107_Sub1_2.method8891();
	}
}

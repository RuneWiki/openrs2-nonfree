package com.jagex;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hm")
public class Class226 implements Runnable {

	@OriginalMember(owner = "client!hm", name = "jj", descriptor = "I")
	public static int anInt3733;

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "Ljava/lang/Thread;")
	Thread aThread5;

	@OriginalMember(owner = "client!hm", name = "p", descriptor = "[Lclient!he;")
	Class219[] aClass219Array1;

	@OriginalMember(owner = "client!hm", name = "g", descriptor = "Z")
	volatile boolean aBoolean676;

	@OriginalMember(owner = "client!hm", name = "<init>", descriptor = "()V", line = 18)
	Class226() {
	}

	@OriginalMember(owner = "client!hm", name = "p", descriptor = "(II)Lclient!he;", line = 21)
	Class219 method24471(@OriginalArg(0) int arg0) {
		return this.aClass219Array1 == null || arg0 < 0 || arg0 >= this.aClass219Array1.length ? null : this.aClass219Array1[arg0];
	}

	@OriginalMember(owner = "client!hm", name = "g", descriptor = "(I)Lclient!he;", line = 21)
	Class219 method24474(@OriginalArg(0) int arg0) {
		return this.aClass219Array1 == null || arg0 < 0 || arg0 >= this.aClass219Array1.length ? null : this.aClass219Array1[arg0];
	}

	@OriginalMember(owner = "client!hm", name = "l", descriptor = "(I)Lclient!he;", line = 21)
	Class219 method24475(@OriginalArg(0) int arg0) {
		return this.aClass219Array1 == null || arg0 < 0 || arg0 >= this.aClass219Array1.length ? null : this.aClass219Array1[arg0];
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(I)Z", line = 26)
	boolean method24469() {
		if (this.aBoolean676) {
			return true;
		}
		if (this.aThread5 == null) {
			this.aThread5 = new Thread(this);
			this.aThread5.start();
		}
		return this.aBoolean676;
	}

	@OriginalMember(owner = "client!hm", name = "h", descriptor = "()Z", line = 26)
	boolean method24470() {
		if (this.aBoolean676) {
			return true;
		}
		if (this.aThread5 == null) {
			this.aThread5 = new Thread(this);
			this.aThread5.start();
		}
		return this.aBoolean676;
	}

	@OriginalMember(owner = "client!hm", name = "x", descriptor = "()Z", line = 26)
	boolean method24476() {
		if (this.aBoolean676) {
			return true;
		}
		if (this.aThread5 == null) {
			this.aThread5 = new Thread(this);
			this.aThread5.start();
		}
		return this.aBoolean676;
	}

	@OriginalMember(owner = "client!hm", name = "run", descriptor = "()V", line = 36)
	@Override
	public void run() {
		try {
			@Pc(11) int local11 = Class527.aClass527_10 == Class1.aClass527_1 ? 80 : Class570.aClass585_3.anInt5458 * 146668341 + 7000;
			@Pc(45) BufferedReader local45 = new BufferedReader(new InputStreamReader(new DataInputStream((new URL("http://" + Class570.aClass585_3.aString242 + ":" + local11 + "/news.ws?game=" + client.aClass543_2.anInt5326 * 1050721143)).openStream())));
			@Pc(48) String local48 = local45.readLine();
			@Pc(52) ArrayList local52 = new ArrayList();
			while (local48 != null) {
				local52.add(local48);
				local48 = local45.readLine();
			}
			@Pc(67) String[] local67 = new String[local52.size()];
			local52.toArray(local67);
			if (local67.length % 3 != 0) {
				return;
			}
			this.aClass219Array1 = new Class219[local67.length / 3];
			for (@Pc(86) int local86 = 0; local86 < local67.length; local86 += 3) {
				this.aClass219Array1[local86 / 3] = new Class219(local67[local86], local67[local86 + 1], local67[local86 + 2]);
			}
		} catch (@Pc(116) IOException local116) {
		}
		this.aBoolean676 = true;
	}

	@OriginalMember(owner = "client!hm", name = "j", descriptor = "()V", line = 36)
	public void method24472() {
		try {
			@Pc(11) int local11 = Class527.aClass527_10 == Class1.aClass527_1 ? 80 : Class570.aClass585_3.anInt5458 * 146668341 + 7000;
			@Pc(45) BufferedReader local45 = new BufferedReader(new InputStreamReader(new DataInputStream((new URL("http://" + Class570.aClass585_3.aString242 + ":" + local11 + "/news.ws?game=" + client.aClass543_2.anInt5326 * 1050721143)).openStream())));
			@Pc(48) String local48 = local45.readLine();
			@Pc(52) ArrayList local52 = new ArrayList();
			while (local48 != null) {
				local52.add(local48);
				local48 = local45.readLine();
			}
			@Pc(67) String[] local67 = new String[local52.size()];
			local52.toArray(local67);
			if (local67.length % 3 != 0) {
				return;
			}
			this.aClass219Array1 = new Class219[local67.length / 3];
			for (@Pc(86) int local86 = 0; local86 < local67.length; local86 += 3) {
				this.aClass219Array1[local86 / 3] = new Class219(local67[local86], local67[local86 + 1], local67[local86 + 2]);
			}
		} catch (@Pc(116) IOException local116) {
		}
		this.aBoolean676 = true;
	}

	@OriginalMember(owner = "client!hm", name = "n", descriptor = "()V", line = 36)
	public void method24473() {
		try {
			@Pc(11) int local11 = Class527.aClass527_10 == Class1.aClass527_1 ? 80 : Class570.aClass585_3.anInt5458 * 146668341 + 7000;
			@Pc(45) BufferedReader local45 = new BufferedReader(new InputStreamReader(new DataInputStream((new URL("http://" + Class570.aClass585_3.aString242 + ":" + local11 + "/news.ws?game=" + client.aClass543_2.anInt5326 * 1050721143)).openStream())));
			@Pc(48) String local48 = local45.readLine();
			@Pc(52) ArrayList local52 = new ArrayList();
			while (local48 != null) {
				local52.add(local48);
				local48 = local45.readLine();
			}
			@Pc(67) String[] local67 = new String[local52.size()];
			local52.toArray(local67);
			if (local67.length % 3 != 0) {
				return;
			}
			this.aClass219Array1 = new Class219[local67.length / 3];
			for (@Pc(86) int local86 = 0; local86 < local67.length; local86 += 3) {
				this.aClass219Array1[local86 / 3] = new Class219(local67[local86], local67[local86 + 1], local67[local86 + 2]);
			}
		} catch (@Pc(116) IOException local116) {
		}
		this.aBoolean676 = true;
	}

	@OriginalMember(owner = "client!hm", name = "l", descriptor = "(I)V", line = 302)
	static void method24481() {
		if (Class602.aClass218_20 != null) {
			Class5.aClass221_4 = new Class221();
			Class5.aClass221_4.method24389(Class231.aLong248 * -666017818301631551L, Class602.aClass218_20.aClass601_1.method33512(Class469.aClass530_2), Class602.aClass218_20.aClass601_1.method33512(Class469.aClass530_2), Class602.aClass218_20.anInt3727 * 266184707, Class602.aClass218_20);
			Class383.aThread8 = new Thread(Class5.aClass221_4, "");
			Class383.aThread8.start();
		}
	}

	@OriginalMember(owner = "client!hm", name = "ro", descriptor = "(Lclient!vs;S)V", line = 7228)
	static final void method24477(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local16.anInt3497 * -1988957173;
	}

	@OriginalMember(owner = "client!hm", name = "tk", descriptor = "(Lclient!vs;I)V", line = 7592)
	static final void method24480(@OriginalArg(0) Class536 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray42[(arg0.anInt5315 -= 790013775) * 996806575];
		@Pc(19) Class3_Sub23 local19 = Class269.method25284(Class311.aClass311_102, client.aClass82_2.aClass577_2);
		local19.aClass3_Sub41_Sub1_1.method20250(local13.length() + 1);
		local19.aClass3_Sub41_Sub1_1.method20260(local13);
		client.aClass82_2.method21601(local19);
	}

	@OriginalMember(owner = "client!hm", name = "kg", descriptor = "(IB)Ljava/lang/String;", line = 10188)
	static final String method24482(@OriginalArg(0) int arg0) {
		@Pc(2) String local2 = Integer.toString(arg0);
		for (@Pc(7) int local7 = local2.length() - 3; local7 > 0; local7 -= 3) {
			local2 = local2.substring(0, local7) + Class1.aString4 + local2.substring(local7);
		}
		if (local2.length() > 9) {
			return " " + Class271.method25310(65408) + local2.substring(0, local2.length() - 8) + Class601.aClass601_70.method33512(Class469.aClass530_2) + " (" + local2 + ")" + Class1.aString8;
		} else if (local2.length() > 6) {
			return " " + Class271.method25310(16777215) + local2.substring(0, local2.length() - 4) + Class601.aClass601_146.method33512(Class469.aClass530_2) + " (" + local2 + ")" + Class1.aString8;
		} else {
			return " " + Class271.method25310(16776960) + local2 + Class1.aString8;
		}
	}

	@OriginalMember(owner = "client!hm", name = "ail", descriptor = "(Lclient!vs;I)V", line = 10588)
	static final void method24478(@OriginalArg(0) Class536 arg0) {
		Class375.method27232(Class205.method24189());
	}

	@OriginalMember(owner = "client!hm", name = "atp", descriptor = "(Lclient!vs;I)V", line = 12462)
	static final void method24479(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class510.aClass3_Sub45_37.aClass60_Sub6_1.method14599(local12);
	}
}

package com.jagex;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hg")
public class Class221 implements Runnable {

	@OriginalMember(owner = "client!hg", name = "h", descriptor = "J")
	long aLong244;

	@OriginalMember(owner = "client!hg", name = "c", descriptor = "Lclient!hd;")
	Class218 aClass218_19;

	@OriginalMember(owner = "client!hg", name = "p", descriptor = "Z")
	volatile boolean aBoolean674;

	@OriginalMember(owner = "client!hg", name = "x", descriptor = "I")
	int anInt3729;

	@OriginalMember(owner = "client!hg", name = "s", descriptor = "J")
	long aLong245;

	@OriginalMember(owner = "client!hg", name = "u", descriptor = "Ljava/lang/String;")
	String aString188;

	@OriginalMember(owner = "client!hg", name = "y", descriptor = "Ljava/lang/String;")
	String aString189;

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "I")
	int anInt3730;

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "Z")
	boolean aBoolean675;

	@OriginalMember(owner = "client!hg", name = "g", descriptor = "Lclient!hx;")
	Interface18 anInterface18_2 = new Class217();

	@OriginalMember(owner = "client!hg", name = "l", descriptor = "Lclient!hx;")
	Interface18 anInterface18_1 = null;

	@OriginalMember(owner = "client!hg", name = "g", descriptor = "(Lclient!ps;Lclient!ps;I)V", line = 30)
	public static void method24418(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class3 arg1) {
		if (arg0.aClass3_245 != null) {
			arg0.method33656();
		}
		arg0.aClass3_245 = arg1.aClass3_245;
		arg0.aClass3_246 = arg1;
		arg0.aClass3_245.aClass3_246 = arg0;
		arg0.aClass3_246.aClass3_245 = arg0;
	}

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "()V", line = 31)
	Class221() {
	}

	@OriginalMember(owner = "client!hg", name = "p", descriptor = "(I)I", line = 34)
	int method24386() {
		return this.anInt3729 * -1523841393;
	}

	@OriginalMember(owner = "client!hg", name = "e", descriptor = "()I", line = 34)
	int method24387() {
		return this.anInt3729 * -1523841393;
	}

	@OriginalMember(owner = "client!hg", name = "r", descriptor = "()I", line = 34)
	int method24400() {
		return this.anInt3729 * -1523841393;
	}

	@OriginalMember(owner = "client!hg", name = "d", descriptor = "()V", line = 38)
	synchronized void method24397() {
		this.aBoolean675 = true;
	}

	@OriginalMember(owner = "client!hg", name = "q", descriptor = "()V", line = 38)
	synchronized void method24402() {
		this.aBoolean675 = true;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)V", line = 38)
	synchronized void method24408() {
		this.aBoolean675 = true;
	}

	@OriginalMember(owner = "client!hg", name = "g", descriptor = "(I)Z", line = 42)
	synchronized boolean method24388() {
		return this.anInterface18_2.method24487(this.aLong244 * -6325001033068847507L);
	}

	@OriginalMember(owner = "client!hg", name = "m", descriptor = "()Z", line = 42)
	synchronized boolean method24403() {
		return this.anInterface18_2.method24487(this.aLong244 * -6325001033068847507L);
	}

	@OriginalMember(owner = "client!hg", name = "v", descriptor = "()Z", line = 42)
	synchronized boolean method24404() {
		return this.anInterface18_2.method24487(this.aLong244 * -6325001033068847507L);
	}

	@OriginalMember(owner = "client!hg", name = "l", descriptor = "(Lclient!hx;I)V", line = 46)
	synchronized void method24406(@OriginalArg(0) Interface18 arg0) {
		this.anInterface18_1 = this.anInterface18_2;
		this.anInterface18_2 = arg0;
		this.aLong244 = Class176.method23413() * -2499328570299851931L;
	}

	@OriginalMember(owner = "client!hg", name = "h", descriptor = "(JLjava/lang/String;Ljava/lang/String;ILclient!hd;I)V", line = 52)
	synchronized void method24389(@OriginalArg(0) long arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class218 arg4) {
		this.aLong245 = arg0 * -6905637464281847823L;
		this.aString189 = arg1;
		this.aString188 = arg2;
		this.anInt3730 = arg3 * 882233349;
		this.aClass218_19 = arg4;
	}

	@OriginalMember(owner = "client!hg", name = "t", descriptor = "(JLjava/lang/String;Ljava/lang/String;ILclient!hd;)V", line = 52)
	synchronized void method24405(@OriginalArg(0) long arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class218 arg4) {
		this.aLong245 = arg0 * -6905637464281847823L;
		this.aString189 = arg1;
		this.aString188 = arg2;
		this.anInt3730 = arg3 * 882233349;
		this.aClass218_19 = arg4;
	}

	@OriginalMember(owner = "client!hg", name = "w", descriptor = "(JLjava/lang/String;Ljava/lang/String;ILclient!hd;)V", line = 52)
	synchronized void method24412(@OriginalArg(0) long arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class218 arg4) {
		this.aLong245 = arg0 * -6905637464281847823L;
		this.aString189 = arg1;
		this.aString188 = arg2;
		this.anInt3730 = arg3 * 882233349;
		this.aClass218_19 = arg4;
	}

	@OriginalMember(owner = "client!hg", name = "x", descriptor = "(B)I", line = 60)
	public int method24390() {
		if (this.aClass218_19 == null) {
			return 0;
		}
		@Pc(11) int local11 = this.aClass218_19.anInt3725 * 2076865137;
		if (this.aClass218_19.aBoolean673 && this.anInt3730 * -1760658227 < this.aClass218_19.anInt3726 * 1152921423) {
			return this.anInt3730 * -1760658227 + 1;
		} else if (local11 >= 0 && local11 < Class231.aClass218Array1.length - 1) {
			return this.anInt3730 * -1760658227 == this.aClass218_19.anInt3727 * 266184707 ? this.aClass218_19.anInt3726 * 1152921423 : this.aClass218_19.anInt3727 * 266184707;
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(JLjava/lang/String;I)I", line = 66)
	public static final int method24414(@OriginalArg(0) long arg0, @OriginalArg(1) String arg1) {
		@Pc(3) Random local3 = new Random();
		@Pc(8) Class3_Sub41 local8 = new Class3_Sub41(128);
		@Pc(13) Class3_Sub41 local13 = new Class3_Sub41(128);
		@Pc(16) int[] local16 = new int[] { local3.nextInt(), local3.nextInt(), (int) (arg0 >> 32), (int) arg0 };
		local8.method20250(10);
		@Pc(44) int local44;
		for (local44 = 0; local44 < 4; local44++) {
			local8.method20254(local3.nextInt());
		}
		local8.method20254(local16[0]);
		local8.method20254(local16[1]);
		local8.method20409(arg0);
		local8.method20409(0L);
		for (local44 = 0; local44 < 4; local44++) {
			local8.method20254(local3.nextInt());
		}
		local8.method20298(Class215.aBigInteger2, Class215.aBigInteger1);
		local13.method20250(10);
		for (local44 = 0; local44 < 3; local44++) {
			local13.method20254(local3.nextInt());
		}
		local13.method20409(local3.nextLong());
		local13.method20381(local3.nextLong());
		Class527.method32429(local13);
		local13.method20409(local3.nextLong());
		local13.method20298(Class215.aBigInteger2, Class215.aBigInteger1);
		local44 = Class43_Sub2.method8763(arg1);
		if (local44 % 8 != 0) {
			local44 += 8 - local44 % 8;
		}
		@Pc(147) Class3_Sub41 local147 = new Class3_Sub41(local44);
		local147.method20260(arg1);
		local147.anInt2803 = local44 * -918980331;
		local147.method20359(local16);
		@Pc(180) Class3_Sub41 local180 = new Class3_Sub41(local8.anInt2803 * 62066237 + 5 + local13.anInt2803 * 62066237 + local147.anInt2803 * 62066237);
		local180.method20250(2);
		local180.method20250(local8.anInt2803 * 62066237);
		local180.method20248(local8.aByteArray51, 0, local8.anInt2803 * 62066237);
		local180.method20250(local13.anInt2803 * 62066237);
		local180.method20248(local13.aByteArray51, 0, local13.anInt2803 * 62066237);
		local180.method20251(local147.anInt2803 * 62066237);
		local180.method20248(local147.aByteArray51, 0, local147.anInt2803 * 62066237);
		@Pc(240) String local240 = Class207.method24222(local180.aByteArray51);
		try {
			@Pc(255) URL local255 = new URL(Class599.method33503("services", false) + "m=accountappeal/login.ws");
			@Pc(258) URLConnection local258 = local255.openConnection();
			local258.setDoInput(true);
			local258.setDoOutput(true);
			local258.setConnectTimeout(5000);
			@Pc(273) OutputStreamWriter local273 = new OutputStreamWriter(local258.getOutputStream());
			local273.write("data2=" + Class476.method28797(local240) + "&dest=" + Class476.method28797("passwordchoice.ws"));
			local273.flush();
			@Pc(296) InputStream local296 = local258.getInputStream();
			local180 = new Class3_Sub41(new byte[1000]);
			do {
				@Pc(317) int local317 = local296.read(local180.aByteArray51, local180.anInt2803 * 62066237, 1000 - local180.anInt2803 * 62066237);
				if (local317 == -1) {
					local273.close();
					local296.close();
					@Pc(348) String local348 = new String(local180.aByteArray51);
					if (local348.startsWith("OFFLINE")) {
						return 4;
					} else if (local348.startsWith("WRONG")) {
						return 7;
					} else if (local348.startsWith("RELOAD")) {
						return 3;
					} else if (local348.startsWith("Not permitted for social network accounts.")) {
						return 6;
					} else {
						local180.method20295(local16);
						while (local180.anInt2803 * 62066237 > 0 && local180.aByteArray51[local180.anInt2803 * 62066237 - 1] == 0) {
							local180.anInt2803 -= -918980331;
						}
						local348 = new String(local180.aByteArray51, 0, local180.anInt2803 * 62066237);
						if (Class242.method24751(local348)) {
							Class485.method29178(local348, true, client.aBoolean569);
							return 2;
						} else {
							return 5;
						}
					}
				}
				local180.anInt2803 += local317 * -918980331;
			} while (local180.anInt2803 * 62066237 < 1000);
			return 5;
		} catch (@Pc(423) Throwable local423) {
			local423.printStackTrace();
			return 5;
		}
	}

	@OriginalMember(owner = "client!hg", name = "s", descriptor = "(I)I", line = 69)
	public int method24391() {
		return this.anInt3730 * -1760658227;
	}

	@OriginalMember(owner = "client!hg", name = "o", descriptor = "()I", line = 69)
	public int method24395() {
		return this.anInt3730 * -1760658227;
	}

	@OriginalMember(owner = "client!hg", name = "u", descriptor = "(I)Ljava/lang/String;", line = 73)
	public String method24385() {
		return this.aString188;
	}

	@OriginalMember(owner = "client!hg", name = "i", descriptor = "()Ljava/lang/String;", line = 73)
	public String method24401() {
		return this.aString188;
	}

	@OriginalMember(owner = "client!hg", name = "f", descriptor = "()Ljava/lang/String;", line = 73)
	public String method24409() {
		return this.aString188;
	}

	@OriginalMember(owner = "client!hg", name = "at", descriptor = "()Ljava/lang/String;", line = 77)
	public String method24407() {
		return this.aString189;
	}

	@OriginalMember(owner = "client!hg", name = "k", descriptor = "()Ljava/lang/String;", line = 77)
	public String method24410() {
		return this.aString189;
	}

	@OriginalMember(owner = "client!hg", name = "y", descriptor = "(B)Ljava/lang/String;", line = 77)
	public String method24411() {
		return this.aString189;
	}

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "(S)J", line = 81)
	public long method24394() {
		return this.aLong245 * -4550844619905947375L;
	}

	@OriginalMember(owner = "client!hg", name = "c", descriptor = "(I)Lclient!hd;", line = 85)
	public Class218 method24392() {
		return this.aClass218_19;
	}

	@OriginalMember(owner = "client!hg", name = "af", descriptor = "()V", line = 89)
	void method24393() {
		this.aBoolean674 = true;
	}

	@OriginalMember(owner = "client!hg", name = "z", descriptor = "(I)V", line = 89)
	void method24396() {
		this.aBoolean674 = true;
	}

	@OriginalMember(owner = "client!hg", name = "ak", descriptor = "()V", line = 89)
	void method24413() {
		this.aBoolean674 = true;
	}

	@OriginalMember(owner = "client!hg", name = "run", descriptor = "()V", line = 93)
	@Override
	public void run() {
		while (!this.aBoolean674) {
			@Pc(5) long local5 = Class176.method23413();
			synchronized (this) {
				try {
					this.anInt3729 += 1507350639;
					if (this.anInterface18_2 instanceof Class217) {
						this.anInterface18_2.method24497(this.aBoolean675);
					} else {
						@Pc(29) long local29 = Class176.method23413();
						if (Class613.aClass21_13 == null || this.anInterface18_1 == null || this.anInterface18_1.method24488() == 0 || this.aLong244 * -6325001033068847507L < local29 - (long) this.anInterface18_1.method24488()) {
							if (this.anInterface18_1 != null) {
								this.aBoolean675 = true;
								this.anInterface18_1.method24486();
								this.anInterface18_1 = null;
							}
							if (this.aBoolean675) {
								Class199.method24133();
								if (Class613.aClass21_13 != null) {
									Class613.aClass21_13.method17061(1, 0);
								}
							}
							this.anInterface18_2.method24497(this.aBoolean675 || Class613.aClass21_13 != null && Class613.aClass21_13.method17088());
						} else {
							@Pc(69) int local69 = (int) ((local29 - this.aLong244 * -6325001033068847507L) * 255L / (long) this.anInterface18_1.method24488());
							@Pc(73) int local73 = 255 - local69;
							@Pc(79) int local79 = local69 << 24 | 0xFFFFFF;
							@Pc(85) int local85 = local73 << 24 | 0xFFFFFF;
							Class199.method24133();
							Class613.aClass21_13.method17061(1, 0);
							@Pc(102) Class6 local102 = Class613.aClass21_13.method17259(Class128.anInt3317 * 2037417253, Class575.anInt5428 * 1261116487, true);
							@Pc(105) Class19_Sub1 local105 = Class613.aClass21_13.method17047();
							local105.method20882(0, local102.method16835());
							Class613.aClass21_13.method17044(local105);
							this.anInterface18_1.method24497(true);
							Class613.aClass21_13.method17263(local105);
							local102.method16794(0, 0, 0, local85, 1);
							Class613.aClass21_13.method17044(local105);
							Class613.aClass21_13.method17061(1, 0);
							this.anInterface18_2.method24497(true);
							Class613.aClass21_13.method17263(local105);
							local102.method16794(0, 0, 0, local79, 1);
						}
						try {
							if (Class613.aClass21_13 != null && !(this.anInterface18_2 instanceof Class217)) {
								Class613.aClass21_13.method17017();
							}
						} catch (@Pc(206) Exception_Sub2 local206) {
							Class27_Sub1.method7214(local206.getMessage() + Class314.aClient1.method22248(), local206);
							Class546.method32647(0, true);
						}
					}
					this.aBoolean675 = false;
					if (Class613.aClass21_13 != null && !(this.anInterface18_2 instanceof Class217) && this.aClass218_19.anInt3725 * 2076865137 < Class218.aClass218_14.anInt3725 * 2076865137) {
						Class213.method24264();
					}
				} catch (@Pc(247) Exception local247) {
					continue;
				}
			}
			@Pc(261) long local261 = Class176.method23413();
			@Pc(268) int local268 = (int) (20L - (local261 - local5));
			if (local268 > 0) {
				Class60_Sub11.method13407((long) local268);
			}
		}
	}

	@OriginalMember(owner = "client!hg", name = "n", descriptor = "()V", line = 93)
	public void method24398() {
		while (!this.aBoolean674) {
			@Pc(5) long local5 = Class176.method23413();
			synchronized (this) {
				try {
					this.anInt3729 += 1507350639;
					if (this.anInterface18_2 instanceof Class217) {
						this.anInterface18_2.method24497(this.aBoolean675);
					} else {
						@Pc(29) long local29 = Class176.method23413();
						if (Class613.aClass21_13 == null || this.anInterface18_1 == null || this.anInterface18_1.method24488() == 0 || this.aLong244 * -6325001033068847507L < local29 - (long) this.anInterface18_1.method24488()) {
							if (this.anInterface18_1 != null) {
								this.aBoolean675 = true;
								this.anInterface18_1.method24486();
								this.anInterface18_1 = null;
							}
							if (this.aBoolean675) {
								Class199.method24133();
								if (Class613.aClass21_13 != null) {
									Class613.aClass21_13.method17061(1, 0);
								}
							}
							this.anInterface18_2.method24497(this.aBoolean675 || Class613.aClass21_13 != null && Class613.aClass21_13.method17088());
						} else {
							@Pc(69) int local69 = (int) ((local29 - this.aLong244 * -6325001033068847507L) * 255L / (long) this.anInterface18_1.method24488());
							@Pc(73) int local73 = 255 - local69;
							@Pc(79) int local79 = local69 << 24 | 0xFFFFFF;
							@Pc(85) int local85 = local73 << 24 | 0xFFFFFF;
							Class199.method24133();
							Class613.aClass21_13.method17061(1, 0);
							@Pc(102) Class6 local102 = Class613.aClass21_13.method17259(Class128.anInt3317 * 2037417253, Class575.anInt5428 * 1261116487, true);
							@Pc(105) Class19_Sub1 local105 = Class613.aClass21_13.method17047();
							local105.method20882(0, local102.method16835());
							Class613.aClass21_13.method17044(local105);
							this.anInterface18_1.method24497(true);
							Class613.aClass21_13.method17263(local105);
							local102.method16794(0, 0, 0, local85, 1);
							Class613.aClass21_13.method17044(local105);
							Class613.aClass21_13.method17061(1, 0);
							this.anInterface18_2.method24497(true);
							Class613.aClass21_13.method17263(local105);
							local102.method16794(0, 0, 0, local79, 1);
						}
						try {
							if (Class613.aClass21_13 != null && !(this.anInterface18_2 instanceof Class217)) {
								Class613.aClass21_13.method17017();
							}
						} catch (@Pc(206) Exception_Sub2 local206) {
							Class27_Sub1.method7214(local206.getMessage() + Class314.aClient1.method22248(), local206);
							Class546.method32647(0, true);
						}
					}
					this.aBoolean675 = false;
					if (Class613.aClass21_13 != null && !(this.anInterface18_2 instanceof Class217) && this.aClass218_19.anInt3725 * 2076865137 < Class218.aClass218_14.anInt3725 * 2076865137) {
						Class213.method24264();
					}
				} catch (@Pc(247) Exception local247) {
					continue;
				}
			}
			@Pc(261) long local261 = Class176.method23413();
			@Pc(268) int local268 = (int) (20L - (local261 - local5));
			if (local268 > 0) {
				Class60_Sub11.method13407((long) local268);
			}
		}
	}

	@OriginalMember(owner = "client!hg", name = "j", descriptor = "()V", line = 93)
	public void method24399() {
		while (!this.aBoolean674) {
			@Pc(5) long local5 = Class176.method23413();
			synchronized (this) {
				try {
					this.anInt3729 += 1507350639;
					if (this.anInterface18_2 instanceof Class217) {
						this.anInterface18_2.method24497(this.aBoolean675);
					} else {
						@Pc(29) long local29 = Class176.method23413();
						if (Class613.aClass21_13 == null || this.anInterface18_1 == null || this.anInterface18_1.method24488() == 0 || this.aLong244 * -6325001033068847507L < local29 - (long) this.anInterface18_1.method24488()) {
							if (this.anInterface18_1 != null) {
								this.aBoolean675 = true;
								this.anInterface18_1.method24486();
								this.anInterface18_1 = null;
							}
							if (this.aBoolean675) {
								Class199.method24133();
								if (Class613.aClass21_13 != null) {
									Class613.aClass21_13.method17061(1, 0);
								}
							}
							this.anInterface18_2.method24497(this.aBoolean675 || Class613.aClass21_13 != null && Class613.aClass21_13.method17088());
						} else {
							@Pc(69) int local69 = (int) ((local29 - this.aLong244 * -6325001033068847507L) * 255L / (long) this.anInterface18_1.method24488());
							@Pc(73) int local73 = 255 - local69;
							@Pc(79) int local79 = local69 << 24 | 0xFFFFFF;
							@Pc(85) int local85 = local73 << 24 | 0xFFFFFF;
							Class199.method24133();
							Class613.aClass21_13.method17061(1, 0);
							@Pc(102) Class6 local102 = Class613.aClass21_13.method17259(Class128.anInt3317 * 2037417253, Class575.anInt5428 * 1261116487, true);
							@Pc(105) Class19_Sub1 local105 = Class613.aClass21_13.method17047();
							local105.method20882(0, local102.method16835());
							Class613.aClass21_13.method17044(local105);
							this.anInterface18_1.method24497(true);
							Class613.aClass21_13.method17263(local105);
							local102.method16794(0, 0, 0, local85, 1);
							Class613.aClass21_13.method17044(local105);
							Class613.aClass21_13.method17061(1, 0);
							this.anInterface18_2.method24497(true);
							Class613.aClass21_13.method17263(local105);
							local102.method16794(0, 0, 0, local79, 1);
						}
						try {
							if (Class613.aClass21_13 != null && !(this.anInterface18_2 instanceof Class217)) {
								Class613.aClass21_13.method17017();
							}
						} catch (@Pc(206) Exception_Sub2 local206) {
							Class27_Sub1.method7214(local206.getMessage() + Class314.aClient1.method22248(), local206);
							Class546.method32647(0, true);
						}
					}
					this.aBoolean675 = false;
					if (Class613.aClass21_13 != null && !(this.anInterface18_2 instanceof Class217) && this.aClass218_19.anInt3725 * 2076865137 < Class218.aClass218_14.anInt3725 * 2076865137) {
						Class213.method24264();
					}
				} catch (@Pc(247) Exception local247) {
					continue;
				}
			}
			@Pc(261) long local261 = Class176.method23413();
			@Pc(268) int local268 = (int) (20L - (local261 - local5));
			if (local268 > 0) {
				Class60_Sub11.method13407((long) local268);
			}
		}
	}

	@OriginalMember(owner = "client!hg", name = "z", descriptor = "(Ljava/lang/CharSequence;I)J", line = 154)
	public static long method24417(@OriginalArg(0) CharSequence arg0) {
		@Pc(2) int local2 = arg0.length();
		@Pc(4) long local4 = 0L;
		for (@Pc(6) int local6 = 0; local6 < local2; local6++) {
			local4 = (local4 << 5) - local4 + (long) arg0.charAt(local6);
		}
		return local4;
	}

	@OriginalMember(owner = "client!hg", name = "ey", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;I)V", line = 4807)
	static final void method24419(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		arg0.anInt3539 = arg2.anIntArray496[(arg2.anInt5319 -= 312124549) * 960738381] * 1274417669;
		Class223.method24442(arg0);
		if (arg0.anInt3491 * 18828465 == -1 && !arg1.aBoolean657) {
			Class34.method16499(arg0.anInt3570 * 954808515);
		}
	}

	@OriginalMember(owner = "client!hg", name = "xm", descriptor = "(Lclient!vs;I)V", line = 8418)
	static final void method24420(@OriginalArg(0) Class536 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray42[(arg0.anInt5315 -= 790013775) * 996806575];
		Class13_Sub23.method7269(local13);
	}

	@OriginalMember(owner = "client!hg", name = "aoa", descriptor = "(Lclient!vs;I)V", line = 11615)
	static final void method24415(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class510.aClass3_Sub45_37.aClass60_Sub20_1.method13662();
	}

	@OriginalMember(owner = "client!hg", name = "arw", descriptor = "(Lclient!vs;I)V", line = 12037)
	static final void method24416(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 936373647;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		@Pc(33) int local33 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 2];
		Class586.method33284(10, local13 << 16 | local23, local33, "");
	}
}

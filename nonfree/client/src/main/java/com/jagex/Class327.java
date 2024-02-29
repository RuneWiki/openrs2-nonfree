package com.jagex;

import com.jagex.twitchtv.TwitchWebcamDevice;
import com.jagex.twitchtv.TwitchWebcamDeviceCapability;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!io")
public class Class327 implements Runnable {

	@OriginalMember(owner = "client!io", name = "x", descriptor = "Ljava/lang/String;")
	String aString200;

	@OriginalMember(owner = "client!io", name = "s", descriptor = "Lclient!ih;")
	Class322 aClass322_23;

	@OriginalMember(owner = "client!io", name = "y", descriptor = "J")
	long aLong255;

	@OriginalMember(owner = "client!io", name = "w", descriptor = "I")
	int anInt4091;

	@OriginalMember(owner = "client!io", name = "t", descriptor = "J")
	long aLong256;

	@OriginalMember(owner = "client!io", name = "p", descriptor = "Z")
	volatile boolean aBoolean705;

	@OriginalMember(owner = "client!io", name = "q", descriptor = "Ljava/lang/String;")
	String aString201;

	@OriginalMember(owner = "client!io", name = "d", descriptor = "I")
	int anInt4092;

	@OriginalMember(owner = "client!io", name = "c", descriptor = "Z")
	boolean aBoolean706;

	@OriginalMember(owner = "client!io", name = "v", descriptor = "Lclient!js;")
	Interface32 anInterface32_2 = new Class325();

	@OriginalMember(owner = "client!io", name = "l", descriptor = "Lclient!js;")
	Interface32 anInterface32_1 = null;

	@OriginalMember(owner = "client!io", name = "c", descriptor = "(II)Lclient!vc;", line = 20)
	static Class592 method27538(@OriginalArg(0) int arg0) {
		@Pc(2) Class592[] local2 = Class97.method7765();
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class592 local12 = local2[local4];
			if (local12.anInt5500 * 1296567549 == arg0) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!io", name = "v", descriptor = "(Lclient!yf;I)V", line = 21)
	static void method27539(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[arg0.anInt5784 * 2088438307 - 1] = ((Class303) Class252.aClass42_Sub2_1.method18319(arg0.anIntArray536[arg0.anInt5784 * 2088438307 - 1])).anInt4052 * 510960247;
	}

	@OriginalMember(owner = "client!io", name = "<init>", descriptor = "()V", line = 31)
	Class327() {
	}

	@OriginalMember(owner = "client!io", name = "p", descriptor = "(B)I", line = 34)
	int method27540() {
		return this.anInt4091 * 599204877;
	}

	@OriginalMember(owner = "client!io", name = "k", descriptor = "()I", line = 34)
	int method27541() {
		return this.anInt4091 * 599204877;
	}

	@OriginalMember(owner = "client!io", name = "j", descriptor = "()I", line = 34)
	int method27542() {
		return this.anInt4091 * 599204877;
	}

	@OriginalMember(owner = "client!io", name = "i", descriptor = "()I", line = 34)
	int method27543() {
		return this.anInt4091 * 599204877;
	}

	@OriginalMember(owner = "client!io", name = "u", descriptor = "()I", line = 34)
	int method27544() {
		return this.anInt4091 * 599204877;
	}

	@OriginalMember(owner = "client!io", name = "c", descriptor = "(I)V", line = 38)
	synchronized void method27545() {
		this.aBoolean706 = true;
	}

	@OriginalMember(owner = "client!io", name = "e", descriptor = "()V", line = 38)
	synchronized void method27546() {
		this.aBoolean706 = true;
	}

	@OriginalMember(owner = "client!io", name = "v", descriptor = "(B)Z", line = 42)
	synchronized boolean method27547() {
		return this.anInterface32_2.method27485(this.aLong255 * -4821368797637575689L);
	}

	@OriginalMember(owner = "client!io", name = "o", descriptor = "()Z", line = 42)
	synchronized boolean method27548() {
		return this.anInterface32_2.method27485(this.aLong255 * -4821368797637575689L);
	}

	@OriginalMember(owner = "client!io", name = "f", descriptor = "()Z", line = 42)
	synchronized boolean method27549() {
		return this.anInterface32_2.method27485(this.aLong255 * -4821368797637575689L);
	}

	@OriginalMember(owner = "client!io", name = "b", descriptor = "()Z", line = 42)
	synchronized boolean method27550() {
		return this.anInterface32_2.method27485(this.aLong255 * -4821368797637575689L);
	}

	@OriginalMember(owner = "client!io", name = "l", descriptor = "(Lclient!js;I)V", line = 46)
	synchronized void method27551(@OriginalArg(0) Interface32 arg0) {
		this.anInterface32_1 = this.anInterface32_2;
		this.anInterface32_2 = arg0;
		this.aLong255 = Class280.method26667() * 3785016743543846343L;
	}

	@OriginalMember(owner = "client!io", name = "h", descriptor = "(JLjava/lang/String;Ljava/lang/String;ILclient!ih;)V", line = 52)
	synchronized void method27552(@OriginalArg(0) long arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class322 arg4) {
		this.aLong256 = arg0 * -4822812343782375811L;
		this.aString200 = arg1;
		this.aString201 = arg2;
		this.anInt4092 = arg3 * -1654524133;
		this.aClass322_23 = arg4;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(JLjava/lang/String;Ljava/lang/String;ILclient!ih;)V", line = 52)
	synchronized void method27553(@OriginalArg(0) long arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class322 arg4) {
		this.aLong256 = arg0 * -4822812343782375811L;
		this.aString200 = arg1;
		this.aString201 = arg2;
		this.anInt4092 = arg3 * -1654524133;
		this.aClass322_23 = arg4;
	}

	@OriginalMember(owner = "client!io", name = "y", descriptor = "(JLjava/lang/String;Ljava/lang/String;ILclient!ih;B)V", line = 52)
	synchronized void method27554(@OriginalArg(0) long arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class322 arg4) {
		this.aLong256 = arg0 * -4822812343782375811L;
		this.aString200 = arg1;
		this.aString201 = arg2;
		this.anInt4092 = arg3 * -1654524133;
		this.aClass322_23 = arg4;
	}

	@OriginalMember(owner = "client!io", name = "m", descriptor = "(JLjava/lang/String;Ljava/lang/String;ILclient!ih;)V", line = 52)
	synchronized void method27555(@OriginalArg(0) long arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class322 arg4) {
		this.aLong256 = arg0 * -4822812343782375811L;
		this.aString200 = arg1;
		this.aString201 = arg2;
		this.anInt4092 = arg3 * -1654524133;
		this.aClass322_23 = arg4;
	}

	@OriginalMember(owner = "client!io", name = "n", descriptor = "(JLjava/lang/String;Ljava/lang/String;ILclient!ih;)V", line = 52)
	synchronized void method27556(@OriginalArg(0) long arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class322 arg4) {
		this.aLong256 = arg0 * -4822812343782375811L;
		this.aString200 = arg1;
		this.aString201 = arg2;
		this.anInt4092 = arg3 * -1654524133;
		this.aClass322_23 = arg4;
	}

	@OriginalMember(owner = "client!io", name = "w", descriptor = "(I)I", line = 60)
	public int method27557() {
		if (this.aClass322_23 == null) {
			return 0;
		}
		@Pc(11) int local11 = this.aClass322_23.anInt4077 * -1262216053;
		if (this.aClass322_23.aBoolean699 && this.anInt4092 * 261982995 < this.aClass322_23.anInt4079 * 1646981573) {
			return this.anInt4092 * 261982995 + 1;
		} else if (local11 >= 0 && local11 < Class354.aClass322Array1.length - 1) {
			return this.aClass322_23.anInt4078 * 255476555 == this.anInt4092 * 261982995 ? this.aClass322_23.anInt4079 * 1646981573 : this.aClass322_23.anInt4078 * 255476555;
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!io", name = "aj", descriptor = "()I", line = 60)
	public int method27558() {
		if (this.aClass322_23 == null) {
			return 0;
		}
		@Pc(11) int local11 = this.aClass322_23.anInt4077 * -1262216053;
		if (this.aClass322_23.aBoolean699 && this.anInt4092 * 261982995 < this.aClass322_23.anInt4079 * 1646981573) {
			return this.anInt4092 * 261982995 + 1;
		} else if (local11 >= 0 && local11 < Class354.aClass322Array1.length - 1) {
			return this.aClass322_23.anInt4078 * 255476555 == this.anInt4092 * 261982995 ? this.aClass322_23.anInt4079 * 1646981573 : this.aClass322_23.anInt4078 * 255476555;
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!io", name = "t", descriptor = "(I)I", line = 69)
	public int method27559() {
		return this.anInt4092 * 261982995;
	}

	@OriginalMember(owner = "client!io", name = "ai", descriptor = "()I", line = 69)
	public int method27560() {
		return this.anInt4092 * 261982995;
	}

	@OriginalMember(owner = "client!io", name = "ag", descriptor = "()Ljava/lang/String;", line = 73)
	public String method27561() {
		return this.aString201;
	}

	@OriginalMember(owner = "client!io", name = "q", descriptor = "(B)Ljava/lang/String;", line = 73)
	public String method27562() {
		return this.aString201;
	}

	@OriginalMember(owner = "client!io", name = "x", descriptor = "(B)Ljava/lang/String;", line = 77)
	public String method27563() {
		return this.aString200;
	}

	@OriginalMember(owner = "client!io", name = "al", descriptor = "()Ljava/lang/String;", line = 77)
	public String method27564() {
		return this.aString200;
	}

	@OriginalMember(owner = "client!io", name = "ao", descriptor = "()Ljava/lang/String;", line = 77)
	public String method27565() {
		return this.aString200;
	}

	@OriginalMember(owner = "client!io", name = "d", descriptor = "(I)J", line = 81)
	public long method27566() {
		return this.aLong256 * -4271337981209449771L;
	}

	@OriginalMember(owner = "client!io", name = "s", descriptor = "(B)Lclient!ih;", line = 85)
	public Class322 method27567() {
		return this.aClass322_23;
	}

	@OriginalMember(owner = "client!io", name = "ak", descriptor = "()Lclient!ih;", line = 85)
	public Class322 method27568() {
		return this.aClass322_23;
	}

	@OriginalMember(owner = "client!io", name = "au", descriptor = "()Lclient!ih;", line = 85)
	public Class322 method27569() {
		return this.aClass322_23;
	}

	@OriginalMember(owner = "client!io", name = "z", descriptor = "(B)V", line = 89)
	void method27570() {
		this.aBoolean705 = true;
	}

	@OriginalMember(owner = "client!io", name = "ax", descriptor = "()V", line = 89)
	void method27571() {
		this.aBoolean705 = true;
	}

	@OriginalMember(owner = "client!io", name = "ar", descriptor = "()V", line = 89)
	void method27572() {
		this.aBoolean705 = true;
	}

	@OriginalMember(owner = "client!io", name = "ad", descriptor = "()V", line = 89)
	void method27573() {
		this.aBoolean705 = true;
	}

	@OriginalMember(owner = "client!io", name = "run", descriptor = "()V", line = 93)
	@Override
	public void run() {
		while (!this.aBoolean705) {
			@Pc(5) long local5 = Class280.method26667();
			synchronized (this) {
				try {
					this.anInt4091 += -1252275515;
					if (this.anInterface32_2 instanceof Class325) {
						this.anInterface32_2.method27490(this.aBoolean706);
					} else {
						@Pc(29) long local29 = Class280.method26667();
						if (Class284.aClass86_9 == null || this.anInterface32_1 == null || this.anInterface32_1.method27486() == 0 || this.aLong255 * -4821368797637575689L < local29 - (long) this.anInterface32_1.method27486()) {
							if (this.anInterface32_1 != null) {
								this.aBoolean706 = true;
								this.anInterface32_1.method27492();
								this.anInterface32_1 = null;
							}
							if (this.aBoolean706) {
								Class320.method27454();
								if (Class284.aClass86_9 != null) {
									Class284.aClass86_9.method20125(1, 0);
								}
							}
							this.anInterface32_2.method27490(this.aBoolean706 || Class284.aClass86_9 != null && Class284.aClass86_9.method20051());
						} else {
							@Pc(69) int local69 = (int) ((local29 - this.aLong255 * -4821368797637575689L) * 255L / (long) this.anInterface32_1.method27486());
							@Pc(73) int local73 = 255 - local69;
							@Pc(79) int local79 = local69 << 24 | 0xFFFFFF;
							@Pc(85) int local85 = local73 << 24 | 0xFFFFFF;
							Class320.method27454();
							Class284.aClass86_9.method20125(1, 0);
							@Pc(102) Class83 local102 = Class284.aClass86_9.method20007(Class149_Sub4.anInt2368 * 1771907305, Class19.anInt108 * -1091172141, true);
							@Pc(105) Class92_Sub1 local105 = Class284.aClass86_9.method20063();
							local105.method23513(0, local102.method18173());
							Class284.aClass86_9.method19968(local105);
							this.anInterface32_1.method27490(true);
							Class284.aClass86_9.method19972(local105);
							local102.method18177(0, 0, 0, local85, 1);
							Class284.aClass86_9.method19968(local105);
							Class284.aClass86_9.method20125(1, 0);
							this.anInterface32_2.method27490(true);
							Class284.aClass86_9.method19972(local105);
							local102.method18177(0, 0, 0, local79, 1);
						}
						try {
							if (Class284.aClass86_9 != null && !(this.anInterface32_2 instanceof Class325)) {
								Class284.aClass86_9.method19926();
							}
						} catch (@Pc(207) Exception_Sub7 local207) {
							Class293.method27014(local207.getMessage() + Class695.aClient1.method24900(), local207);
							Class533.method30776(0, true);
						}
					}
					this.aBoolean706 = false;
					if (Class284.aClass86_9 != null && !(this.anInterface32_2 instanceof Class325) && this.aClass322_23.anInt4077 * -1262216053 < Class322.aClass322_22.anInt4077 * -1262216053) {
						Class678.method36027();
					}
				} catch (@Pc(249) Exception local249) {
					continue;
				}
			}
			@Pc(263) long local263 = Class280.method26667();
			@Pc(270) int local270 = (int) (20L - (local263 - local5));
			if (local270 > 0) {
				Class281.method26679((long) local270);
			}
		}
	}

	@OriginalMember(owner = "client!io", name = "g", descriptor = "()V", line = 93)
	public void method27574() {
		while (!this.aBoolean705) {
			@Pc(5) long local5 = Class280.method26667();
			synchronized (this) {
				try {
					this.anInt4091 += -1252275515;
					if (this.anInterface32_2 instanceof Class325) {
						this.anInterface32_2.method27490(this.aBoolean706);
					} else {
						@Pc(29) long local29 = Class280.method26667();
						if (Class284.aClass86_9 == null || this.anInterface32_1 == null || this.anInterface32_1.method27486() == 0 || this.aLong255 * -4821368797637575689L < local29 - (long) this.anInterface32_1.method27486()) {
							if (this.anInterface32_1 != null) {
								this.aBoolean706 = true;
								this.anInterface32_1.method27492();
								this.anInterface32_1 = null;
							}
							if (this.aBoolean706) {
								Class320.method27454();
								if (Class284.aClass86_9 != null) {
									Class284.aClass86_9.method20125(1, 0);
								}
							}
							this.anInterface32_2.method27490(this.aBoolean706 || Class284.aClass86_9 != null && Class284.aClass86_9.method20051());
						} else {
							@Pc(69) int local69 = (int) ((local29 - this.aLong255 * -4821368797637575689L) * 255L / (long) this.anInterface32_1.method27486());
							@Pc(73) int local73 = 255 - local69;
							@Pc(79) int local79 = local69 << 24 | 0xFFFFFF;
							@Pc(85) int local85 = local73 << 24 | 0xFFFFFF;
							Class320.method27454();
							Class284.aClass86_9.method20125(1, 0);
							@Pc(102) Class83 local102 = Class284.aClass86_9.method20007(Class149_Sub4.anInt2368 * 1771907305, Class19.anInt108 * -1091172141, true);
							@Pc(105) Class92_Sub1 local105 = Class284.aClass86_9.method20063();
							local105.method23513(0, local102.method18173());
							Class284.aClass86_9.method19968(local105);
							this.anInterface32_1.method27490(true);
							Class284.aClass86_9.method19972(local105);
							local102.method18177(0, 0, 0, local85, 1);
							Class284.aClass86_9.method19968(local105);
							Class284.aClass86_9.method20125(1, 0);
							this.anInterface32_2.method27490(true);
							Class284.aClass86_9.method19972(local105);
							local102.method18177(0, 0, 0, local79, 1);
						}
						try {
							if (Class284.aClass86_9 != null && !(this.anInterface32_2 instanceof Class325)) {
								Class284.aClass86_9.method19926();
							}
						} catch (@Pc(207) Exception_Sub7 local207) {
							Class293.method27014(local207.getMessage() + Class695.aClient1.method24900(), local207);
							Class533.method30776(0, true);
						}
					}
					this.aBoolean706 = false;
					if (Class284.aClass86_9 != null && !(this.anInterface32_2 instanceof Class325) && this.aClass322_23.anInt4077 * -1262216053 < Class322.aClass322_22.anInt4077 * -1262216053) {
						Class678.method36027();
					}
				} catch (@Pc(249) Exception local249) {
					continue;
				}
			}
			@Pc(263) long local263 = Class280.method26667();
			@Pc(270) int local270 = (int) (20L - (local263 - local5));
			if (local270 > 0) {
				Class281.method26679((long) local270);
			}
		}
	}

	@OriginalMember(owner = "client!io", name = "r", descriptor = "()V", line = 93)
	public void method27575() {
		while (!this.aBoolean705) {
			@Pc(5) long local5 = Class280.method26667();
			synchronized (this) {
				try {
					this.anInt4091 += -1252275515;
					if (this.anInterface32_2 instanceof Class325) {
						this.anInterface32_2.method27490(this.aBoolean706);
					} else {
						@Pc(29) long local29 = Class280.method26667();
						if (Class284.aClass86_9 == null || this.anInterface32_1 == null || this.anInterface32_1.method27486() == 0 || this.aLong255 * -4821368797637575689L < local29 - (long) this.anInterface32_1.method27486()) {
							if (this.anInterface32_1 != null) {
								this.aBoolean706 = true;
								this.anInterface32_1.method27492();
								this.anInterface32_1 = null;
							}
							if (this.aBoolean706) {
								Class320.method27454();
								if (Class284.aClass86_9 != null) {
									Class284.aClass86_9.method20125(1, 0);
								}
							}
							this.anInterface32_2.method27490(this.aBoolean706 || Class284.aClass86_9 != null && Class284.aClass86_9.method20051());
						} else {
							@Pc(69) int local69 = (int) ((local29 - this.aLong255 * -4821368797637575689L) * 255L / (long) this.anInterface32_1.method27486());
							@Pc(73) int local73 = 255 - local69;
							@Pc(79) int local79 = local69 << 24 | 0xFFFFFF;
							@Pc(85) int local85 = local73 << 24 | 0xFFFFFF;
							Class320.method27454();
							Class284.aClass86_9.method20125(1, 0);
							@Pc(102) Class83 local102 = Class284.aClass86_9.method20007(Class149_Sub4.anInt2368 * 1771907305, Class19.anInt108 * -1091172141, true);
							@Pc(105) Class92_Sub1 local105 = Class284.aClass86_9.method20063();
							local105.method23513(0, local102.method18173());
							Class284.aClass86_9.method19968(local105);
							this.anInterface32_1.method27490(true);
							Class284.aClass86_9.method19972(local105);
							local102.method18177(0, 0, 0, local85, 1);
							Class284.aClass86_9.method19968(local105);
							Class284.aClass86_9.method20125(1, 0);
							this.anInterface32_2.method27490(true);
							Class284.aClass86_9.method19972(local105);
							local102.method18177(0, 0, 0, local79, 1);
						}
						try {
							if (Class284.aClass86_9 != null && !(this.anInterface32_2 instanceof Class325)) {
								Class284.aClass86_9.method19926();
							}
						} catch (@Pc(207) Exception_Sub7 local207) {
							Class293.method27014(local207.getMessage() + Class695.aClient1.method24900(), local207);
							Class533.method30776(0, true);
						}
					}
					this.aBoolean706 = false;
					if (Class284.aClass86_9 != null && !(this.anInterface32_2 instanceof Class325) && this.aClass322_23.anInt4077 * -1262216053 < Class322.aClass322_22.anInt4077 * -1262216053) {
						Class678.method36027();
					}
				} catch (@Pc(249) Exception local249) {
					continue;
				}
			}
			@Pc(263) long local263 = Class280.method26667();
			@Pc(270) int local270 = (int) (20L - (local263 - local5));
			if (local270 > 0) {
				Class281.method26679((long) local270);
			}
		}
	}

	@OriginalMember(owner = "client!io", name = "o", descriptor = "(Lclient!yf;I)V", line = 137)
	static void method27576(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		@Pc(27) TwitchWebcamDevice local27 = Class562.method31323(local13);
		@Pc(29) TwitchWebcamDeviceCapability local29 = null;
		if (local27 != null) {
			local29 = local27.p(local23);
		}
		if (local29 != null) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local29.p * -1656448669;
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local29.c * -1356474957;
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local29.v * -1260779495;
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local29.l * -1646869335;
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local29.y * -2026063923;
			return;
		}
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = -1;
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = -1;
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = -1;
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = -1;
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = -1;
	}

	@OriginalMember(owner = "client!io", name = "ve", descriptor = "(Lclient!yf;I)V", line = 8379)
	static final void method27577(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.method21131().method31901();
	}
}

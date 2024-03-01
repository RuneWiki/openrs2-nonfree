package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public class Class357 implements Runnable {

	@OriginalMember(owner = "client!jb", name = "p", descriptor = "I")
	int anInt4564;

	@OriginalMember(owner = "client!jb", name = "u", descriptor = "Ljava/lang/String;")
	String aString185;

	@OriginalMember(owner = "client!jb", name = "f", descriptor = "J")
	long aLong261;

	@OriginalMember(owner = "client!jb", name = "w", descriptor = "I")
	int anInt4565;

	@OriginalMember(owner = "client!jb", name = "l", descriptor = "J")
	long aLong262;

	@OriginalMember(owner = "client!jb", name = "n", descriptor = "Z")
	boolean aBoolean727;

	@OriginalMember(owner = "client!jb", name = "z", descriptor = "Ljava/lang/String;")
	String aString186;

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "Lclient!jw;")
	Class370 aClass370_4;

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "Z")
	volatile boolean aBoolean728;

	@OriginalMember(owner = "client!jb", name = "m", descriptor = "Lclient!jt;")
	Interface30 anInterface30_2 = new Class364();

	@OriginalMember(owner = "client!jb", name = "k", descriptor = "Lclient!jt;")
	Interface30 anInterface30_1 = null;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "()V", line = 31)
	Class357() {
	}

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "(I)I", line = 34)
	int method27732() {
		return this.anInt4565 * 722299905;
	}

	@OriginalMember(owner = "client!jb", name = "y", descriptor = "()I", line = 34)
	int method27747() {
		return this.anInt4565 * 722299905;
	}

	@OriginalMember(owner = "client!jb", name = "n", descriptor = "(I)V", line = 38)
	synchronized void method27731() {
		this.aBoolean727 = true;
	}

	@OriginalMember(owner = "client!jb", name = "q", descriptor = "()V", line = 38)
	synchronized void method27748() {
		this.aBoolean727 = true;
	}

	@OriginalMember(owner = "client!jb", name = "m", descriptor = "(B)Z", line = 42)
	synchronized boolean method27743() {
		return this.anInterface30_2.method27926(this.aLong261 * -3552011952240075205L);
	}

	@OriginalMember(owner = "client!jb", name = "h", descriptor = "(Lclient!jt;)V", line = 46)
	synchronized void method27736(@OriginalArg(0) Interface30 arg0) {
		this.anInterface30_1 = this.anInterface30_2;
		this.anInterface30_2 = arg0;
		this.aLong261 = Class305.method26796() * 5216009802569698035L;
	}

	@OriginalMember(owner = "client!jb", name = "x", descriptor = "(Lclient!jt;)V", line = 46)
	synchronized void method27749(@OriginalArg(0) Interface30 arg0) {
		this.anInterface30_1 = this.anInterface30_2;
		this.anInterface30_2 = arg0;
		this.aLong261 = Class305.method26796() * 5216009802569698035L;
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(Lclient!jt;)V", line = 46)
	synchronized void method27750(@OriginalArg(0) Interface30 arg0) {
		this.anInterface30_1 = this.anInterface30_2;
		this.anInterface30_2 = arg0;
		this.aLong261 = Class305.method26796() * 5216009802569698035L;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!jt;)V", line = 46)
	synchronized void method27752(@OriginalArg(0) Interface30 arg0) {
		this.anInterface30_1 = this.anInterface30_2;
		this.anInterface30_2 = arg0;
		this.aLong261 = Class305.method26796() * 5216009802569698035L;
	}

	@OriginalMember(owner = "client!jb", name = "k", descriptor = "(Lclient!jt;S)V", line = 46)
	synchronized void method27765(@OriginalArg(0) Interface30 arg0) {
		this.anInterface30_1 = this.anInterface30_2;
		this.anInterface30_2 = arg0;
		this.aLong261 = Class305.method26796() * 5216009802569698035L;
	}

	@OriginalMember(owner = "client!jb", name = "f", descriptor = "(JLjava/lang/String;Ljava/lang/String;ILclient!jw;S)V", line = 52)
	synchronized void method27735(@OriginalArg(0) long arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class370 arg4) {
		this.aLong262 = arg0 * -5183479944850458591L;
		this.aString186 = arg1;
		this.aString185 = arg2;
		this.anInt4564 = arg3 * -328626383;
		this.aClass370_4 = arg4;
	}

	@OriginalMember(owner = "client!jb", name = "g", descriptor = "(JLjava/lang/String;Ljava/lang/String;ILclient!jw;)V", line = 52)
	synchronized void method27753(@OriginalArg(0) long arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class370 arg4) {
		this.aLong262 = arg0 * -5183479944850458591L;
		this.aString186 = arg1;
		this.aString185 = arg2;
		this.anInt4564 = arg3 * -328626383;
		this.aClass370_4 = arg4;
	}

	@OriginalMember(owner = "client!jb", name = "i", descriptor = "(JLjava/lang/String;Ljava/lang/String;ILclient!jw;)V", line = 52)
	synchronized void method27754(@OriginalArg(0) long arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class370 arg4) {
		this.aLong262 = arg0 * -5183479944850458591L;
		this.aString186 = arg1;
		this.aString185 = arg2;
		this.anInt4564 = arg3 * -328626383;
		this.aClass370_4 = arg4;
	}

	@OriginalMember(owner = "client!jb", name = "ag", descriptor = "()I", line = 60)
	public int method27734() {
		if (this.aClass370_4 == null) {
			return 0;
		}
		@Pc(11) int local11 = this.aClass370_4.anInt4590 * -909097621;
		if (this.aClass370_4.aBoolean737 && this.anInt4564 * -741905967 < this.aClass370_4.anInt4592 * -1203887493) {
			return this.anInt4564 * -741905967 + 1;
		} else if (local11 >= 0 && local11 < Class362.aClass370Array1.length - 1) {
			return this.aClass370_4.anInt4591 * 903713925 == this.anInt4564 * -741905967 ? this.aClass370_4.anInt4592 * -1203887493 : this.aClass370_4.anInt4591 * 903713925;
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!jb", name = "t", descriptor = "()I", line = 60)
	public int method27744() {
		if (this.aClass370_4 == null) {
			return 0;
		}
		@Pc(11) int local11 = this.aClass370_4.anInt4590 * -909097621;
		if (this.aClass370_4.aBoolean737 && this.anInt4564 * -741905967 < this.aClass370_4.anInt4592 * -1203887493) {
			return this.anInt4564 * -741905967 + 1;
		} else if (local11 >= 0 && local11 < Class362.aClass370Array1.length - 1) {
			return this.aClass370_4.anInt4591 * 903713925 == this.anInt4564 * -741905967 ? this.aClass370_4.anInt4592 * -1203887493 : this.aClass370_4.anInt4591 * 903713925;
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!jb", name = "j", descriptor = "()I", line = 60)
	public int method27755() {
		if (this.aClass370_4 == null) {
			return 0;
		}
		@Pc(11) int local11 = this.aClass370_4.anInt4590 * -909097621;
		if (this.aClass370_4.aBoolean737 && this.anInt4564 * -741905967 < this.aClass370_4.anInt4592 * -1203887493) {
			return this.anInt4564 * -741905967 + 1;
		} else if (local11 >= 0 && local11 < Class362.aClass370Array1.length - 1) {
			return this.aClass370_4.anInt4591 * 903713925 == this.anInt4564 * -741905967 ? this.aClass370_4.anInt4592 * -1203887493 : this.aClass370_4.anInt4591 * 903713925;
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!jb", name = "ae", descriptor = "()I", line = 60)
	public int method27757() {
		if (this.aClass370_4 == null) {
			return 0;
		}
		@Pc(11) int local11 = this.aClass370_4.anInt4590 * -909097621;
		if (this.aClass370_4.aBoolean737 && this.anInt4564 * -741905967 < this.aClass370_4.anInt4592 * -1203887493) {
			return this.anInt4564 * -741905967 + 1;
		} else if (local11 >= 0 && local11 < Class362.aClass370Array1.length - 1) {
			return this.aClass370_4.anInt4591 * 903713925 == this.anInt4564 * -741905967 ? this.aClass370_4.anInt4592 * -1203887493 : this.aClass370_4.anInt4591 * 903713925;
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!jb", name = "w", descriptor = "(I)I", line = 60)
	public int method27760() {
		if (this.aClass370_4 == null) {
			return 0;
		}
		@Pc(11) int local11 = this.aClass370_4.anInt4590 * -909097621;
		if (this.aClass370_4.aBoolean737 && this.anInt4564 * -741905967 < this.aClass370_4.anInt4592 * -1203887493) {
			return this.anInt4564 * -741905967 + 1;
		} else if (local11 >= 0 && local11 < Class362.aClass370Array1.length - 1) {
			return this.aClass370_4.anInt4591 * 903713925 == this.anInt4564 * -741905967 ? this.aClass370_4.anInt4592 * -1203887493 : this.aClass370_4.anInt4591 * 903713925;
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!jb", name = "l", descriptor = "(I)I", line = 69)
	public int method27737() {
		return this.anInt4564 * -741905967;
	}

	@OriginalMember(owner = "client!jb", name = "ah", descriptor = "()I", line = 69)
	public int method27751() {
		return this.anInt4564 * -741905967;
	}

	@OriginalMember(owner = "client!jb", name = "u", descriptor = "(B)Ljava/lang/String;", line = 73)
	public String method27738() {
		return this.aString185;
	}

	@OriginalMember(owner = "client!jb", name = "al", descriptor = "()Ljava/lang/String;", line = 73)
	public String method27745() {
		return this.aString185;
	}

	@OriginalMember(owner = "client!jb", name = "ac", descriptor = "()Ljava/lang/String;", line = 73)
	public String method27761() {
		return this.aString185;
	}

	@OriginalMember(owner = "client!jb", name = "z", descriptor = "(I)Ljava/lang/String;", line = 77)
	public String method27739() {
		return this.aString186;
	}

	@OriginalMember(owner = "client!jb", name = "ai", descriptor = "()Ljava/lang/String;", line = 77)
	public String method27762() {
		return this.aString186;
	}

	@OriginalMember(owner = "client!jb", name = "aw", descriptor = "()Ljava/lang/String;", line = 77)
	public String method27763() {
		return this.aString186;
	}

	@OriginalMember(owner = "client!jb", name = "at", descriptor = "()J", line = 81)
	public long method27746() {
		return this.aLong262 * -1766001740248134687L;
	}

	@OriginalMember(owner = "client!jb", name = "p", descriptor = "(I)J", line = 81)
	public long method27758() {
		return this.aLong262 * -1766001740248134687L;
	}

	@OriginalMember(owner = "client!jb", name = "as", descriptor = "()J", line = 81)
	public long method27764() {
		return this.aLong262 * -1766001740248134687L;
	}

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "(I)Lclient!jw;", line = 85)
	public Class370 method27741() {
		return this.aClass370_4;
	}

	@OriginalMember(owner = "client!jb", name = "ad", descriptor = "()Lclient!jw;", line = 85)
	public Class370 method27766() {
		return this.aClass370_4;
	}

	@OriginalMember(owner = "client!jb", name = "am", descriptor = "()Lclient!jw;", line = 85)
	public Class370 method27767() {
		return this.aClass370_4;
	}

	@OriginalMember(owner = "client!jb", name = "s", descriptor = "(B)V", line = 89)
	void method27742() {
		this.aBoolean728 = true;
	}

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "()V", line = 93)
	public void method27733() {
		while (!this.aBoolean728) {
			@Pc(5) long local5 = Class305.method26796();
			synchronized (this) {
				try {
					this.anInt4565 += 981636097;
					if (this.anInterface30_2 instanceof Class364) {
						this.anInterface30_2.method27924(this.aBoolean727);
					} else {
						@Pc(29) long local29 = Class305.method26796();
						if (Class694.aClass104_14 == null || this.anInterface30_1 == null || this.anInterface30_1.method27922() == 0 || this.aLong261 * -3552011952240075205L < local29 - (long) this.anInterface30_1.method27922()) {
							if (this.anInterface30_1 != null) {
								this.aBoolean727 = true;
								this.anInterface30_1.method27925();
								this.anInterface30_1 = null;
							}
							if (this.aBoolean727) {
								Class555.method31053();
								if (Class694.aClass104_14 != null) {
									Class694.aClass104_14.method20774(1, 0);
								}
							}
							this.anInterface30_2.method27924(this.aBoolean727 || Class694.aClass104_14 != null && Class694.aClass104_14.method20422());
						} else {
							@Pc(69) int local69 = (int) ((local29 - this.aLong261 * -3552011952240075205L) * 255L / (long) this.anInterface30_1.method27922());
							@Pc(73) int local73 = 255 - local69;
							@Pc(79) int local79 = local69 << 24 | 0xFFFFFF;
							@Pc(85) int local85 = local73 << 24 | 0xFFFFFF;
							Class555.method31053();
							Class694.aClass104_14.method20774(1, 0);
							@Pc(102) Class100 local102 = Class694.aClass104_14.method20664(Class553.anInt3408 * -1378711501, Class553.anInt3416 * 2091353777, true);
							@Pc(105) Class112_Sub1 local105 = Class694.aClass104_14.method20444();
							local105.method23434(0, local102.method18167());
							Class694.aClass104_14.method20441(local105);
							this.anInterface30_1.method27924(true);
							Class694.aClass104_14.method20442(local105);
							local102.method18173(0, 0, 0, local85, 1);
							Class694.aClass104_14.method20441(local105);
							Class694.aClass104_14.method20774(1, 0);
							this.anInterface30_2.method27924(true);
							Class694.aClass104_14.method20442(local105);
							local102.method18173(0, 0, 0, local79, 1);
						}
						try {
							if (Class694.aClass104_14 != null && !(this.anInterface30_2 instanceof Class364)) {
								Class694.aClass104_14.method20414();
							}
						} catch (@Pc(206) Exception_Sub4 local206) {
							Class646.method32610(local206.getMessage() + Class717.aClient1.method24853(), local206);
							Class543.method30948(0, true);
						}
					}
					this.aBoolean727 = false;
					if (Class694.aClass104_14 != null && !(this.anInterface30_2 instanceof Class364) && this.aClass370_4.anInt4590 * -909097621 < Class370.aClass370_19.anInt4590 * -909097621) {
						Class274.method26340();
					}
				} catch (@Pc(248) Exception local248) {
					continue;
				}
			}
			@Pc(262) long local262 = Class305.method26796();
			@Pc(269) int local269 = (int) (20L - (local262 - local5));
			if (local269 > 0) {
				Class212.method25439((long) local269);
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "o", descriptor = "()V", line = 93)
	public void method27740() {
		while (!this.aBoolean728) {
			@Pc(5) long local5 = Class305.method26796();
			synchronized (this) {
				try {
					this.anInt4565 += 981636097;
					if (this.anInterface30_2 instanceof Class364) {
						this.anInterface30_2.method27924(this.aBoolean727);
					} else {
						@Pc(29) long local29 = Class305.method26796();
						if (Class694.aClass104_14 == null || this.anInterface30_1 == null || this.anInterface30_1.method27922() == 0 || this.aLong261 * -3552011952240075205L < local29 - (long) this.anInterface30_1.method27922()) {
							if (this.anInterface30_1 != null) {
								this.aBoolean727 = true;
								this.anInterface30_1.method27925();
								this.anInterface30_1 = null;
							}
							if (this.aBoolean727) {
								Class555.method31053();
								if (Class694.aClass104_14 != null) {
									Class694.aClass104_14.method20774(1, 0);
								}
							}
							this.anInterface30_2.method27924(this.aBoolean727 || Class694.aClass104_14 != null && Class694.aClass104_14.method20422());
						} else {
							@Pc(69) int local69 = (int) ((local29 - this.aLong261 * -3552011952240075205L) * 255L / (long) this.anInterface30_1.method27922());
							@Pc(73) int local73 = 255 - local69;
							@Pc(79) int local79 = local69 << 24 | 0xFFFFFF;
							@Pc(85) int local85 = local73 << 24 | 0xFFFFFF;
							Class555.method31053();
							Class694.aClass104_14.method20774(1, 0);
							@Pc(102) Class100 local102 = Class694.aClass104_14.method20664(Class553.anInt3408 * -1378711501, Class553.anInt3416 * 2091353777, true);
							@Pc(105) Class112_Sub1 local105 = Class694.aClass104_14.method20444();
							local105.method23434(0, local102.method18167());
							Class694.aClass104_14.method20441(local105);
							this.anInterface30_1.method27924(true);
							Class694.aClass104_14.method20442(local105);
							local102.method18173(0, 0, 0, local85, 1);
							Class694.aClass104_14.method20441(local105);
							Class694.aClass104_14.method20774(1, 0);
							this.anInterface30_2.method27924(true);
							Class694.aClass104_14.method20442(local105);
							local102.method18173(0, 0, 0, local79, 1);
						}
						try {
							if (Class694.aClass104_14 != null && !(this.anInterface30_2 instanceof Class364)) {
								Class694.aClass104_14.method20414();
							}
						} catch (@Pc(206) Exception_Sub4 local206) {
							Class646.method32610(local206.getMessage() + Class717.aClient1.method24853(), local206);
							Class543.method30948(0, true);
						}
					}
					this.aBoolean727 = false;
					if (Class694.aClass104_14 != null && !(this.anInterface30_2 instanceof Class364) && this.aClass370_4.anInt4590 * -909097621 < Class370.aClass370_19.anInt4590 * -909097621) {
						Class274.method26340();
					}
				} catch (@Pc(248) Exception local248) {
					continue;
				}
			}
			@Pc(262) long local262 = Class305.method26796();
			@Pc(269) int local269 = (int) (20L - (local262 - local5));
			if (local269 > 0) {
				Class212.method25439((long) local269);
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "run", descriptor = "()V", line = 93)
	@Override
	public void run() {
		while (!this.aBoolean728) {
			@Pc(5) long local5 = Class305.method26796();
			synchronized (this) {
				try {
					this.anInt4565 += 981636097;
					if (this.anInterface30_2 instanceof Class364) {
						this.anInterface30_2.method27924(this.aBoolean727);
					} else {
						@Pc(29) long local29 = Class305.method26796();
						if (Class694.aClass104_14 == null || this.anInterface30_1 == null || this.anInterface30_1.method27922() == 0 || this.aLong261 * -3552011952240075205L < local29 - (long) this.anInterface30_1.method27922()) {
							if (this.anInterface30_1 != null) {
								this.aBoolean727 = true;
								this.anInterface30_1.method27925();
								this.anInterface30_1 = null;
							}
							if (this.aBoolean727) {
								Class555.method31053();
								if (Class694.aClass104_14 != null) {
									Class694.aClass104_14.method20774(1, 0);
								}
							}
							this.anInterface30_2.method27924(this.aBoolean727 || Class694.aClass104_14 != null && Class694.aClass104_14.method20422());
						} else {
							@Pc(69) int local69 = (int) ((local29 - this.aLong261 * -3552011952240075205L) * 255L / (long) this.anInterface30_1.method27922());
							@Pc(73) int local73 = 255 - local69;
							@Pc(79) int local79 = local69 << 24 | 0xFFFFFF;
							@Pc(85) int local85 = local73 << 24 | 0xFFFFFF;
							Class555.method31053();
							Class694.aClass104_14.method20774(1, 0);
							@Pc(102) Class100 local102 = Class694.aClass104_14.method20664(Class553.anInt3408 * -1378711501, Class553.anInt3416 * 2091353777, true);
							@Pc(105) Class112_Sub1 local105 = Class694.aClass104_14.method20444();
							local105.method23434(0, local102.method18167());
							Class694.aClass104_14.method20441(local105);
							this.anInterface30_1.method27924(true);
							Class694.aClass104_14.method20442(local105);
							local102.method18173(0, 0, 0, local85, 1);
							Class694.aClass104_14.method20441(local105);
							Class694.aClass104_14.method20774(1, 0);
							this.anInterface30_2.method27924(true);
							Class694.aClass104_14.method20442(local105);
							local102.method18173(0, 0, 0, local79, 1);
						}
						try {
							if (Class694.aClass104_14 != null && !(this.anInterface30_2 instanceof Class364)) {
								Class694.aClass104_14.method20414();
							}
						} catch (@Pc(206) Exception_Sub4 local206) {
							Class646.method32610(local206.getMessage() + Class717.aClient1.method24853(), local206);
							Class543.method30948(0, true);
						}
					}
					this.aBoolean727 = false;
					if (Class694.aClass104_14 != null && !(this.anInterface30_2 instanceof Class364) && this.aClass370_4.anInt4590 * -909097621 < Class370.aClass370_19.anInt4590 * -909097621) {
						Class274.method26340();
					}
				} catch (@Pc(248) Exception local248) {
					continue;
				}
			}
			@Pc(262) long local262 = Class305.method26796();
			@Pc(269) int local269 = (int) (20L - (local262 - local5));
			if (local269 > 0) {
				Class212.method25439((long) local269);
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "v", descriptor = "()V", line = 93)
	public void method27756() {
		while (!this.aBoolean728) {
			@Pc(5) long local5 = Class305.method26796();
			synchronized (this) {
				try {
					this.anInt4565 += 981636097;
					if (this.anInterface30_2 instanceof Class364) {
						this.anInterface30_2.method27924(this.aBoolean727);
					} else {
						@Pc(29) long local29 = Class305.method26796();
						if (Class694.aClass104_14 == null || this.anInterface30_1 == null || this.anInterface30_1.method27922() == 0 || this.aLong261 * -3552011952240075205L < local29 - (long) this.anInterface30_1.method27922()) {
							if (this.anInterface30_1 != null) {
								this.aBoolean727 = true;
								this.anInterface30_1.method27925();
								this.anInterface30_1 = null;
							}
							if (this.aBoolean727) {
								Class555.method31053();
								if (Class694.aClass104_14 != null) {
									Class694.aClass104_14.method20774(1, 0);
								}
							}
							this.anInterface30_2.method27924(this.aBoolean727 || Class694.aClass104_14 != null && Class694.aClass104_14.method20422());
						} else {
							@Pc(69) int local69 = (int) ((local29 - this.aLong261 * -3552011952240075205L) * 255L / (long) this.anInterface30_1.method27922());
							@Pc(73) int local73 = 255 - local69;
							@Pc(79) int local79 = local69 << 24 | 0xFFFFFF;
							@Pc(85) int local85 = local73 << 24 | 0xFFFFFF;
							Class555.method31053();
							Class694.aClass104_14.method20774(1, 0);
							@Pc(102) Class100 local102 = Class694.aClass104_14.method20664(Class553.anInt3408 * -1378711501, Class553.anInt3416 * 2091353777, true);
							@Pc(105) Class112_Sub1 local105 = Class694.aClass104_14.method20444();
							local105.method23434(0, local102.method18167());
							Class694.aClass104_14.method20441(local105);
							this.anInterface30_1.method27924(true);
							Class694.aClass104_14.method20442(local105);
							local102.method18173(0, 0, 0, local85, 1);
							Class694.aClass104_14.method20441(local105);
							Class694.aClass104_14.method20774(1, 0);
							this.anInterface30_2.method27924(true);
							Class694.aClass104_14.method20442(local105);
							local102.method18173(0, 0, 0, local79, 1);
						}
						try {
							if (Class694.aClass104_14 != null && !(this.anInterface30_2 instanceof Class364)) {
								Class694.aClass104_14.method20414();
							}
						} catch (@Pc(206) Exception_Sub4 local206) {
							Class646.method32610(local206.getMessage() + Class717.aClient1.method24853(), local206);
							Class543.method30948(0, true);
						}
					}
					this.aBoolean727 = false;
					if (Class694.aClass104_14 != null && !(this.anInterface30_2 instanceof Class364) && this.aClass370_4.anInt4590 * -909097621 < Class370.aClass370_19.anInt4590 * -909097621) {
						Class274.method26340();
					}
				} catch (@Pc(248) Exception local248) {
					continue;
				}
			}
			@Pc(262) long local262 = Class305.method26796();
			@Pc(269) int local269 = (int) (20L - (local262 - local5));
			if (local269 > 0) {
				Class212.method25439((long) local269);
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "r", descriptor = "()V", line = 93)
	public void method27759() {
		while (!this.aBoolean728) {
			@Pc(5) long local5 = Class305.method26796();
			synchronized (this) {
				try {
					this.anInt4565 += 981636097;
					if (this.anInterface30_2 instanceof Class364) {
						this.anInterface30_2.method27924(this.aBoolean727);
					} else {
						@Pc(29) long local29 = Class305.method26796();
						if (Class694.aClass104_14 == null || this.anInterface30_1 == null || this.anInterface30_1.method27922() == 0 || this.aLong261 * -3552011952240075205L < local29 - (long) this.anInterface30_1.method27922()) {
							if (this.anInterface30_1 != null) {
								this.aBoolean727 = true;
								this.anInterface30_1.method27925();
								this.anInterface30_1 = null;
							}
							if (this.aBoolean727) {
								Class555.method31053();
								if (Class694.aClass104_14 != null) {
									Class694.aClass104_14.method20774(1, 0);
								}
							}
							this.anInterface30_2.method27924(this.aBoolean727 || Class694.aClass104_14 != null && Class694.aClass104_14.method20422());
						} else {
							@Pc(69) int local69 = (int) ((local29 - this.aLong261 * -3552011952240075205L) * 255L / (long) this.anInterface30_1.method27922());
							@Pc(73) int local73 = 255 - local69;
							@Pc(79) int local79 = local69 << 24 | 0xFFFFFF;
							@Pc(85) int local85 = local73 << 24 | 0xFFFFFF;
							Class555.method31053();
							Class694.aClass104_14.method20774(1, 0);
							@Pc(102) Class100 local102 = Class694.aClass104_14.method20664(Class553.anInt3408 * -1378711501, Class553.anInt3416 * 2091353777, true);
							@Pc(105) Class112_Sub1 local105 = Class694.aClass104_14.method20444();
							local105.method23434(0, local102.method18167());
							Class694.aClass104_14.method20441(local105);
							this.anInterface30_1.method27924(true);
							Class694.aClass104_14.method20442(local105);
							local102.method18173(0, 0, 0, local85, 1);
							Class694.aClass104_14.method20441(local105);
							Class694.aClass104_14.method20774(1, 0);
							this.anInterface30_2.method27924(true);
							Class694.aClass104_14.method20442(local105);
							local102.method18173(0, 0, 0, local79, 1);
						}
						try {
							if (Class694.aClass104_14 != null && !(this.anInterface30_2 instanceof Class364)) {
								Class694.aClass104_14.method20414();
							}
						} catch (@Pc(206) Exception_Sub4 local206) {
							Class646.method32610(local206.getMessage() + Class717.aClient1.method24853(), local206);
							Class543.method30948(0, true);
						}
					}
					this.aBoolean727 = false;
					if (Class694.aClass104_14 != null && !(this.anInterface30_2 instanceof Class364) && this.aClass370_4.anInt4590 * -909097621 < Class370.aClass370_19.anInt4590 * -909097621) {
						Class274.method26340();
					}
				} catch (@Pc(248) Exception local248) {
					continue;
				}
			}
			@Pc(262) long local262 = Class305.method26796();
			@Pc(269) int local269 = (int) (20L - (local262 - local5));
			if (local269 > 0) {
				Class212.method25439((long) local269);
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "(I)V", line = 236)
	public static void method27769() {
		Class362.aBoolean730 = true;
		Class7.aString2 = Class411.aString200;
		Class490.aString217 = Class411.aString201;
		Class642.method32522(false);
		Class283.method26477();
		Class362.aClass370Array1 = null;
		Class275.aClass496_1 = null;
		Class481.method29756(5);
	}

	@OriginalMember(owner = "client!jb", name = "ht", descriptor = "(Lclient!yf;I)V", line = 6413)
	static final void method27768(@OriginalArg(0) Class681 arg0) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32805(local12);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class453.method28965(local16, local22, arg0, Class310.aClass310_2);
	}

	@OriginalMember(owner = "client!jb", name = "bfn", descriptor = "(Lclient!yf;B)V", line = 15137)
	static final void method27770(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 100;
	}
}

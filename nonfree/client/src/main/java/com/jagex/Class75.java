package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ci")
public abstract class Class75 implements Interface11 {

	@OriginalMember(owner = "client!ci", name = "ao", descriptor = "I")
	static int anInt224;

	@OriginalMember(owner = "client!ci", name = "v", descriptor = "Lclient!qu;")
	public Class498 aClass498_6;

	@OriginalMember(owner = "client!ci", name = "l", descriptor = "Lclient!pf;")
	public Class462 aClass462_3 = Class462.aClass462_6;

	@OriginalMember(owner = "client!ci", name = "y", descriptor = "Z")
	public boolean aBoolean23 = true;

	@OriginalMember(owner = "client!ci", name = "p", descriptor = "Lclient!pd;")
	public final Class127 aClass127_3;

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "I")
	public int anInt223;

	@OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(Lclient!pd;I)V", line = 16)
	Class75(@OriginalArg(0) Class127 arg0, @OriginalArg(1) int arg1) {
		this.aClass127_3 = arg0;
		this.anInt223 = arg1 * -1851992313;
	}

	@OriginalMember(owner = "client!ci", name = "v", descriptor = "(Lclient!akv;)V", line = 23)
	@Override
	public void method36032(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			@Pc(14) Class192 local14 = (Class192) Class457.method29479(Class209.method25582(), local3);
			if (local14 == null) {
				this.method1152(arg0, local3);
			} else {
				switch(local14.anInt3544 * 1108078243) {
					case 0:
						Class457.method29479(Class502.method30225(), arg0.method22478());
						break;
					case 1:
						arg0.method22526();
						break;
					case 2:
						this.aClass462_3 = (Class462) Class457.method29479(Class632.method32643(), arg0.method22478());
						break;
					case 3:
						this.aBoolean23 = false;
					case 4:
						break;
					case 5:
					default:
						throw new IllegalStateException("");
					case 6:
						@Pc(30) int local30 = arg0.method22478();
						this.aClass498_6 = (Class498) Class457.method29479(Class498.method30187(), local30);
						if (this.aClass498_6 == null) {
							throw new IllegalStateException("");
						}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ci", name = "p", descriptor = "(Lclient!akv;B)V", line = 23)
	@Override
	public void method36031(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			@Pc(14) Class192 local14 = (Class192) Class457.method29479(Class209.method25582(), local3);
			if (local14 == null) {
				this.method1152(arg0, local3);
			} else {
				switch(local14.anInt3544 * 1108078243) {
					case 0:
						Class457.method29479(Class502.method30225(), arg0.method22478());
						break;
					case 1:
						arg0.method22526();
						break;
					case 2:
						this.aClass462_3 = (Class462) Class457.method29479(Class632.method32643(), arg0.method22478());
						break;
					case 3:
						this.aBoolean23 = false;
					case 4:
						break;
					case 5:
					default:
						throw new IllegalStateException("");
					case 6:
						@Pc(30) int local30 = arg0.method22478();
						this.aClass498_6 = (Class498) Class457.method29479(Class498.method30187(), local30);
						if (this.aClass498_6 == null) {
							throw new IllegalStateException("");
						}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ci", name = "l", descriptor = "(Lclient!akv;)V", line = 23)
	@Override
	public void method36030(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			@Pc(14) Class192 local14 = (Class192) Class457.method29479(Class209.method25582(), local3);
			if (local14 == null) {
				this.method1152(arg0, local3);
			} else {
				switch(local14.anInt3544 * 1108078243) {
					case 0:
						Class457.method29479(Class502.method30225(), arg0.method22478());
						break;
					case 1:
						arg0.method22526();
						break;
					case 2:
						this.aClass462_3 = (Class462) Class457.method29479(Class632.method32643(), arg0.method22478());
						break;
					case 3:
						this.aBoolean23 = false;
					case 4:
						break;
					case 5:
					default:
						throw new IllegalStateException("");
					case 6:
						@Pc(30) int local30 = arg0.method22478();
						this.aClass498_6 = (Class498) Class457.method29479(Class498.method30187(), local30);
						if (this.aClass498_6 == null) {
							throw new IllegalStateException("");
						}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ci", name = "y", descriptor = "(Lclient!akv;)V", line = 23)
	@Override
	public void method36033(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			@Pc(14) Class192 local14 = (Class192) Class457.method29479(Class209.method25582(), local3);
			if (local14 == null) {
				this.method1152(arg0, local3);
			} else {
				switch(local14.anInt3544 * 1108078243) {
					case 0:
						Class457.method29479(Class502.method30225(), arg0.method22478());
						break;
					case 1:
						arg0.method22526();
						break;
					case 2:
						this.aClass462_3 = (Class462) Class457.method29479(Class632.method32643(), arg0.method22478());
						break;
					case 3:
						this.aBoolean23 = false;
					case 4:
						break;
					case 5:
					default:
						throw new IllegalStateException("");
					case 6:
						@Pc(30) int local30 = arg0.method22478();
						this.aClass498_6 = (Class498) Class457.method29479(Class498.method30187(), local30);
						if (this.aClass498_6 == null) {
							throw new IllegalStateException("");
						}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ci", name = "x", descriptor = "(I)Z", line = 58)
	boolean method1138() {
		return this.aClass127_3 != null && this.aClass498_6 != null;
	}

	@OriginalMember(owner = "client!ci", name = "g", descriptor = "()Z", line = 58)
	boolean method1139() {
		return this.aClass127_3 != null && this.aClass498_6 != null;
	}

	@OriginalMember(owner = "client!ci", name = "z", descriptor = "()Z", line = 58)
	boolean method1140() {
		return this.aClass127_3 != null && this.aClass498_6 != null;
	}

	@OriginalMember(owner = "client!ci", name = "i", descriptor = "()Z", line = 58)
	boolean method1141() {
		return this.aClass127_3 != null && this.aClass498_6 != null;
	}

	@OriginalMember(owner = "client!ci", name = "j", descriptor = "()Z", line = 58)
	boolean method1142() {
		return this.aClass127_3 != null && this.aClass498_6 != null;
	}

	@OriginalMember(owner = "client!ci", name = "f", descriptor = "()Ljava/lang/Object;", line = 63)
	public Object method1143() {
		return this.aClass127_3.method13148(this);
	}

	@OriginalMember(owner = "client!ci", name = "d", descriptor = "(I)Ljava/lang/Object;", line = 63)
	public Object method1144() {
		return this.aClass127_3.method13148(this);
	}

	@OriginalMember(owner = "client!ci", name = "u", descriptor = "()Ljava/lang/Object;", line = 63)
	public Object method1145() {
		return this.aClass127_3.method13148(this);
	}

	@OriginalMember(owner = "client!ci", name = "k", descriptor = "()Ljava/lang/Object;", line = 63)
	public Object method1146() {
		return this.aClass127_3.method13148(this);
	}

	@OriginalMember(owner = "client!ci", name = "e", descriptor = "()Ljava/lang/Object;", line = 63)
	public Object method1147() {
		return this.aClass127_3.method13148(this);
	}

	@OriginalMember(owner = "client!ci", name = "fz", descriptor = "(ILjava/lang/String;ZB)V", line = 2017)
	public static void method1148(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		if (arg0 == 0) {
			Class284.aClass86_9 = Class345.method27828(0, Class470.aCanvas6, Class147.aClass209_7, Class77.anInterface24_117, Class354.aClass411_1, Class112.aClass405_3, Class392.aClass398_1, Class323.aClass478_96, Class35_Sub6.aClass77_Sub35_45.aClass143_Sub28_1.method15926() * 2);
			if (arg1 != null) {
				Class284.aClass86_9.method20125(1, 0);
				@Pc(35) Class17 local35 = Class316.method27377(Class145.aClass478_46, Class611.anInt5570 * -849564261, 0, Class367.aClass415_1);
				@Pc(46) Class94 local46 = Class284.aClass86_9.method20111(local35, Class210.method25596(Class470.aClass478_125, Class611.anInt5570 * -849564261, 0), true);
				Class320.method27454();
				Class685.method36274(arg1, true, Class284.aClass86_9, local46, local35);
			}
		} else {
			label245: {
				@Pc(58) Class86 local58 = null;
				if (arg1 != null) {
					local58 = Class345.method27828(0, Class470.aCanvas6, Class147.aClass209_7, Class77.anInterface24_117, Class354.aClass411_1, Class112.aClass405_3, Class392.aClass398_1, Class323.aClass478_96, 0);
					local58.method20125(1, 0);
					@Pc(85) Class17 local85 = Class151.method23390(Class145.aClass478_46, Class611.anInt5570 * -849564261, 0);
					@Pc(96) Class94 local96 = local58.method20111(local85, Class210.method25596(Class470.aClass478_125, Class611.anInt5570 * -849564261, 0), true);
					Class320.method27454();
					Class685.method36274(arg1, true, local58, local96, local85);
					try {
						local58.method19929();
						local58 = null;
					} catch (@Pc(112) Throwable local112) {
					}
				}
				try {
					try {
						Class331.method27604();
						System.gc();
						Class284.aClass86_9 = Class345.method27828(arg0, Class470.aCanvas6, Class147.aClass209_7, Class77.anInterface24_117, Class354.aClass411_1, Class112.aClass405_3, Class392.aClass398_1, Class323.aClass478_96, Class35_Sub6.aClass77_Sub35_45.aClass143_Sub28_1.method15926() * 2);
						Class367.aClass415_1 = new Class415(Class284.aClass86_9, Class470.aClass478_125, Class145.aClass478_46, Class26.method461());
						if (Class284.aClass86_9.method20050()) {
							@Pc(146) boolean local146 = true;
							try {
								local146 = Class96_Sub23.aClass77_Sub28_1.anInt1615 * -686202593 > 256;
							} catch (@Pc(158) Throwable local158) {
							}
							@Pc(164) Class77_Sub2 local164;
							if (local146) {
								local164 = Class284.aClass86_9.method20100(146800640);
							} else {
								local164 = Class284.aClass86_9.method20100(104857600);
							}
							Class284.aClass86_9.method20300(local164);
						}
						break label245;
					} catch (@Pc(181) Throwable local181) {
						switch(arg0) {
							case 1:
								Class347.method27848(Class27.aClass27_4);
								break;
							case 3:
								Class347.method27848(Class27.aClass27_14);
						}
					}
					if (local181 instanceof RuntimeException_Sub4) {
						Class35_Sub6.aClass77_Sub35_45.aClass143_Sub28_2.method16258(0);
						Class35_Sub6.aClass77_Sub35_45.aClass143_Sub28_1.method16258(0);
					}
					@Pc(208) int local208 = Class35_Sub6.aClass77_Sub35_45.aClass143_Sub6_1.method15109();
					Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub6_1, 0);
					if (local58 != null) {
						try {
							local58.method19929();
							local58 = null;
						} catch (@Pc(223) Throwable local223) {
						}
					}
					Class331.method27604();
					System.gc();
					method1148(local208, arg1, arg2);
				} finally {
					if (local58 != null) {
						try {
							local58.method19929();
						} catch (@Pc(247) Throwable local247) {
						}
					}
				}
				return;
			}
		}
		if (arg2) {
			Class35_Sub6.aClass77_Sub35_45.method14383(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub6_1, !arg2);
		}
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub6_1, arg0);
		if (!arg2) {
			Class35_Sub6.aClass77_Sub35_45.method14383(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub6_1, !arg2);
		}
		Class143_Sub38.method16161();
		Class284.aClass86_9.method20114(20000);
		Class284.aClass86_9.method20127(32);
		client.aClass517_1.method30479();
		if (Class284.aClass86_9.method20296()) {
			Class205.method25565(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub19_1.method15668() == 1);
		}
		client.aClass517_1.method30474(true);
		client.aClass517_1.method30443().method32293();
		Class145.method15077();
		client.aBoolean593 = false;
		client.aBoolean594 = false;
		client.aBoolean598 = true;
		Class583.aClass7Array1 = null;
		Class284.aClass86_9.method20081(0.0F, 1.0F);
	}

	@OriginalMember(owner = "client!ci", name = "asu", descriptor = "(Lclient!yf;B)V", line = 12581)
	static final void method1149(@OriginalArg(0) Class665 arg0) {
		Class320.method27455(0, 0, client.aClass277_6.anInt3874 * -881188269, client.aClass277_6.anInt3875 * -1279656873, false);
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = client.anInt3482 * -610622155;
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = client.anInt3463 * 608745565;
	}

	@OriginalMember(owner = "client!ci", name = "s", descriptor = "(Lclient!akv;I)V")
	abstract void method1150(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ci", name = "r", descriptor = "(Lclient!akv;I)V")
	abstract void method1151(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ci", name = "q", descriptor = "(Lclient!akv;IB)V")
	abstract void method1152(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1);
}

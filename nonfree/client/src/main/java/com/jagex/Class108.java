package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
public abstract class Class108 implements Interface12 {

	@OriginalMember(owner = "client!ec", name = "i", descriptor = "Lclient!py;")
	static Class497 aClass497_21;

	@OriginalMember(owner = "client!ec", name = "m", descriptor = "Lclient!qw;")
	public Class519 aClass519_6;

	@OriginalMember(owner = "client!ec", name = "k", descriptor = "Lclient!qj;")
	public Class507 aClass507_3 = Class507.aClass507_5;

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "Z")
	public boolean aBoolean173 = true;

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "Lclient!qe;")
	public final Class138 aClass138_6;

	@OriginalMember(owner = "client!ec", name = "n", descriptor = "I")
	public int anInt867;

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(Lclient!qe;I)V", line = 16)
	Class108(@OriginalArg(0) Class138 arg0, @OriginalArg(1) int arg1) {
		this.aClass138_6 = arg0;
		this.anInt867 = arg1 * 143990783;
	}

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "(Lclient!alw;B)V", line = 23)
	@Override
	public void method36654(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22413();
			if (local3 == 0) {
				return;
			}
			@Pc(14) Class252 local14 = (Class252) Class107.method18119(Class112_Sub2.method23761(), local3);
			if (local14 == null) {
				this.method7436(arg0, local3);
			} else {
				switch(local14.anInt3846 * -272738995) {
					case 0:
						this.aBoolean173 = false;
						break;
					case 1:
						@Pc(50) int local50 = arg0.method22413();
						this.aClass519_6 = (Class519) Class107.method18119(Class519.method30312(), local50);
						if (this.aClass519_6 != null) {
							break;
						}
						throw new IllegalStateException("");
					case 2:
						arg0.method22428();
						break;
					case 3:
						Class107.method18119(Class420.method28744(), arg0.method22413());
						break;
					case 4:
					default:
						throw new IllegalStateException("");
					case 5:
						break;
					case 6:
						this.aClass507_3 = (Class507) Class107.method18119(Class174.method24346(), arg0.method22413());
				}
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "m", descriptor = "(Lclient!alw;)V", line = 23)
	@Override
	public void method36655(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22413();
			if (local3 == 0) {
				return;
			}
			@Pc(14) Class252 local14 = (Class252) Class107.method18119(Class112_Sub2.method23761(), local3);
			if (local14 == null) {
				this.method7436(arg0, local3);
			} else {
				switch(local14.anInt3846 * -272738995) {
					case 0:
						this.aBoolean173 = false;
						break;
					case 1:
						@Pc(50) int local50 = arg0.method22413();
						this.aClass519_6 = (Class519) Class107.method18119(Class519.method30312(), local50);
						if (this.aClass519_6 != null) {
							break;
						}
						throw new IllegalStateException("");
					case 2:
						arg0.method22428();
						break;
					case 3:
						Class107.method18119(Class420.method28744(), arg0.method22413());
						break;
					case 4:
					default:
						throw new IllegalStateException("");
					case 5:
						break;
					case 6:
						this.aClass507_3 = (Class507) Class107.method18119(Class174.method24346(), arg0.method22413());
				}
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "k", descriptor = "(Lclient!alw;)V", line = 23)
	@Override
	public void method36656(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22413();
			if (local3 == 0) {
				return;
			}
			@Pc(14) Class252 local14 = (Class252) Class107.method18119(Class112_Sub2.method23761(), local3);
			if (local14 == null) {
				this.method7436(arg0, local3);
			} else {
				switch(local14.anInt3846 * -272738995) {
					case 0:
						this.aBoolean173 = false;
						break;
					case 1:
						@Pc(50) int local50 = arg0.method22413();
						this.aClass519_6 = (Class519) Class107.method18119(Class519.method30312(), local50);
						if (this.aClass519_6 != null) {
							break;
						}
						throw new IllegalStateException("");
					case 2:
						arg0.method22428();
						break;
					case 3:
						Class107.method18119(Class420.method28744(), arg0.method22413());
						break;
					case 4:
					default:
						throw new IllegalStateException("");
					case 5:
						break;
					case 6:
						this.aClass507_3 = (Class507) Class107.method18119(Class174.method24346(), arg0.method22413());
				}
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "w", descriptor = "(Lclient!alw;)V", line = 23)
	@Override
	public void method36658(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22413();
			if (local3 == 0) {
				return;
			}
			@Pc(14) Class252 local14 = (Class252) Class107.method18119(Class112_Sub2.method23761(), local3);
			if (local14 == null) {
				this.method7436(arg0, local3);
			} else {
				switch(local14.anInt3846 * -272738995) {
					case 0:
						this.aBoolean173 = false;
						break;
					case 1:
						@Pc(50) int local50 = arg0.method22413();
						this.aClass519_6 = (Class519) Class107.method18119(Class519.method30312(), local50);
						if (this.aClass519_6 != null) {
							break;
						}
						throw new IllegalStateException("");
					case 2:
						arg0.method22428();
						break;
					case 3:
						Class107.method18119(Class420.method28744(), arg0.method22413());
						break;
					case 4:
					default:
						throw new IllegalStateException("");
					case 5:
						break;
					case 6:
						this.aClass507_3 = (Class507) Class107.method18119(Class174.method24346(), arg0.method22413());
				}
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "(Lclient!alw;)V", line = 23)
	@Override
	public void method36657(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22413();
			if (local3 == 0) {
				return;
			}
			@Pc(14) Class252 local14 = (Class252) Class107.method18119(Class112_Sub2.method23761(), local3);
			if (local14 == null) {
				this.method7436(arg0, local3);
			} else {
				switch(local14.anInt3846 * -272738995) {
					case 0:
						this.aBoolean173 = false;
						break;
					case 1:
						@Pc(50) int local50 = arg0.method22413();
						this.aClass519_6 = (Class519) Class107.method18119(Class519.method30312(), local50);
						if (this.aClass519_6 != null) {
							break;
						}
						throw new IllegalStateException("");
					case 2:
						arg0.method22428();
						break;
					case 3:
						Class107.method18119(Class420.method28744(), arg0.method22413());
						break;
					case 4:
					default:
						throw new IllegalStateException("");
					case 5:
						break;
					case 6:
						this.aClass507_3 = (Class507) Class107.method18119(Class174.method24346(), arg0.method22413());
				}
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "z", descriptor = "(B)Z", line = 58)
	boolean method7437() {
		return this.aClass138_6 != null && this.aClass519_6 != null;
	}

	@OriginalMember(owner = "client!ec", name = "v", descriptor = "()Z", line = 58)
	boolean method7441() {
		return this.aClass138_6 != null && this.aClass519_6 != null;
	}

	@OriginalMember(owner = "client!ec", name = "o", descriptor = "()Z", line = 58)
	boolean method7442() {
		return this.aClass138_6 != null && this.aClass519_6 != null;
	}

	@OriginalMember(owner = "client!ec", name = "s", descriptor = "()Z", line = 58)
	boolean method7443() {
		return this.aClass138_6 != null && this.aClass519_6 != null;
	}

	@OriginalMember(owner = "client!ec", name = "x", descriptor = "()Ljava/lang/Object;", line = 63)
	public Object method7435() {
		return this.aClass138_6.method11521(this);
	}

	@OriginalMember(owner = "client!ec", name = "p", descriptor = "(B)Ljava/lang/Object;", line = 63)
	public Object method7438() {
		return this.aClass138_6.method11521(this);
	}

	@OriginalMember(owner = "client!ec", name = "y", descriptor = "()Ljava/lang/Object;", line = 63)
	public Object method7444() {
		return this.aClass138_6.method11521(this);
	}

	@OriginalMember(owner = "client!ec", name = "q", descriptor = "()Ljava/lang/Object;", line = 63)
	public Object method7445() {
		return this.aClass138_6.method11521(this);
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "()Ljava/lang/Object;", line = 63)
	public Object method7447() {
		return this.aClass138_6.method11521(this);
	}

	@OriginalMember(owner = "client!ec", name = "r", descriptor = "(Lclient!yf;I)V", line = 65)
	static void method7450(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray519[arg0.anInt5891 * -1497248091 - 2] = ((Class347) Class288.aClass55_Sub2_1.method18261(arg0.anIntArray519[arg0.anInt5891 * -1497248091 - 2])).anIntArrayArray57[arg0.anIntArray519[arg0.anInt5891 * -1497248091 - 1]][0];
		arg0.anInt5891 -= 1189701933;
	}

	@OriginalMember(owner = "client!ec", name = "ark", descriptor = "(Lclient!yf;B)V", line = 13018)
	static final void method7448(@OriginalArg(0) Class681 arg0) {
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub36_1, arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091]);
		Class106_Sub1.method5148();
		client.aBoolean601 = false;
	}

	@OriginalMember(owner = "client!ec", name = "auy", descriptor = "(Lclient!yf;I)V", line = 13429)
	static final void method7451(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class125_Sub3.aClass93_Sub42_1.anInt2055 * 714183489 < 512 || client.aBoolean595 || client.aBoolean600 ? 1 : 0;
	}

	@OriginalMember(owner = "client!ec", name = "avw", descriptor = "(Lclient!yf;I)V", line = 13505)
	static final void method7449(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
	}

	@OriginalMember(owner = "client!ec", name = "u", descriptor = "(Lclient!alw;IS)V")
	abstract void method7436(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "(Lclient!alw;I)V")
	abstract void method7439(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ec", name = "r", descriptor = "(Lclient!alw;I)V")
	abstract void method7440(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "(Lclient!alw;I)V")
	abstract void method7446(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1);
}

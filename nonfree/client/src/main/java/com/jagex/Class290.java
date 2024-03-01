package com.jagex;

import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ky")
public class Class290 implements Interface2 {

	@OriginalMember(owner = "client!ky", name = "s", descriptor = "[I")
	static int[] anIntArray411 = new int[32];

	@OriginalMember(owner = "client!ky", name = "a", descriptor = "Lclient!zy;")
	Class70_Sub2 aClass70_Sub2_2;

	@OriginalMember(owner = "client!ky", name = "l", descriptor = "I")
	int anInt4366;

	@OriginalMember(owner = "client!ky", name = "p", descriptor = "I")
	public int anInt4367;

	@OriginalMember(owner = "client!ky", name = "h", descriptor = "I")
	int anInt4368;

	@OriginalMember(owner = "client!ky", name = "x", descriptor = "Ljava/lang/String;")
	String aString196;

	@OriginalMember(owner = "client!ky", name = "g", descriptor = "Lclient!cy;")
	public Class11 aClass11_1;

	static {
		@Pc(4) int local4 = 2;
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			anIntArray411[local6] = local4 - 1;
			local4 += local4;
		}
	}

	@OriginalMember(owner = "client!ky", name = "<init>", descriptor = "()V", line = 27)
	Class290() {
	}

	@OriginalMember(owner = "client!ky", name = "p", descriptor = "(Lclient!ahb;ZI)V", line = 31)
	void method25521(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) boolean arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.method20269();
			if (local3 == 0) {
				return;
			}
			this.method25532(arg0, local3, arg1);
		}
	}

	@OriginalMember(owner = "client!ky", name = "h", descriptor = "(Lclient!ahb;Z)V", line = 31)
	void method25525(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) boolean arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.method20269();
			if (local3 == 0) {
				return;
			}
			this.method25532(arg0, local3, arg1);
		}
	}

	@OriginalMember(owner = "client!ky", name = "x", descriptor = "(Lclient!ahb;Z)V", line = 31)
	void method25526(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) boolean arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.method20269();
			if (local3 == 0) {
				return;
			}
			this.method25532(arg0, local3, arg1);
		}
	}

	@OriginalMember(owner = "client!ky", name = "s", descriptor = "(Lclient!ahb;IZ)V", line = 38)
	void method25527(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(6) Class279 local6 = (Class279) Class356.method26649(Class287.method25496(), arg1);
		switch(local6.anInt4333 * -74295175) {
			case 2:
				this.anInt4366 = arg0.method20269() * 702704879;
				this.anInt4368 = arg0.method20269() * -609716497;
				break;
			case 4:
				@Pc(32) int local32 = arg0.method20269();
				@Pc(39) Class43 local39 = (Class43) Class356.method26649(Class43.method9496(), local32);
				if (local39 == null) {
					throw new IllegalStateException("");
				}
				@Pc(51) int local51 = arg0.method20375();
				@Pc(58) Class70_Sub1 local58 = (Class70_Sub1) this.aClass70_Sub2_2.aMap20.get(local39);
				if (local58 != null) {
					this.aClass11_1 = local58.method14717(local51);
				} else if (!arg2) {
					throw new IllegalStateException("");
				}
			case 10:
		}
	}

	@OriginalMember(owner = "client!ky", name = "a", descriptor = "(Lclient!ahb;IZB)V", line = 38)
	void method25532(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(6) Class279 local6 = (Class279) Class356.method26649(Class287.method25496(), arg1);
		switch(local6.anInt4333 * -74295175) {
			case 2:
				this.anInt4366 = arg0.method20269() * 702704879;
				this.anInt4368 = arg0.method20269() * -609716497;
				break;
			case 4:
				@Pc(32) int local32 = arg0.method20269();
				@Pc(39) Class43 local39 = (Class43) Class356.method26649(Class43.method9496(), local32);
				if (local39 == null) {
					throw new IllegalStateException("");
				}
				@Pc(51) int local51 = arg0.method20375();
				@Pc(58) Class70_Sub1 local58 = (Class70_Sub1) this.aClass70_Sub2_2.aMap20.get(local39);
				if (local58 != null) {
					this.aClass11_1 = local58.method14717(local51);
				} else if (!arg2) {
					throw new IllegalStateException("");
				}
			case 10:
		}
	}

	@OriginalMember(owner = "client!ky", name = "u", descriptor = "(Lclient!ahb;IZ)V", line = 38)
	void method25533(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(6) Class279 local6 = (Class279) Class356.method26649(Class287.method25496(), arg1);
		switch(local6.anInt4333 * -74295175) {
			case 2:
				this.anInt4366 = arg0.method20269() * 702704879;
				this.anInt4368 = arg0.method20269() * -609716497;
				break;
			case 4:
				@Pc(32) int local32 = arg0.method20269();
				@Pc(39) Class43 local39 = (Class43) Class356.method26649(Class43.method9496(), local32);
				if (local39 == null) {
					throw new IllegalStateException("");
				}
				@Pc(51) int local51 = arg0.method20375();
				@Pc(58) Class70_Sub1 local58 = (Class70_Sub1) this.aClass70_Sub2_2.aMap20.get(local39);
				if (local58 != null) {
					this.aClass11_1 = local58.method14717(local51);
				} else if (!arg2) {
					throw new IllegalStateException("");
				}
			case 10:
		}
	}

	@OriginalMember(owner = "client!ky", name = "a", descriptor = "(Lclient!de;J)V", line = 42)
	public static void method25535(@OriginalArg(0) Class21 arg0, @OriginalArg(1) long arg1) {
		Class482.anInt5155 = Class482.anInt5153 * -1353291173;
		Class482.anInt5153 = 0;
		Class176.method23413();
		@Pc(11) Iterator local11 = Class482.aList19.iterator();
		while (local11.hasNext()) {
			@Pc(18) Class478 local18 = (Class478) local11.next();
			@Pc(23) boolean local23 = local18.method28835(arg0, arg1);
			if (!local23) {
				local11.remove();
				Class482.aClass478Array1[Class482.anInt5154 * -40012635] = local18;
				Class482.anInt5154 = (Class482.anInt5154 * -40012635 + 1 & Class126.anIntArray324[Class482.anInt5158 * 1631733361]) * 1873629997;
			}
		}
	}

	@OriginalMember(owner = "client!ky", name = "p", descriptor = "(Lclient!ny;I)V", line = 45)
	public static void method25537(@OriginalArg(0) Class359 arg0) {
		Class273.aClass359_51 = arg0;
	}

	@OriginalMember(owner = "client!ky", name = "b", descriptor = "(I)I", line = 69)
	public int method25522(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = anIntArray411[this.anInt4368 * -458262513 - this.anInt4366 * 1522156047];
		return arg0 >> this.anInt4366 * 1522156047 & local11;
	}

	@OriginalMember(owner = "client!ky", name = "g", descriptor = "(II)I", line = 69)
	public int method25523(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = anIntArray411[this.anInt4368 * -458262513 - this.anInt4366 * 1522156047];
		return arg0 >> this.anInt4366 * 1522156047 & local11;
	}

	@OriginalMember(owner = "client!ky", name = "y", descriptor = "(I)I", line = 69)
	public int method25529(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = anIntArray411[this.anInt4368 * -458262513 - this.anInt4366 * 1522156047];
		return arg0 >> this.anInt4366 * 1522156047 & local11;
	}

	@OriginalMember(owner = "client!ky", name = "c", descriptor = "(I)I", line = 69)
	public int method25530(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = anIntArray411[this.anInt4368 * -458262513 - this.anInt4366 * 1522156047];
		return arg0 >> this.anInt4366 * 1522156047 & local11;
	}

	@OriginalMember(owner = "client!ky", name = "z", descriptor = "(I)I", line = 69)
	public int method25531(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = anIntArray411[this.anInt4368 * -458262513 - this.anInt4366 * 1522156047];
		return arg0 >> this.anInt4366 * 1522156047 & local11;
	}

	@OriginalMember(owner = "client!ky", name = "n", descriptor = "(II)I", line = 74)
	public int method25520(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub5 {
		@Pc(11) int local11 = anIntArray411[this.anInt4368 * -458262513 - this.anInt4366 * 1522156047];
		if (arg1 < 0 || arg1 > local11) {
			throw new Exception_Sub5(this.aString196, arg1, local11);
		}
		local11 <<= this.anInt4366 * 1522156047;
		return arg0 & ~local11 | arg1 << this.anInt4366 * 1522156047 & local11;
	}

	@OriginalMember(owner = "client!ky", name = "l", descriptor = "(III)I", line = 74)
	public int method25524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub5 {
		@Pc(11) int local11 = anIntArray411[this.anInt4368 * -458262513 - this.anInt4366 * 1522156047];
		if (arg1 < 0 || arg1 > local11) {
			throw new Exception_Sub5(this.aString196, arg1, local11);
		}
		local11 <<= this.anInt4366 * 1522156047;
		return arg0 & ~local11 | arg1 << this.anInt4366 * 1522156047 & local11;
	}

	@OriginalMember(owner = "client!ky", name = "j", descriptor = "(II)I", line = 74)
	public int method25528(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub5 {
		@Pc(11) int local11 = anIntArray411[this.anInt4368 * -458262513 - this.anInt4366 * 1522156047];
		if (arg1 < 0 || arg1 > local11) {
			throw new Exception_Sub5(this.aString196, arg1, local11);
		}
		local11 <<= this.anInt4366 * 1522156047;
		return arg0 & ~local11 | arg1 << this.anInt4366 * 1522156047 & local11;
	}

	@OriginalMember(owner = "client!ky", name = "e", descriptor = "(II)I", line = 74)
	public int method25534(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub5 {
		@Pc(11) int local11 = anIntArray411[this.anInt4368 * -458262513 - this.anInt4366 * 1522156047];
		if (arg1 < 0 || arg1 > local11) {
			throw new Exception_Sub5(this.aString196, arg1, local11);
		}
		local11 <<= this.anInt4366 * 1522156047;
		return arg0 & ~local11 | arg1 << this.anInt4366 * 1522156047 & local11;
	}

	@OriginalMember(owner = "client!ky", name = "hq", descriptor = "(Lclient!vs;I)V", line = 5464)
	static final void method25538(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class451.method28390(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!ky", name = "uh", descriptor = "(Lclient!vs;B)V", line = 7728)
	static final void method25536(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = client.anInt3034;
	}
}

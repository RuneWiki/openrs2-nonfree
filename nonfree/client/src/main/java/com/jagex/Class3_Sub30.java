package com.jagex;

import java.util.BitSet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ago")
public class Class3_Sub30 extends Class3 {

	@OriginalMember(owner = "client!ago", name = "y", descriptor = "J")
	long aLong72;

	@OriginalMember(owner = "client!ago", name = "u", descriptor = "[I")
	int[] anIntArray184;

	@OriginalMember(owner = "client!ago", name = "l", descriptor = "Z")
	boolean aBoolean302;

	@OriginalMember(owner = "client!ago", name = "z", descriptor = "B")
	public byte aByte58;

	@OriginalMember(owner = "client!ago", name = "c", descriptor = "B")
	public byte aByte59;

	@OriginalMember(owner = "client!ago", name = "x", descriptor = "[Lclient!il;")
	public Class238[] aClass238Array1;

	@OriginalMember(owner = "client!ago", name = "h", descriptor = "Z")
	boolean aBoolean301 = true;

	@OriginalMember(owner = "client!ago", name = "s", descriptor = "I")
	public int anInt1331 = 0;

	@OriginalMember(owner = "client!ago", name = "b", descriptor = "Ljava/lang/String;")
	public String aString47 = null;

	@OriginalMember(owner = "client!ago", name = "p", descriptor = "(I)[Lclient!kh;", line = 12)
	public static Class277[] method11638() {
		return new Class277[] { Class277.aClass277_10, Class277.aClass277_11, Class277.aClass277_9 };
	}

	static {
		new BitSet(65536);
	}

	@OriginalMember(owner = "client!ago", name = "p", descriptor = "(II)V", line = 24)
	void method11620(@OriginalArg(0) int arg0) {
		if (this.aClass238Array1 == null) {
			this.aClass238Array1 = new Class238[arg0];
		} else {
			System.arraycopy(this.aClass238Array1, 0, this.aClass238Array1 = new Class238[arg0], 0, this.anInt1331 * 132295085);
		}
	}

	@OriginalMember(owner = "client!ago", name = "s", descriptor = "(I)V", line = 24)
	void method11624(@OriginalArg(0) int arg0) {
		if (this.aClass238Array1 == null) {
			this.aClass238Array1 = new Class238[arg0];
		} else {
			System.arraycopy(this.aClass238Array1, 0, this.aClass238Array1 = new Class238[arg0], 0, this.anInt1331 * 132295085);
		}
	}

	@OriginalMember(owner = "client!ago", name = "u", descriptor = "(I)V", line = 24)
	void method11626(@OriginalArg(0) int arg0) {
		if (this.aClass238Array1 == null) {
			this.aClass238Array1 = new Class238[arg0];
		} else {
			System.arraycopy(this.aClass238Array1, 0, this.aClass238Array1 = new Class238[arg0], 0, this.anInt1331 * 132295085);
		}
	}

	@OriginalMember(owner = "client!ago", name = "y", descriptor = "(I)V", line = 24)
	void method11627(@OriginalArg(0) int arg0) {
		if (this.aClass238Array1 == null) {
			this.aClass238Array1 = new Class238[arg0];
		} else {
			System.arraycopy(this.aClass238Array1, 0, this.aClass238Array1 = new Class238[arg0], 0, this.anInt1331 * 132295085);
		}
	}

	@OriginalMember(owner = "client!ago", name = "b", descriptor = "(I)V", line = 24)
	void method11628(@OriginalArg(0) int arg0) {
		if (this.aClass238Array1 == null) {
			this.aClass238Array1 = new Class238[arg0];
		} else {
			System.arraycopy(this.aClass238Array1, 0, this.aClass238Array1 = new Class238[arg0], 0, this.anInt1331 * 132295085);
		}
	}

	@OriginalMember(owner = "client!ago", name = "<init>", descriptor = "(Lclient!ahb;)V", line = 28)
	public Class3_Sub30(@OriginalArg(0) Class3_Sub41 arg0) {
		this.method11633(arg0);
	}

	@OriginalMember(owner = "client!ago", name = "c", descriptor = "()[I", line = 33)
	public int[] method11619() {
		if (this.anIntArray184 == null) {
			@Pc(8) String[] local8 = new String[this.anInt1331 * 132295085];
			this.anIntArray184 = new int[this.anInt1331 * 132295085];
			@Pc(17) int local17 = 0;
			while (local17 < this.anInt1331 * 132295085) {
				local8[local17] = this.aClass238Array1[local17].aString192;
				this.anIntArray184[local17] = local17++;
			}
			Class107.method21922(local8, this.anIntArray184);
		}
		return this.anIntArray184;
	}

	@OriginalMember(owner = "client!ago", name = "a", descriptor = "(I)[I", line = 33)
	public int[] method11625() {
		if (this.anIntArray184 == null) {
			@Pc(8) String[] local8 = new String[this.anInt1331 * 132295085];
			this.anIntArray184 = new int[this.anInt1331 * 132295085];
			@Pc(17) int local17 = 0;
			while (local17 < this.anInt1331 * 132295085) {
				local8[local17] = this.aClass238Array1[local17].aString192;
				this.anIntArray184[local17] = local17++;
			}
			Class107.method21922(local8, this.anIntArray184);
		}
		return this.anIntArray184;
	}

	@OriginalMember(owner = "client!ago", name = "z", descriptor = "()[I", line = 33)
	public int[] method11629() {
		if (this.anIntArray184 == null) {
			@Pc(8) String[] local8 = new String[this.anInt1331 * 132295085];
			this.anIntArray184 = new int[this.anInt1331 * 132295085];
			@Pc(17) int local17 = 0;
			while (local17 < this.anInt1331 * 132295085) {
				local8[local17] = this.aClass238Array1[local17].aString192;
				this.anIntArray184[local17] = local17++;
			}
			Class107.method21922(local8, this.anIntArray184);
		}
		return this.anIntArray184;
	}

	@OriginalMember(owner = "client!ago", name = "g", descriptor = "(Lclient!il;I)V", line = 46)
	void method11621(@OriginalArg(0) Class238 arg0) {
		if (this.aClass238Array1 == null || this.anInt1331 * 132295085 >= this.aClass238Array1.length) {
			this.method11620(this.anInt1331 * 132295085 + 5);
		}
		this.aClass238Array1[(this.anInt1331 += 941007397) * 132295085 - 1] = arg0;
		this.anIntArray184 = null;
	}

	@OriginalMember(owner = "client!ago", name = "j", descriptor = "(Lclient!il;)V", line = 46)
	void method11631(@OriginalArg(0) Class238 arg0) {
		if (this.aClass238Array1 == null || this.anInt1331 * 132295085 >= this.aClass238Array1.length) {
			this.method11620(this.anInt1331 * 132295085 + 5);
		}
		this.aClass238Array1[(this.anInt1331 += 941007397) * 132295085 - 1] = arg0;
		this.anIntArray184 = null;
	}

	@OriginalMember(owner = "client!ago", name = "l", descriptor = "(II)V", line = 52)
	void method11622(@OriginalArg(0) int arg0) {
		this.anInt1331 -= 941007397;
		if (this.anInt1331 * 132295085 == 0) {
			this.aClass238Array1 = null;
		} else {
			System.arraycopy(this.aClass238Array1, arg0 + 1, this.aClass238Array1, arg0, this.anInt1331 * 132295085 - arg0);
		}
		this.anIntArray184 = null;
	}

	@OriginalMember(owner = "client!ago", name = "n", descriptor = "(I)V", line = 52)
	void method11632(@OriginalArg(0) int arg0) {
		this.anInt1331 -= 941007397;
		if (this.anInt1331 * 132295085 == 0) {
			this.aClass238Array1 = null;
		} else {
			System.arraycopy(this.aClass238Array1, arg0 + 1, this.aClass238Array1, arg0, this.anInt1331 * 132295085 - arg0);
		}
		this.anIntArray184 = null;
	}

	@OriginalMember(owner = "client!ago", name = "h", descriptor = "(Ljava/lang/String;I)I", line = 59)
	public int method11623(@OriginalArg(0) String arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1331 * 132295085; local1++) {
			if (this.aClass238Array1[local1].aString192.equalsIgnoreCase(arg0)) {
				return local1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ago", name = "i", descriptor = "(Ljava/lang/String;)I", line = 59)
	public int method11630(@OriginalArg(0) String arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1331 * 132295085; local1++) {
			if (this.aClass238Array1[local1].aString192.equalsIgnoreCase(arg0)) {
				return local1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ago", name = "f", descriptor = "(Ljava/lang/String;)I", line = 59)
	public int method11634(@OriginalArg(0) String arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1331 * 132295085; local1++) {
			if (this.aClass238Array1[local1].aString192.equalsIgnoreCase(arg0)) {
				return local1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ago", name = "x", descriptor = "(Lclient!ahb;B)V", line = 66)
	void method11633(@OriginalArg(0) Class3_Sub41 arg0) {
		@Pc(3) int local3 = arg0.method20269();
		if ((local3 & 0x1) != 0) {
			this.aBoolean302 = true;
		}
		if ((local3 & 0x2) != 0) {
			this.aBoolean301 = true;
		}
		@Pc(20) int local20 = 2;
		if ((local3 & 0x4) != 0) {
			local20 = arg0.method20269();
		}
		this.aLong296 = arg0.method20371() * 7335455165921340595L;
		this.aLong72 = arg0.method20371() * 8085148063233935363L;
		this.aString47 = arg0.method20283();
		arg0.method20269();
		this.aByte58 = arg0.method20390();
		this.aByte59 = arg0.method20390();
		this.anInt1331 = arg0.method20271() * 941007397;
		if (this.anInt1331 * 132295085 <= 0) {
			return;
		}
		this.aClass238Array1 = new Class238[this.anInt1331 * 132295085];
		for (@Pc(83) int local83 = 0; local83 < this.anInt1331 * 132295085; local83++) {
			@Pc(93) Class238 local93 = new Class238();
			if (this.aBoolean302) {
				arg0.method20371();
			}
			if (this.aBoolean301) {
				local93.aString192 = arg0.method20283();
			}
			local93.aByte129 = arg0.method20390();
			local93.anInt3750 = arg0.method20271() * 141394789;
			if (local20 >= 3) {
				arg0.method20269();
			}
			this.aClass238Array1[local83] = local93;
		}
	}

	@OriginalMember(owner = "client!ago", name = "k", descriptor = "(Lclient!ahb;)V", line = 66)
	void method11635(@OriginalArg(0) Class3_Sub41 arg0) {
		@Pc(3) int local3 = arg0.method20269();
		if ((local3 & 0x1) != 0) {
			this.aBoolean302 = true;
		}
		if ((local3 & 0x2) != 0) {
			this.aBoolean301 = true;
		}
		@Pc(20) int local20 = 2;
		if ((local3 & 0x4) != 0) {
			local20 = arg0.method20269();
		}
		this.aLong296 = arg0.method20371() * 7335455165921340595L;
		this.aLong72 = arg0.method20371() * 8085148063233935363L;
		this.aString47 = arg0.method20283();
		arg0.method20269();
		this.aByte58 = arg0.method20390();
		this.aByte59 = arg0.method20390();
		this.anInt1331 = arg0.method20271() * 941007397;
		if (this.anInt1331 * 132295085 <= 0) {
			return;
		}
		this.aClass238Array1 = new Class238[this.anInt1331 * 132295085];
		for (@Pc(83) int local83 = 0; local83 < this.anInt1331 * 132295085; local83++) {
			@Pc(93) Class238 local93 = new Class238();
			if (this.aBoolean302) {
				arg0.method20371();
			}
			if (this.aBoolean301) {
				local93.aString192 = arg0.method20283();
			}
			local93.aByte129 = arg0.method20390();
			local93.anInt3750 = arg0.method20271() * 141394789;
			if (local20 >= 3) {
				arg0.method20269();
			}
			this.aClass238Array1[local83] = local93;
		}
	}

	@OriginalMember(owner = "client!ago", name = "at", descriptor = "(Lclient!ahb;)V", line = 66)
	void method11636(@OriginalArg(0) Class3_Sub41 arg0) {
		@Pc(3) int local3 = arg0.method20269();
		if ((local3 & 0x1) != 0) {
			this.aBoolean302 = true;
		}
		if ((local3 & 0x2) != 0) {
			this.aBoolean301 = true;
		}
		@Pc(20) int local20 = 2;
		if ((local3 & 0x4) != 0) {
			local20 = arg0.method20269();
		}
		this.aLong296 = arg0.method20371() * 7335455165921340595L;
		this.aLong72 = arg0.method20371() * 8085148063233935363L;
		this.aString47 = arg0.method20283();
		arg0.method20269();
		this.aByte58 = arg0.method20390();
		this.aByte59 = arg0.method20390();
		this.anInt1331 = arg0.method20271() * 941007397;
		if (this.anInt1331 * 132295085 <= 0) {
			return;
		}
		this.aClass238Array1 = new Class238[this.anInt1331 * 132295085];
		for (@Pc(83) int local83 = 0; local83 < this.anInt1331 * 132295085; local83++) {
			@Pc(93) Class238 local93 = new Class238();
			if (this.aBoolean302) {
				arg0.method20371();
			}
			if (this.aBoolean301) {
				local93.aString192 = arg0.method20283();
			}
			local93.aByte129 = arg0.method20390();
			local93.anInt3750 = arg0.method20271() * 141394789;
			if (local20 >= 3) {
				arg0.method20269();
			}
			this.aClass238Array1[local83] = local93;
		}
	}

	@OriginalMember(owner = "client!ago", name = "fk", descriptor = "(Lclient!vs;I)V", line = 5078)
	static final void method11637(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class402.method27618(local11, local14, arg0);
	}
}

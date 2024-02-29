package com.jagex;

import java.util.BitSet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ajy")
public class Class77_Sub25 extends Class77 {

	@OriginalMember(owner = "client!ajy", name = "w", descriptor = "[Lclient!kc;")
	public Class358[] aClass358Array1;

	@OriginalMember(owner = "client!ajy", name = "q", descriptor = "[I")
	int[] anIntArray201;

	@OriginalMember(owner = "client!ajy", name = "r", descriptor = "B")
	public byte aByte56;

	@OriginalMember(owner = "client!ajy", name = "s", descriptor = "B")
	public byte aByte57;

	@OriginalMember(owner = "client!ajy", name = "x", descriptor = "J")
	long aLong83;

	@OriginalMember(owner = "client!ajy", name = "l", descriptor = "Z")
	boolean aBoolean330;

	@OriginalMember(owner = "client!ajy", name = "y", descriptor = "Z")
	boolean aBoolean329 = true;

	@OriginalMember(owner = "client!ajy", name = "t", descriptor = "I")
	public int anInt1550 = 0;

	@OriginalMember(owner = "client!ajy", name = "d", descriptor = "Ljava/lang/String;")
	public String aString49 = null;

	static {
		new BitSet(65536);
	}

	@OriginalMember(owner = "client!ajy", name = "p", descriptor = "(IB)V", line = 24)
	void method13614(@OriginalArg(0) int arg0) {
		if (this.aClass358Array1 == null) {
			this.aClass358Array1 = new Class358[arg0];
		} else {
			System.arraycopy(this.aClass358Array1, 0, this.aClass358Array1 = new Class358[arg0], 0, this.anInt1550 * -1406046755);
		}
	}

	@OriginalMember(owner = "client!ajy", name = "t", descriptor = "(I)V", line = 24)
	void method13615(@OriginalArg(0) int arg0) {
		if (this.aClass358Array1 == null) {
			this.aClass358Array1 = new Class358[arg0];
		} else {
			System.arraycopy(this.aClass358Array1, 0, this.aClass358Array1 = new Class358[arg0], 0, this.anInt1550 * -1406046755);
		}
	}

	@OriginalMember(owner = "client!ajy", name = "<init>", descriptor = "(Lclient!akv;)V", line = 28)
	public Class77_Sub25(@OriginalArg(0) Class77_Sub39 arg0) {
		this.method13633(arg0);
	}

	@OriginalMember(owner = "client!ajy", name = "c", descriptor = "(I)[I", line = 33)
	public int[] method13616() {
		if (this.anIntArray201 == null) {
			@Pc(9) String[] local9 = new String[this.anInt1550 * -1406046755];
			this.anIntArray201 = new int[this.anInt1550 * -1406046755];
			@Pc(18) int local18 = 0;
			while (local18 < this.anInt1550 * -1406046755) {
				local9[local18] = this.aClass358Array1[local18].aString209;
				this.anIntArray201[local18] = local18++;
			}
			Class585.method31727(local9, this.anIntArray201);
		}
		return this.anIntArray201;
	}

	@OriginalMember(owner = "client!ajy", name = "d", descriptor = "()[I", line = 33)
	public int[] method13617() {
		if (this.anIntArray201 == null) {
			@Pc(9) String[] local9 = new String[this.anInt1550 * -1406046755];
			this.anIntArray201 = new int[this.anInt1550 * -1406046755];
			@Pc(18) int local18 = 0;
			while (local18 < this.anInt1550 * -1406046755) {
				local9[local18] = this.aClass358Array1[local18].aString209;
				this.anIntArray201[local18] = local18++;
			}
			Class585.method31727(local9, this.anIntArray201);
		}
		return this.anIntArray201;
	}

	@OriginalMember(owner = "client!ajy", name = "q", descriptor = "()[I", line = 33)
	public int[] method13618() {
		if (this.anIntArray201 == null) {
			@Pc(9) String[] local9 = new String[this.anInt1550 * -1406046755];
			this.anIntArray201 = new int[this.anInt1550 * -1406046755];
			@Pc(18) int local18 = 0;
			while (local18 < this.anInt1550 * -1406046755) {
				local9[local18] = this.aClass358Array1[local18].aString209;
				this.anIntArray201[local18] = local18++;
			}
			Class585.method31727(local9, this.anIntArray201);
		}
		return this.anIntArray201;
	}

	@OriginalMember(owner = "client!ajy", name = "x", descriptor = "()[I", line = 33)
	public int[] method13619() {
		if (this.anIntArray201 == null) {
			@Pc(9) String[] local9 = new String[this.anInt1550 * -1406046755];
			this.anIntArray201 = new int[this.anInt1550 * -1406046755];
			@Pc(18) int local18 = 0;
			while (local18 < this.anInt1550 * -1406046755) {
				local9[local18] = this.aClass358Array1[local18].aString209;
				this.anIntArray201[local18] = local18++;
			}
			Class585.method31727(local9, this.anIntArray201);
		}
		return this.anIntArray201;
	}

	@OriginalMember(owner = "client!ajy", name = "z", descriptor = "(Lclient!kc;)V", line = 46)
	void method13620(@OriginalArg(0) Class358 arg0) {
		if (this.aClass358Array1 == null || this.anInt1550 * -1406046755 >= this.aClass358Array1.length) {
			this.method13614(this.anInt1550 * -1406046755 + 5);
		}
		this.aClass358Array1[(this.anInt1550 += -510111115) * -1406046755 - 1] = arg0;
		this.anIntArray201 = null;
	}

	@OriginalMember(owner = "client!ajy", name = "s", descriptor = "(Lclient!kc;)V", line = 46)
	void method13621(@OriginalArg(0) Class358 arg0) {
		if (this.aClass358Array1 == null || this.anInt1550 * -1406046755 >= this.aClass358Array1.length) {
			this.method13614(this.anInt1550 * -1406046755 + 5);
		}
		this.aClass358Array1[(this.anInt1550 += -510111115) * -1406046755 - 1] = arg0;
		this.anIntArray201 = null;
	}

	@OriginalMember(owner = "client!ajy", name = "r", descriptor = "(Lclient!kc;)V", line = 46)
	void method13622(@OriginalArg(0) Class358 arg0) {
		if (this.aClass358Array1 == null || this.anInt1550 * -1406046755 >= this.aClass358Array1.length) {
			this.method13614(this.anInt1550 * -1406046755 + 5);
		}
		this.aClass358Array1[(this.anInt1550 += -510111115) * -1406046755 - 1] = arg0;
		this.anIntArray201 = null;
	}

	@OriginalMember(owner = "client!ajy", name = "g", descriptor = "(Lclient!kc;)V", line = 46)
	void method13623(@OriginalArg(0) Class358 arg0) {
		if (this.aClass358Array1 == null || this.anInt1550 * -1406046755 >= this.aClass358Array1.length) {
			this.method13614(this.anInt1550 * -1406046755 + 5);
		}
		this.aClass358Array1[(this.anInt1550 += -510111115) * -1406046755 - 1] = arg0;
		this.anIntArray201 = null;
	}

	@OriginalMember(owner = "client!ajy", name = "v", descriptor = "(Lclient!kc;I)V", line = 46)
	void method13624(@OriginalArg(0) Class358 arg0) {
		if (this.aClass358Array1 == null || this.anInt1550 * -1406046755 >= this.aClass358Array1.length) {
			this.method13614(this.anInt1550 * -1406046755 + 5);
		}
		this.aClass358Array1[(this.anInt1550 += -510111115) * -1406046755 - 1] = arg0;
		this.anIntArray201 = null;
	}

	@OriginalMember(owner = "client!ajy", name = "l", descriptor = "(II)V", line = 52)
	void method13625(@OriginalArg(0) int arg0) {
		this.anInt1550 -= -510111115;
		if (this.anInt1550 * -1406046755 == 0) {
			this.aClass358Array1 = null;
		} else {
			System.arraycopy(this.aClass358Array1, arg0 + 1, this.aClass358Array1, arg0, this.anInt1550 * -1406046755 - arg0);
		}
		this.anIntArray201 = null;
	}

	@OriginalMember(owner = "client!ajy", name = "j", descriptor = "(I)V", line = 52)
	void method13626(@OriginalArg(0) int arg0) {
		this.anInt1550 -= -510111115;
		if (this.anInt1550 * -1406046755 == 0) {
			this.aClass358Array1 = null;
		} else {
			System.arraycopy(this.aClass358Array1, arg0 + 1, this.aClass358Array1, arg0, this.anInt1550 * -1406046755 - arg0);
		}
		this.anIntArray201 = null;
	}

	@OriginalMember(owner = "client!ajy", name = "b", descriptor = "(I)V", line = 52)
	void method13627(@OriginalArg(0) int arg0) {
		this.anInt1550 -= -510111115;
		if (this.anInt1550 * -1406046755 == 0) {
			this.aClass358Array1 = null;
		} else {
			System.arraycopy(this.aClass358Array1, arg0 + 1, this.aClass358Array1, arg0, this.anInt1550 * -1406046755 - arg0);
		}
		this.anIntArray201 = null;
	}

	@OriginalMember(owner = "client!ajy", name = "n", descriptor = "(I)V", line = 52)
	void method13628(@OriginalArg(0) int arg0) {
		this.anInt1550 -= -510111115;
		if (this.anInt1550 * -1406046755 == 0) {
			this.aClass358Array1 = null;
		} else {
			System.arraycopy(this.aClass358Array1, arg0 + 1, this.aClass358Array1, arg0, this.anInt1550 * -1406046755 - arg0);
		}
		this.anIntArray201 = null;
	}

	@OriginalMember(owner = "client!ajy", name = "a", descriptor = "(I)V", line = 52)
	void method13629(@OriginalArg(0) int arg0) {
		this.anInt1550 -= -510111115;
		if (this.anInt1550 * -1406046755 == 0) {
			this.aClass358Array1 = null;
		} else {
			System.arraycopy(this.aClass358Array1, arg0 + 1, this.aClass358Array1, arg0, this.anInt1550 * -1406046755 - arg0);
		}
		this.anIntArray201 = null;
	}

	@OriginalMember(owner = "client!ajy", name = "m", descriptor = "(Ljava/lang/String;)I", line = 59)
	public int method13630(@OriginalArg(0) String arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1550 * -1406046755; local1++) {
			if (this.aClass358Array1[local1].aString209.equalsIgnoreCase(arg0)) {
				return local1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ajy", name = "y", descriptor = "(Ljava/lang/String;I)I", line = 59)
	public int method13631(@OriginalArg(0) String arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1550 * -1406046755; local1++) {
			if (this.aClass358Array1[local1].aString209.equalsIgnoreCase(arg0)) {
				return local1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ajy", name = "h", descriptor = "(Ljava/lang/String;)I", line = 59)
	public int method13632(@OriginalArg(0) String arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1550 * -1406046755; local1++) {
			if (this.aClass358Array1[local1].aString209.equalsIgnoreCase(arg0)) {
				return local1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ajy", name = "w", descriptor = "(Lclient!akv;I)V", line = 66)
	void method13633(@OriginalArg(0) Class77_Sub39 arg0) {
		@Pc(3) int local3 = arg0.method22478();
		if ((local3 & 0x1) != 0) {
			this.aBoolean330 = true;
		}
		if ((local3 & 0x2) != 0) {
			this.aBoolean329 = true;
		}
		@Pc(21) int local21 = 2;
		if ((local3 & 0x4) != 0) {
			local21 = arg0.method22478();
		}
		this.aLong229 = arg0.method22510() * 936217890172187787L;
		this.aLong83 = arg0.method22510() * 2175811687201928859L;
		this.aString49 = arg0.method22523();
		arg0.method22478();
		this.aByte56 = arg0.method22481();
		this.aByte57 = arg0.method22481();
		this.anInt1550 = arg0.method22483() * -510111115;
		if (this.anInt1550 * -1406046755 <= 0) {
			return;
		}
		this.aClass358Array1 = new Class358[this.anInt1550 * -1406046755];
		for (@Pc(83) int local83 = 0; local83 < this.anInt1550 * -1406046755; local83++) {
			@Pc(93) Class358 local93 = new Class358();
			if (this.aBoolean330) {
				arg0.method22510();
			}
			if (this.aBoolean329) {
				local93.aString209 = arg0.method22523();
			}
			local93.aByte149 = arg0.method22481();
			local93.anInt4499 = arg0.method22483() * -1645165713;
			if (local21 >= 3) {
				arg0.method22478();
			}
			this.aClass358Array1[local83] = local93;
		}
	}

	@OriginalMember(owner = "client!ajy", name = "aj", descriptor = "(Lclient!akv;)V", line = 66)
	void method13634(@OriginalArg(0) Class77_Sub39 arg0) {
		@Pc(3) int local3 = arg0.method22478();
		if ((local3 & 0x1) != 0) {
			this.aBoolean330 = true;
		}
		if ((local3 & 0x2) != 0) {
			this.aBoolean329 = true;
		}
		@Pc(21) int local21 = 2;
		if ((local3 & 0x4) != 0) {
			local21 = arg0.method22478();
		}
		this.aLong229 = arg0.method22510() * 936217890172187787L;
		this.aLong83 = arg0.method22510() * 2175811687201928859L;
		this.aString49 = arg0.method22523();
		arg0.method22478();
		this.aByte56 = arg0.method22481();
		this.aByte57 = arg0.method22481();
		this.anInt1550 = arg0.method22483() * -510111115;
		if (this.anInt1550 * -1406046755 <= 0) {
			return;
		}
		this.aClass358Array1 = new Class358[this.anInt1550 * -1406046755];
		for (@Pc(83) int local83 = 0; local83 < this.anInt1550 * -1406046755; local83++) {
			@Pc(93) Class358 local93 = new Class358();
			if (this.aBoolean330) {
				arg0.method22510();
			}
			if (this.aBoolean329) {
				local93.aString209 = arg0.method22523();
			}
			local93.aByte149 = arg0.method22481();
			local93.anInt4499 = arg0.method22483() * -1645165713;
			if (local21 >= 3) {
				arg0.method22478();
			}
			this.aClass358Array1[local83] = local93;
		}
	}

	@OriginalMember(owner = "client!ajy", name = "aj", descriptor = "(Lclient!dx;B)V", line = 884)
	static void method13635(@OriginalArg(0) Class86 arg0) {
		if (Class683.aBoolean861) {
			Class594.method31849(arg0);
		} else {
			Class617.method32382(arg0);
		}
	}
}

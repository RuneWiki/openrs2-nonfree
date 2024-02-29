package com.jagex;

import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aid")
public class Class126_Sub1 extends Class126 {

	@OriginalMember(owner = "client!aid", name = "al", descriptor = "I")
	static final int anInt1294 = 1;

	@OriginalMember(owner = "client!aid", name = "g", descriptor = "B")
	static final byte aByte31 = 1;

	@OriginalMember(owner = "client!aid", name = "z", descriptor = "B")
	static final byte aByte32 = -1;

	@OriginalMember(owner = "client!aid", name = "r", descriptor = "B")
	static final byte aByte33 = 0;

	@OriginalMember(owner = "client!aid", name = "ao", descriptor = "I")
	static final int anInt1300 = 2;

	@OriginalMember(owner = "client!aid", name = "h", descriptor = "I")
	static final int anInt1301 = 1000;

	@OriginalMember(owner = "client!aid", name = "aj", descriptor = "I")
	static final int anInt1302 = 250;

	@OriginalMember(owner = "client!aid", name = "ag", descriptor = "I")
	static final int anInt1303 = 0;

	@OriginalMember(owner = "client!aid", name = "ai", descriptor = "Ljava/util/zip/CRC32;")
	static CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!aid", name = "j", descriptor = "[B")
	byte[] aByteArray26;

	@OriginalMember(owner = "client!aid", name = "u", descriptor = "Z")
	boolean aBoolean246;

	@OriginalMember(owner = "client!aid", name = "e", descriptor = "Z")
	boolean aBoolean247;

	@OriginalMember(owner = "client!aid", name = "s", descriptor = "Lclient!pm;")
	Class468 aClass468_1;

	@OriginalMember(owner = "client!aid", name = "i", descriptor = "I")
	int anInt1298 = 0;

	@OriginalMember(owner = "client!aid", name = "k", descriptor = "Lclient!aak;")
	Class12 aClass12_8 = new Class12(16);

	@OriginalMember(owner = "client!aid", name = "o", descriptor = "I")
	int anInt1299 = 0;

	@OriginalMember(owner = "client!aid", name = "n", descriptor = "Lclient!zm;")
	Class695 aClass695_15 = new Class695();

	@OriginalMember(owner = "client!aid", name = "m", descriptor = "J")
	long aLong47 = 0L;

	@OriginalMember(owner = "client!aid", name = "p", descriptor = "I")
	int anInt1297;

	@OriginalMember(owner = "client!aid", name = "y", descriptor = "Lclient!tx;")
	Class566 aClass566_1;

	@OriginalMember(owner = "client!aid", name = "f", descriptor = "Z")
	boolean aBoolean248;

	@OriginalMember(owner = "client!aid", name = "b", descriptor = "Lclient!zm;")
	Class695 aClass695_14;

	@OriginalMember(owner = "client!aid", name = "w", descriptor = "Lclient!tx;")
	Class566 aClass566_2;

	@OriginalMember(owner = "client!aid", name = "c", descriptor = "Lclient!pa;")
	Class129 aClass129_2;

	@OriginalMember(owner = "client!aid", name = "v", descriptor = "Lclient!po;")
	Class470 aClass470_2;

	@OriginalMember(owner = "client!aid", name = "l", descriptor = "Lclient!pn;")
	Class469 aClass469_1;

	@OriginalMember(owner = "client!aid", name = "q", descriptor = "I")
	int anInt1295;

	@OriginalMember(owner = "client!aid", name = "x", descriptor = "[B")
	byte[] aByteArray25;

	@OriginalMember(owner = "client!aid", name = "d", descriptor = "I")
	int anInt1296;

	@OriginalMember(owner = "client!aid", name = "a", descriptor = "Z")
	boolean aBoolean249;

	@OriginalMember(owner = "client!aid", name = "t", descriptor = "Lclient!aru;")
	Class77_Sub1_Sub18 aClass77_Sub1_Sub18_1;

	@OriginalMember(owner = "client!aid", name = "<init>", descriptor = "(ILclient!tx;Lclient!tx;Lclient!pa;Lclient!po;Lclient!pn;I[BIZI)V", line = 44)
	Class126_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class566 arg1, @OriginalArg(2) Class566 arg2, @OriginalArg(3) Class129 arg3, @OriginalArg(4) Class470 arg4, @OriginalArg(5) Class469 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[] arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10) {
		this.anInt1297 = arg0 * 578820929;
		this.aClass566_1 = arg1;
		if (this.aClass566_1 == null) {
			this.aBoolean248 = false;
		} else {
			this.aBoolean248 = true;
			this.aClass695_14 = new Class695();
		}
		this.aClass566_2 = arg2;
		this.aClass129_2 = arg3;
		this.aClass470_2 = arg4;
		this.aClass469_1 = arg5;
		this.anInt1295 = arg6 * -145809837;
		this.aByteArray25 = arg7;
		this.anInt1296 = arg8 * -577083317;
		this.aBoolean249 = arg9;
		if (this.aClass566_2 != null) {
			this.aClass77_Sub1_Sub18_1 = this.aClass469_1.method29570(this.anInt1297 * -426609471, this.aClass566_2);
		}
	}

	@OriginalMember(owner = "client!aid", name = "ao", descriptor = "(IIIII)Lclient!ark;", line = 53)
	public static Class77_Sub42_Sub1 method11583(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class77_Sub42_Sub1[] local2 = Class77_Sub42_Sub1.aClass77_Sub42_Sub1Array1;
		synchronized (Class77_Sub42_Sub1.aClass77_Sub42_Sub1Array1) {
			@Pc(12) Class77_Sub42_Sub1 local12;
			if (Class77_Sub42_Sub1.anInt3082 * 1045872731 == 0) {
				local12 = new Class77_Sub42_Sub1();
			} else {
				local12 = Class77_Sub42_Sub1.aClass77_Sub42_Sub1Array1[(Class77_Sub42_Sub1.anInt3082 -= 1321758675) * 1045872731];
			}
			local12.anInt3085 = arg0 * -466592867;
			local12.anInt3077 = arg1 * -1991833173;
			local12.anInt3083 = arg2 * -934260093;
			local12.anInt3084 = arg3 * -220200763;
			local12.aLong184 = Class280.method26667() * 747553093241954833L;
			return local12;
		}
	}

	@OriginalMember(owner = "client!aid", name = "k", descriptor = "(I[BIII)V", line = 64)
	void method11584(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.method11588(arg0, arg1, arg2, arg3)) {
			return;
		}
		this.anInt1295 = arg0 * -145809837;
		this.aByteArray25 = arg1;
		this.anInt1296 = arg2 * -577083317;
		this.aClass468_1 = null;
		this.aClass77_Sub1_Sub18_1 = null;
		if (!this.aClass129_2.method12184()) {
			this.aClass77_Sub1_Sub18_1 = this.aClass129_2.method12177(255, this.anInt1297 * -426609471, (byte) 0, true);
		}
	}

	@OriginalMember(owner = "client!aid", name = "al", descriptor = "(I[BII)V", line = 64)
	void method11585(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.method11588(arg0, arg1, arg2, arg3)) {
			return;
		}
		this.anInt1295 = arg0 * -145809837;
		this.aByteArray25 = arg1;
		this.anInt1296 = arg2 * -577083317;
		this.aClass468_1 = null;
		this.aClass77_Sub1_Sub18_1 = null;
		if (!this.aClass129_2.method12184()) {
			this.aClass77_Sub1_Sub18_1 = this.aClass129_2.method12177(255, this.anInt1297 * -426609471, (byte) 0, true);
		}
	}

	@OriginalMember(owner = "client!aid", name = "ak", descriptor = "(I[BII)V", line = 64)
	void method11586(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.method11588(arg0, arg1, arg2, arg3)) {
			return;
		}
		this.anInt1295 = arg0 * -145809837;
		this.aByteArray25 = arg1;
		this.anInt1296 = arg2 * -577083317;
		this.aClass468_1 = null;
		this.aClass77_Sub1_Sub18_1 = null;
		if (!this.aClass129_2.method12184()) {
			this.aClass77_Sub1_Sub18_1 = this.aClass129_2.method12177(255, this.anInt1297 * -426609471, (byte) 0, true);
		}
	}

	@OriginalMember(owner = "client!aid", name = "ao", descriptor = "(I[BII)V", line = 64)
	void method11587(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.method11588(arg0, arg1, arg2, arg3)) {
			return;
		}
		this.anInt1295 = arg0 * -145809837;
		this.aByteArray25 = arg1;
		this.anInt1296 = arg2 * -577083317;
		this.aClass468_1 = null;
		this.aClass77_Sub1_Sub18_1 = null;
		if (!this.aClass129_2.method12184()) {
			this.aClass77_Sub1_Sub18_1 = this.aClass129_2.method12177(255, this.anInt1297 * -426609471, (byte) 0, true);
		}
	}

	@OriginalMember(owner = "client!aid", name = "u", descriptor = "(I[BIIB)Z", line = 74)
	boolean method11588(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 == this.anInt1295 * -103623205 && arg2 == this.anInt1296 * 981999971) {
			@Pc(13) boolean local13 = true;
			for (@Pc(15) int local15 = 0; local15 < this.aByteArray25.length; local15++) {
				if (this.aByteArray25[local15] != arg1[local15]) {
					local13 = false;
					break;
				}
			}
			if (local13) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!aid", name = "ax", descriptor = "(I[BII)Z", line = 74)
	boolean method11589(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.anInt1295 * -103623205 && arg2 == this.anInt1296 * 981999971) {
			@Pc(13) boolean local13 = true;
			for (@Pc(15) int local15 = 0; local15 < this.aByteArray25.length; local15++) {
				if (this.aByteArray25[local15] != arg1[local15]) {
					local13 = false;
					break;
				}
			}
			if (local13) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!aid", name = "au", descriptor = "(I[BII)Z", line = 74)
	boolean method11590(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.anInt1295 * -103623205 && arg2 == this.anInt1296 * 981999971) {
			@Pc(13) boolean local13 = true;
			for (@Pc(15) int local15 = 0; local15 < this.aByteArray25.length; local15++) {
				if (this.aByteArray25[local15] != arg1[local15]) {
					local13 = false;
					break;
				}
			}
			if (local13) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!aid", name = "e", descriptor = "(I)I", line = 88)
	public int method11591() {
		if (this.method11581() == null) {
			return this.aClass77_Sub1_Sub18_1 == null ? 0 : this.aClass77_Sub1_Sub18_1.method24034();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!aid", name = "ar", descriptor = "()I", line = 88)
	public int method11592() {
		if (this.method11581() == null) {
			return this.aClass77_Sub1_Sub18_1 == null ? 0 : this.aClass77_Sub1_Sub18_1.method24034();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!aid", name = "p", descriptor = "(I)Lclient!pm;", line = 96)
	@Override
	Class468 method11581() {
		if (this.aClass468_1 != null) {
			return this.aClass468_1;
		}
		if (this.aClass77_Sub1_Sub18_1 == null) {
			if (this.aClass129_2.method12184()) {
				return null;
			}
			this.aClass77_Sub1_Sub18_1 = this.aClass129_2.method12177(255, this.anInt1297 * -426609471, (byte) 0, true);
		}
		if (this.aClass77_Sub1_Sub18_1.aBoolean540) {
			return null;
		}
		@Pc(40) byte[] local40 = this.aClass77_Sub1_Sub18_1.method24033();
		if (this.aClass77_Sub1_Sub18_1 instanceof Class77_Sub1_Sub18_Sub3) {
			try {
				if (local40 == null) {
					throw new RuntimeException();
				}
				this.aClass468_1 = new Class468(local40, this.anInt1295 * -103623205, this.aByteArray25);
				if (this.aClass468_1.anInt4984 * 909547911 != this.anInt1296 * 981999971) {
					throw new RuntimeException();
				}
			} catch (@Pc(78) RuntimeException local78) {
				this.aClass468_1 = null;
				if (this.aClass129_2.method12184()) {
					this.aClass77_Sub1_Sub18_1 = null;
				} else {
					this.aClass77_Sub1_Sub18_1 = this.aClass129_2.method12177(255, this.anInt1297 * -426609471, (byte) 0, true);
				}
				return null;
			}
		} else {
			try {
				if (local40 == null) {
					throw new RuntimeException();
				}
				this.aClass468_1 = new Class468(local40, this.anInt1295 * -103623205, this.aByteArray25);
			} catch (@Pc(125) RuntimeException local125) {
				this.aClass129_2.method12203(255, this.anInt1297 * -426609471);
				this.aClass468_1 = null;
				if (this.aClass129_2.method12184()) {
					this.aClass77_Sub1_Sub18_1 = null;
				} else {
					this.aClass77_Sub1_Sub18_1 = this.aClass129_2.method12177(255, this.anInt1297 * -426609471, (byte) 0, true);
				}
				return null;
			}
			if (this.aClass566_2 != null) {
				this.aClass469_1.method29574(this.anInt1297 * -426609471, local40, this.aClass566_2);
			}
		}
		this.aClass77_Sub1_Sub18_1 = null;
		if (this.aClass566_1 != null) {
			this.aByteArray26 = new byte[this.aClass468_1.anInt4986 * -540639821];
			this.anInt1298 = 0;
		}
		return this.aClass468_1;
	}

	@OriginalMember(owner = "client!aid", name = "y", descriptor = "()Lclient!pm;", line = 96)
	@Override
	Class468 method11582() {
		if (this.aClass468_1 != null) {
			return this.aClass468_1;
		}
		if (this.aClass77_Sub1_Sub18_1 == null) {
			if (this.aClass129_2.method12184()) {
				return null;
			}
			this.aClass77_Sub1_Sub18_1 = this.aClass129_2.method12177(255, this.anInt1297 * -426609471, (byte) 0, true);
		}
		if (this.aClass77_Sub1_Sub18_1.aBoolean540) {
			return null;
		}
		@Pc(40) byte[] local40 = this.aClass77_Sub1_Sub18_1.method24033();
		if (this.aClass77_Sub1_Sub18_1 instanceof Class77_Sub1_Sub18_Sub3) {
			try {
				if (local40 == null) {
					throw new RuntimeException();
				}
				this.aClass468_1 = new Class468(local40, this.anInt1295 * -103623205, this.aByteArray25);
				if (this.aClass468_1.anInt4984 * 909547911 != this.anInt1296 * 981999971) {
					throw new RuntimeException();
				}
			} catch (@Pc(78) RuntimeException local78) {
				this.aClass468_1 = null;
				if (this.aClass129_2.method12184()) {
					this.aClass77_Sub1_Sub18_1 = null;
				} else {
					this.aClass77_Sub1_Sub18_1 = this.aClass129_2.method12177(255, this.anInt1297 * -426609471, (byte) 0, true);
				}
				return null;
			}
		} else {
			try {
				if (local40 == null) {
					throw new RuntimeException();
				}
				this.aClass468_1 = new Class468(local40, this.anInt1295 * -103623205, this.aByteArray25);
			} catch (@Pc(125) RuntimeException local125) {
				this.aClass129_2.method12203(255, this.anInt1297 * -426609471);
				this.aClass468_1 = null;
				if (this.aClass129_2.method12184()) {
					this.aClass77_Sub1_Sub18_1 = null;
				} else {
					this.aClass77_Sub1_Sub18_1 = this.aClass129_2.method12177(255, this.anInt1297 * -426609471, (byte) 0, true);
				}
				return null;
			}
			if (this.aClass566_2 != null) {
				this.aClass469_1.method29574(this.anInt1297 * -426609471, local40, this.aClass566_2);
			}
		}
		this.aClass77_Sub1_Sub18_1 = null;
		if (this.aClass566_1 != null) {
			this.aByteArray26 = new byte[this.aClass468_1.anInt4986 * -540639821];
			this.anInt1298 = 0;
		}
		return this.aClass468_1;
	}

	@OriginalMember(owner = "client!aid", name = "w", descriptor = "()Lclient!pm;", line = 96)
	@Override
	Class468 method11572() {
		if (this.aClass468_1 != null) {
			return this.aClass468_1;
		}
		if (this.aClass77_Sub1_Sub18_1 == null) {
			if (this.aClass129_2.method12184()) {
				return null;
			}
			this.aClass77_Sub1_Sub18_1 = this.aClass129_2.method12177(255, this.anInt1297 * -426609471, (byte) 0, true);
		}
		if (this.aClass77_Sub1_Sub18_1.aBoolean540) {
			return null;
		}
		@Pc(40) byte[] local40 = this.aClass77_Sub1_Sub18_1.method24033();
		if (this.aClass77_Sub1_Sub18_1 instanceof Class77_Sub1_Sub18_Sub3) {
			try {
				if (local40 == null) {
					throw new RuntimeException();
				}
				this.aClass468_1 = new Class468(local40, this.anInt1295 * -103623205, this.aByteArray25);
				if (this.aClass468_1.anInt4984 * 909547911 != this.anInt1296 * 981999971) {
					throw new RuntimeException();
				}
			} catch (@Pc(78) RuntimeException local78) {
				this.aClass468_1 = null;
				if (this.aClass129_2.method12184()) {
					this.aClass77_Sub1_Sub18_1 = null;
				} else {
					this.aClass77_Sub1_Sub18_1 = this.aClass129_2.method12177(255, this.anInt1297 * -426609471, (byte) 0, true);
				}
				return null;
			}
		} else {
			try {
				if (local40 == null) {
					throw new RuntimeException();
				}
				this.aClass468_1 = new Class468(local40, this.anInt1295 * -103623205, this.aByteArray25);
			} catch (@Pc(125) RuntimeException local125) {
				this.aClass129_2.method12203(255, this.anInt1297 * -426609471);
				this.aClass468_1 = null;
				if (this.aClass129_2.method12184()) {
					this.aClass77_Sub1_Sub18_1 = null;
				} else {
					this.aClass77_Sub1_Sub18_1 = this.aClass129_2.method12177(255, this.anInt1297 * -426609471, (byte) 0, true);
				}
				return null;
			}
			if (this.aClass566_2 != null) {
				this.aClass469_1.method29574(this.anInt1297 * -426609471, local40, this.aClass566_2);
			}
		}
		this.aClass77_Sub1_Sub18_1 = null;
		if (this.aClass566_1 != null) {
			this.aByteArray26 = new byte[this.aClass468_1.anInt4986 * -540639821];
			this.anInt1298 = 0;
		}
		return this.aClass468_1;
	}

	@OriginalMember(owner = "client!aid", name = "c", descriptor = "(II)[B", line = 145)
	@Override
	byte[] method11569(@OriginalArg(0) int arg0) {
		@Pc(5) Class77_Sub1_Sub18 local5 = this.method11593(arg0, 0);
		if (local5 == null) {
			return null;
		} else {
			@Pc(13) byte[] local13 = local5.method24033();
			local5.method24063();
			return local13;
		}
	}

	@OriginalMember(owner = "client!aid", name = "j", descriptor = "(I)[B", line = 145)
	@Override
	byte[] method11580(@OriginalArg(0) int arg0) {
		@Pc(5) Class77_Sub1_Sub18 local5 = this.method11593(arg0, 0);
		if (local5 == null) {
			return null;
		} else {
			@Pc(13) byte[] local13 = local5.method24033();
			local5.method24063();
			return local13;
		}
	}

	@OriginalMember(owner = "client!aid", name = "i", descriptor = "(I)[B", line = 145)
	@Override
	byte[] method11568(@OriginalArg(0) int arg0) {
		@Pc(5) Class77_Sub1_Sub18 local5 = this.method11593(arg0, 0);
		if (local5 == null) {
			return null;
		} else {
			@Pc(13) byte[] local13 = local5.method24033();
			local5.method24063();
			return local13;
		}
	}

	@OriginalMember(owner = "client!aid", name = "f", descriptor = "(IIB)Lclient!aru;", line = 153)
	Class77_Sub1_Sub18 method11593(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) Class77_Sub1_Sub18 local6 = (Class77_Sub1_Sub18) this.aClass12_8.method173((long) arg0);
		if (local6 != null && arg1 == 0 && !local6.aBoolean538 && local6.aBoolean540) {
			local6.method24063();
			local6 = null;
		}
		if (local6 == null) {
			if (arg1 == 0) {
				if (this.aClass566_1 != null && this.aByteArray26[arg0] != -1) {
					local6 = this.aClass469_1.method29570(arg0, this.aClass566_1);
				} else if (this.aClass470_2 == null) {
					if (this.aClass129_2.method12184()) {
						return null;
					}
					local6 = this.aClass129_2.method12177(this.anInt1297 * -426609471, arg0, (byte) 2, true);
				} else {
					local6 = this.aClass470_2.method29604(this.anInt1297 * -426609471, arg0, (byte) 2, true, this.aClass468_1.anIntArray467[arg0], this.aClass468_1.anIntArray473[arg0]);
					if (local6 == null) {
						return null;
					}
				}
			} else if (arg1 == 1) {
				if (this.aClass566_1 == null) {
					throw new RuntimeException();
				}
				local6 = this.aClass469_1.method29577(arg0, this.aClass566_1);
			} else if (arg1 == 2) {
				if (this.aClass566_1 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray26[arg0] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass470_2 != null) {
					return null;
				}
				if (this.aClass129_2.method12179()) {
					return null;
				}
				local6 = this.aClass129_2.method12177(this.anInt1297 * -426609471, arg0, (byte) 2, false);
			} else {
				throw new RuntimeException();
			}
			this.aClass12_8.method184(local6, (long) arg0);
		}
		if (local6.aBoolean540) {
			return null;
		}
		@Pc(182) byte[] local182 = local6.method24033();
		@Pc(210) int local210;
		@Pc(237) byte[] local237;
		@Pc(246) byte[] local246;
		@Pc(248) int local248;
		@Pc(370) Class77_Sub1_Sub18_Sub1 local370;
		@Pc(397) Class77_Sub1_Sub18_Sub2 local397;
		if (!(local6 instanceof Class77_Sub1_Sub18_Sub3)) {
			try {
				if (local182 == null || local182.length <= 2) {
					if (this.aClass470_2 != null) {
						local6.method24063();
						return null;
					}
					throw new RuntimeException();
				}
				aCRC32_1.reset();
				aCRC32_1.update(local182, 0, local182.length - 2);
				local210 = (int) aCRC32_1.getValue();
				if (this.aClass468_1.anIntArray467[arg0] != local210) {
					throw new RuntimeException();
				}
				if (this.aClass468_1.aByteArrayArray15 != null && this.aClass468_1.aByteArrayArray15[arg0] != null) {
					local237 = this.aClass468_1.aByteArrayArray15[arg0];
					local246 = Class659.method33068(local182, 0, local182.length - 2);
					for (local248 = 0; local248 < 64; local248++) {
						if (local237[local248] != local246[local248]) {
							throw new RuntimeException();
						}
					}
				}
				if (this.aClass470_2 != null) {
					this.aClass129_2.anInt1344 = 0;
					this.aClass129_2.anInt1345 = 0;
				}
			} catch (@Pc(506) RuntimeException local506) {
				this.aClass129_2.method12203(this.anInt1297 * -426609471, arg0);
				local6.method24063();
				if (local6.aBoolean538) {
					if (this.aClass470_2 == null) {
						if (!this.aClass129_2.method12184()) {
							local397 = this.aClass129_2.method12177(this.anInt1297 * -426609471, arg0, (byte) 2, true);
							this.aClass12_8.method184(local397, (long) arg0);
						}
					} else if (!this.aClass470_2.method29598()) {
						local370 = this.aClass470_2.method29604(this.anInt1297 * -426609471, arg0, (byte) 2, true, this.aClass468_1.anIntArray467[arg0], this.aClass468_1.anIntArray473[arg0]);
						if (local370 != null) {
							this.aClass12_8.method184(local370, (long) arg0);
						}
					}
				}
				return null;
			}
			local182[local182.length - 2] = (byte) (this.aClass468_1.anIntArray473[arg0] >>> 8);
			local182[local182.length - 1] = (byte) this.aClass468_1.anIntArray473[arg0];
			if (this.aClass566_1 != null) {
				this.aClass469_1.method29574(arg0, local182, this.aClass566_1);
				if (this.aByteArray26[arg0] != 1) {
					this.anInt1298 += 1378367907;
					this.aByteArray26[arg0] = 1;
				}
			}
			if (!local6.aBoolean538) {
				local6.method24063();
			}
			return local6;
		}
		try {
			if (local182 == null || local182.length <= 2) {
				throw new RuntimeException();
			}
			aCRC32_1.reset();
			aCRC32_1.update(local182, 0, local182.length - 2);
			local210 = (int) aCRC32_1.getValue();
			if (this.aClass468_1.anIntArray467[arg0] != local210) {
				throw new RuntimeException();
			}
			if (this.aClass468_1.aByteArrayArray15 != null && this.aClass468_1.aByteArrayArray15[arg0] != null) {
				local237 = this.aClass468_1.aByteArrayArray15[arg0];
				local246 = Class659.method33068(local182, 0, local182.length - 2);
				for (local248 = 0; local248 < 64; local248++) {
					if (local246[local248] != local237[local248]) {
						throw new RuntimeException();
					}
				}
			}
			@Pc(284) int local284 = ((local182[local182.length - 2] & 0xFF) << 8) + (local182[local182.length - 1] & 0xFF);
			if (local284 != (this.aClass468_1.anIntArray473[arg0] & 0xFFFF)) {
				throw new RuntimeException();
			}
			if (this.aByteArray26[arg0] != 1) {
				if (this.aByteArray26[arg0] == 0) {
				}
				this.anInt1298 += 1378367907;
				this.aByteArray26[arg0] = 1;
			}
			if (!local6.aBoolean538) {
				local6.method24063();
			}
			return local6;
		} catch (@Pc(328) Exception local328) {
			this.aByteArray26[arg0] = -1;
			local6.method24063();
			if (local6.aBoolean538) {
				if (this.aClass470_2 == null) {
					if (!this.aClass129_2.method12184()) {
						local397 = this.aClass129_2.method12177(this.anInt1297 * -426609471, arg0, (byte) 2, true);
						this.aClass12_8.method184(local397, (long) arg0);
					}
				} else if (!this.aClass470_2.method29598()) {
					local370 = this.aClass470_2.method29604(this.anInt1297 * -426609471, arg0, (byte) 2, true, this.aClass468_1.anIntArray467[arg0], this.aClass468_1.anIntArray473[arg0]);
					if (local370 != null) {
						this.aClass12_8.method184(local370, (long) arg0);
					}
				}
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!aid", name = "ac", descriptor = "(II)Lclient!aru;", line = 153)
	Class77_Sub1_Sub18 method11594(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) Class77_Sub1_Sub18 local6 = (Class77_Sub1_Sub18) this.aClass12_8.method173((long) arg0);
		if (local6 != null && arg1 == 0 && !local6.aBoolean538 && local6.aBoolean540) {
			local6.method24063();
			local6 = null;
		}
		if (local6 == null) {
			if (arg1 == 0) {
				if (this.aClass566_1 != null && this.aByteArray26[arg0] != -1) {
					local6 = this.aClass469_1.method29570(arg0, this.aClass566_1);
				} else if (this.aClass470_2 == null) {
					if (this.aClass129_2.method12184()) {
						return null;
					}
					local6 = this.aClass129_2.method12177(this.anInt1297 * -426609471, arg0, (byte) 2, true);
				} else {
					local6 = this.aClass470_2.method29604(this.anInt1297 * -426609471, arg0, (byte) 2, true, this.aClass468_1.anIntArray467[arg0], this.aClass468_1.anIntArray473[arg0]);
					if (local6 == null) {
						return null;
					}
				}
			} else if (arg1 == 1) {
				if (this.aClass566_1 == null) {
					throw new RuntimeException();
				}
				local6 = this.aClass469_1.method29577(arg0, this.aClass566_1);
			} else if (arg1 == 2) {
				if (this.aClass566_1 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray26[arg0] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass470_2 != null) {
					return null;
				}
				if (this.aClass129_2.method12179()) {
					return null;
				}
				local6 = this.aClass129_2.method12177(this.anInt1297 * -426609471, arg0, (byte) 2, false);
			} else {
				throw new RuntimeException();
			}
			this.aClass12_8.method184(local6, (long) arg0);
		}
		if (local6.aBoolean540) {
			return null;
		}
		@Pc(182) byte[] local182 = local6.method24033();
		@Pc(210) int local210;
		@Pc(237) byte[] local237;
		@Pc(246) byte[] local246;
		@Pc(248) int local248;
		@Pc(370) Class77_Sub1_Sub18_Sub1 local370;
		@Pc(397) Class77_Sub1_Sub18_Sub2 local397;
		if (!(local6 instanceof Class77_Sub1_Sub18_Sub3)) {
			try {
				if (local182 == null || local182.length <= 2) {
					if (this.aClass470_2 != null) {
						local6.method24063();
						return null;
					}
					throw new RuntimeException();
				}
				aCRC32_1.reset();
				aCRC32_1.update(local182, 0, local182.length - 2);
				local210 = (int) aCRC32_1.getValue();
				if (this.aClass468_1.anIntArray467[arg0] != local210) {
					throw new RuntimeException();
				}
				if (this.aClass468_1.aByteArrayArray15 != null && this.aClass468_1.aByteArrayArray15[arg0] != null) {
					local237 = this.aClass468_1.aByteArrayArray15[arg0];
					local246 = Class659.method33068(local182, 0, local182.length - 2);
					for (local248 = 0; local248 < 64; local248++) {
						if (local237[local248] != local246[local248]) {
							throw new RuntimeException();
						}
					}
				}
				if (this.aClass470_2 != null) {
					this.aClass129_2.anInt1344 = 0;
					this.aClass129_2.anInt1345 = 0;
				}
			} catch (@Pc(506) RuntimeException local506) {
				this.aClass129_2.method12203(this.anInt1297 * -426609471, arg0);
				local6.method24063();
				if (local6.aBoolean538) {
					if (this.aClass470_2 == null) {
						if (!this.aClass129_2.method12184()) {
							local397 = this.aClass129_2.method12177(this.anInt1297 * -426609471, arg0, (byte) 2, true);
							this.aClass12_8.method184(local397, (long) arg0);
						}
					} else if (!this.aClass470_2.method29598()) {
						local370 = this.aClass470_2.method29604(this.anInt1297 * -426609471, arg0, (byte) 2, true, this.aClass468_1.anIntArray467[arg0], this.aClass468_1.anIntArray473[arg0]);
						if (local370 != null) {
							this.aClass12_8.method184(local370, (long) arg0);
						}
					}
				}
				return null;
			}
			local182[local182.length - 2] = (byte) (this.aClass468_1.anIntArray473[arg0] >>> 8);
			local182[local182.length - 1] = (byte) this.aClass468_1.anIntArray473[arg0];
			if (this.aClass566_1 != null) {
				this.aClass469_1.method29574(arg0, local182, this.aClass566_1);
				if (this.aByteArray26[arg0] != 1) {
					this.anInt1298 += 1378367907;
					this.aByteArray26[arg0] = 1;
				}
			}
			if (!local6.aBoolean538) {
				local6.method24063();
			}
			return local6;
		}
		try {
			if (local182 == null || local182.length <= 2) {
				throw new RuntimeException();
			}
			aCRC32_1.reset();
			aCRC32_1.update(local182, 0, local182.length - 2);
			local210 = (int) aCRC32_1.getValue();
			if (this.aClass468_1.anIntArray467[arg0] != local210) {
				throw new RuntimeException();
			}
			if (this.aClass468_1.aByteArrayArray15 != null && this.aClass468_1.aByteArrayArray15[arg0] != null) {
				local237 = this.aClass468_1.aByteArrayArray15[arg0];
				local246 = Class659.method33068(local182, 0, local182.length - 2);
				for (local248 = 0; local248 < 64; local248++) {
					if (local246[local248] != local237[local248]) {
						throw new RuntimeException();
					}
				}
			}
			@Pc(284) int local284 = ((local182[local182.length - 2] & 0xFF) << 8) + (local182[local182.length - 1] & 0xFF);
			if (local284 != (this.aClass468_1.anIntArray473[arg0] & 0xFFFF)) {
				throw new RuntimeException();
			}
			if (this.aByteArray26[arg0] != 1) {
				if (this.aByteArray26[arg0] == 0) {
				}
				this.anInt1298 += 1378367907;
				this.aByteArray26[arg0] = 1;
			}
			if (!local6.aBoolean538) {
				local6.method24063();
			}
			return local6;
		} catch (@Pc(328) Exception local328) {
			this.aByteArray26[arg0] = -1;
			local6.method24063();
			if (local6.aBoolean538) {
				if (this.aClass470_2 == null) {
					if (!this.aClass129_2.method12184()) {
						local397 = this.aClass129_2.method12177(this.anInt1297 * -426609471, arg0, (byte) 2, true);
						this.aClass12_8.method184(local397, (long) arg0);
					}
				} else if (!this.aClass470_2.method29598()) {
					local370 = this.aClass470_2.method29604(this.anInt1297 * -426609471, arg0, (byte) 2, true, this.aClass468_1.anIntArray467[arg0], this.aClass468_1.anIntArray473[arg0]);
					if (local370 != null) {
						this.aClass12_8.method184(local370, (long) arg0);
					}
				}
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!aid", name = "ad", descriptor = "(II)Lclient!aru;", line = 153)
	Class77_Sub1_Sub18 method11595(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) Class77_Sub1_Sub18 local6 = (Class77_Sub1_Sub18) this.aClass12_8.method173((long) arg0);
		if (local6 != null && arg1 == 0 && !local6.aBoolean538 && local6.aBoolean540) {
			local6.method24063();
			local6 = null;
		}
		if (local6 == null) {
			if (arg1 == 0) {
				if (this.aClass566_1 != null && this.aByteArray26[arg0] != -1) {
					local6 = this.aClass469_1.method29570(arg0, this.aClass566_1);
				} else if (this.aClass470_2 == null) {
					if (this.aClass129_2.method12184()) {
						return null;
					}
					local6 = this.aClass129_2.method12177(this.anInt1297 * -426609471, arg0, (byte) 2, true);
				} else {
					local6 = this.aClass470_2.method29604(this.anInt1297 * -426609471, arg0, (byte) 2, true, this.aClass468_1.anIntArray467[arg0], this.aClass468_1.anIntArray473[arg0]);
					if (local6 == null) {
						return null;
					}
				}
			} else if (arg1 == 1) {
				if (this.aClass566_1 == null) {
					throw new RuntimeException();
				}
				local6 = this.aClass469_1.method29577(arg0, this.aClass566_1);
			} else if (arg1 == 2) {
				if (this.aClass566_1 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray26[arg0] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass470_2 != null) {
					return null;
				}
				if (this.aClass129_2.method12179()) {
					return null;
				}
				local6 = this.aClass129_2.method12177(this.anInt1297 * -426609471, arg0, (byte) 2, false);
			} else {
				throw new RuntimeException();
			}
			this.aClass12_8.method184(local6, (long) arg0);
		}
		if (local6.aBoolean540) {
			return null;
		}
		@Pc(182) byte[] local182 = local6.method24033();
		@Pc(210) int local210;
		@Pc(237) byte[] local237;
		@Pc(246) byte[] local246;
		@Pc(248) int local248;
		@Pc(370) Class77_Sub1_Sub18_Sub1 local370;
		@Pc(397) Class77_Sub1_Sub18_Sub2 local397;
		if (!(local6 instanceof Class77_Sub1_Sub18_Sub3)) {
			try {
				if (local182 == null || local182.length <= 2) {
					if (this.aClass470_2 != null) {
						local6.method24063();
						return null;
					}
					throw new RuntimeException();
				}
				aCRC32_1.reset();
				aCRC32_1.update(local182, 0, local182.length - 2);
				local210 = (int) aCRC32_1.getValue();
				if (this.aClass468_1.anIntArray467[arg0] != local210) {
					throw new RuntimeException();
				}
				if (this.aClass468_1.aByteArrayArray15 != null && this.aClass468_1.aByteArrayArray15[arg0] != null) {
					local237 = this.aClass468_1.aByteArrayArray15[arg0];
					local246 = Class659.method33068(local182, 0, local182.length - 2);
					for (local248 = 0; local248 < 64; local248++) {
						if (local237[local248] != local246[local248]) {
							throw new RuntimeException();
						}
					}
				}
				if (this.aClass470_2 != null) {
					this.aClass129_2.anInt1344 = 0;
					this.aClass129_2.anInt1345 = 0;
				}
			} catch (@Pc(506) RuntimeException local506) {
				this.aClass129_2.method12203(this.anInt1297 * -426609471, arg0);
				local6.method24063();
				if (local6.aBoolean538) {
					if (this.aClass470_2 == null) {
						if (!this.aClass129_2.method12184()) {
							local397 = this.aClass129_2.method12177(this.anInt1297 * -426609471, arg0, (byte) 2, true);
							this.aClass12_8.method184(local397, (long) arg0);
						}
					} else if (!this.aClass470_2.method29598()) {
						local370 = this.aClass470_2.method29604(this.anInt1297 * -426609471, arg0, (byte) 2, true, this.aClass468_1.anIntArray467[arg0], this.aClass468_1.anIntArray473[arg0]);
						if (local370 != null) {
							this.aClass12_8.method184(local370, (long) arg0);
						}
					}
				}
				return null;
			}
			local182[local182.length - 2] = (byte) (this.aClass468_1.anIntArray473[arg0] >>> 8);
			local182[local182.length - 1] = (byte) this.aClass468_1.anIntArray473[arg0];
			if (this.aClass566_1 != null) {
				this.aClass469_1.method29574(arg0, local182, this.aClass566_1);
				if (this.aByteArray26[arg0] != 1) {
					this.anInt1298 += 1378367907;
					this.aByteArray26[arg0] = 1;
				}
			}
			if (!local6.aBoolean538) {
				local6.method24063();
			}
			return local6;
		}
		try {
			if (local182 == null || local182.length <= 2) {
				throw new RuntimeException();
			}
			aCRC32_1.reset();
			aCRC32_1.update(local182, 0, local182.length - 2);
			local210 = (int) aCRC32_1.getValue();
			if (this.aClass468_1.anIntArray467[arg0] != local210) {
				throw new RuntimeException();
			}
			if (this.aClass468_1.aByteArrayArray15 != null && this.aClass468_1.aByteArrayArray15[arg0] != null) {
				local237 = this.aClass468_1.aByteArrayArray15[arg0];
				local246 = Class659.method33068(local182, 0, local182.length - 2);
				for (local248 = 0; local248 < 64; local248++) {
					if (local246[local248] != local237[local248]) {
						throw new RuntimeException();
					}
				}
			}
			@Pc(284) int local284 = ((local182[local182.length - 2] & 0xFF) << 8) + (local182[local182.length - 1] & 0xFF);
			if (local284 != (this.aClass468_1.anIntArray473[arg0] & 0xFFFF)) {
				throw new RuntimeException();
			}
			if (this.aByteArray26[arg0] != 1) {
				if (this.aByteArray26[arg0] == 0) {
				}
				this.anInt1298 += 1378367907;
				this.aByteArray26[arg0] = 1;
			}
			if (!local6.aBoolean538) {
				local6.method24063();
			}
			return local6;
		} catch (@Pc(328) Exception local328) {
			this.aByteArray26[arg0] = -1;
			local6.method24063();
			if (local6.aBoolean538) {
				if (this.aClass470_2 == null) {
					if (!this.aClass129_2.method12184()) {
						local397 = this.aClass129_2.method12177(this.anInt1297 * -426609471, arg0, (byte) 2, true);
						this.aClass12_8.method184(local397, (long) arg0);
					}
				} else if (!this.aClass470_2.method29598()) {
					local370 = this.aClass470_2.method29604(this.anInt1297 * -426609471, arg0, (byte) 2, true, this.aClass468_1.anIntArray467[arg0], this.aClass468_1.anIntArray473[arg0]);
					if (local370 != null) {
						this.aClass12_8.method184(local370, (long) arg0);
					}
				}
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!aid", name = "av", descriptor = "(II)Lclient!aru;", line = 153)
	Class77_Sub1_Sub18 method11596(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) Class77_Sub1_Sub18 local6 = (Class77_Sub1_Sub18) this.aClass12_8.method173((long) arg0);
		if (local6 != null && arg1 == 0 && !local6.aBoolean538 && local6.aBoolean540) {
			local6.method24063();
			local6 = null;
		}
		if (local6 == null) {
			if (arg1 == 0) {
				if (this.aClass566_1 != null && this.aByteArray26[arg0] != -1) {
					local6 = this.aClass469_1.method29570(arg0, this.aClass566_1);
				} else if (this.aClass470_2 == null) {
					if (this.aClass129_2.method12184()) {
						return null;
					}
					local6 = this.aClass129_2.method12177(this.anInt1297 * -426609471, arg0, (byte) 2, true);
				} else {
					local6 = this.aClass470_2.method29604(this.anInt1297 * -426609471, arg0, (byte) 2, true, this.aClass468_1.anIntArray467[arg0], this.aClass468_1.anIntArray473[arg0]);
					if (local6 == null) {
						return null;
					}
				}
			} else if (arg1 == 1) {
				if (this.aClass566_1 == null) {
					throw new RuntimeException();
				}
				local6 = this.aClass469_1.method29577(arg0, this.aClass566_1);
			} else if (arg1 == 2) {
				if (this.aClass566_1 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray26[arg0] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass470_2 != null) {
					return null;
				}
				if (this.aClass129_2.method12179()) {
					return null;
				}
				local6 = this.aClass129_2.method12177(this.anInt1297 * -426609471, arg0, (byte) 2, false);
			} else {
				throw new RuntimeException();
			}
			this.aClass12_8.method184(local6, (long) arg0);
		}
		if (local6.aBoolean540) {
			return null;
		}
		@Pc(182) byte[] local182 = local6.method24033();
		@Pc(210) int local210;
		@Pc(237) byte[] local237;
		@Pc(246) byte[] local246;
		@Pc(248) int local248;
		@Pc(370) Class77_Sub1_Sub18_Sub1 local370;
		@Pc(397) Class77_Sub1_Sub18_Sub2 local397;
		if (!(local6 instanceof Class77_Sub1_Sub18_Sub3)) {
			try {
				if (local182 == null || local182.length <= 2) {
					if (this.aClass470_2 != null) {
						local6.method24063();
						return null;
					}
					throw new RuntimeException();
				}
				aCRC32_1.reset();
				aCRC32_1.update(local182, 0, local182.length - 2);
				local210 = (int) aCRC32_1.getValue();
				if (this.aClass468_1.anIntArray467[arg0] != local210) {
					throw new RuntimeException();
				}
				if (this.aClass468_1.aByteArrayArray15 != null && this.aClass468_1.aByteArrayArray15[arg0] != null) {
					local237 = this.aClass468_1.aByteArrayArray15[arg0];
					local246 = Class659.method33068(local182, 0, local182.length - 2);
					for (local248 = 0; local248 < 64; local248++) {
						if (local237[local248] != local246[local248]) {
							throw new RuntimeException();
						}
					}
				}
				if (this.aClass470_2 != null) {
					this.aClass129_2.anInt1344 = 0;
					this.aClass129_2.anInt1345 = 0;
				}
			} catch (@Pc(506) RuntimeException local506) {
				this.aClass129_2.method12203(this.anInt1297 * -426609471, arg0);
				local6.method24063();
				if (local6.aBoolean538) {
					if (this.aClass470_2 == null) {
						if (!this.aClass129_2.method12184()) {
							local397 = this.aClass129_2.method12177(this.anInt1297 * -426609471, arg0, (byte) 2, true);
							this.aClass12_8.method184(local397, (long) arg0);
						}
					} else if (!this.aClass470_2.method29598()) {
						local370 = this.aClass470_2.method29604(this.anInt1297 * -426609471, arg0, (byte) 2, true, this.aClass468_1.anIntArray467[arg0], this.aClass468_1.anIntArray473[arg0]);
						if (local370 != null) {
							this.aClass12_8.method184(local370, (long) arg0);
						}
					}
				}
				return null;
			}
			local182[local182.length - 2] = (byte) (this.aClass468_1.anIntArray473[arg0] >>> 8);
			local182[local182.length - 1] = (byte) this.aClass468_1.anIntArray473[arg0];
			if (this.aClass566_1 != null) {
				this.aClass469_1.method29574(arg0, local182, this.aClass566_1);
				if (this.aByteArray26[arg0] != 1) {
					this.anInt1298 += 1378367907;
					this.aByteArray26[arg0] = 1;
				}
			}
			if (!local6.aBoolean538) {
				local6.method24063();
			}
			return local6;
		}
		try {
			if (local182 == null || local182.length <= 2) {
				throw new RuntimeException();
			}
			aCRC32_1.reset();
			aCRC32_1.update(local182, 0, local182.length - 2);
			local210 = (int) aCRC32_1.getValue();
			if (this.aClass468_1.anIntArray467[arg0] != local210) {
				throw new RuntimeException();
			}
			if (this.aClass468_1.aByteArrayArray15 != null && this.aClass468_1.aByteArrayArray15[arg0] != null) {
				local237 = this.aClass468_1.aByteArrayArray15[arg0];
				local246 = Class659.method33068(local182, 0, local182.length - 2);
				for (local248 = 0; local248 < 64; local248++) {
					if (local246[local248] != local237[local248]) {
						throw new RuntimeException();
					}
				}
			}
			@Pc(284) int local284 = ((local182[local182.length - 2] & 0xFF) << 8) + (local182[local182.length - 1] & 0xFF);
			if (local284 != (this.aClass468_1.anIntArray473[arg0] & 0xFFFF)) {
				throw new RuntimeException();
			}
			if (this.aByteArray26[arg0] != 1) {
				if (this.aByteArray26[arg0] == 0) {
				}
				this.anInt1298 += 1378367907;
				this.aByteArray26[arg0] = 1;
			}
			if (!local6.aBoolean538) {
				local6.method24063();
			}
			return local6;
		} catch (@Pc(328) Exception local328) {
			this.aByteArray26[arg0] = -1;
			local6.method24063();
			if (local6.aBoolean538) {
				if (this.aClass470_2 == null) {
					if (!this.aClass129_2.method12184()) {
						local397 = this.aClass129_2.method12177(this.anInt1297 * -426609471, arg0, (byte) 2, true);
						this.aClass12_8.method184(local397, (long) arg0);
					}
				} else if (!this.aClass470_2.method29598()) {
					local370 = this.aClass470_2.method29604(this.anInt1297 * -426609471, arg0, (byte) 2, true, this.aClass468_1.anIntArray467[arg0], this.aClass468_1.anIntArray473[arg0]);
					if (local370 != null) {
						this.aClass12_8.method184(local370, (long) arg0);
					}
				}
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!aid", name = "o", descriptor = "(I)V", line = 307)
	void method11597() {
		if (this.aClass695_14 == null || this.method11581() == null) {
			return;
		}
		for (@Pc(14) Class77 local14 = this.aClass695_15.method36395(); local14 != null; local14 = this.aClass695_15.method36406()) {
			@Pc(22) int local22 = (int) (local14.aLong229 * 8258869577519436579L);
			if (local22 < 0 || local22 >= this.aClass468_1.anInt4986 * -540639821 || this.aClass468_1.anIntArray465[local22] == 0) {
				local14.method24063();
			} else {
				if (this.aByteArray26[local22] == 0) {
					this.method11593(local22, 1);
				}
				if (this.aByteArray26[local22] == -1) {
					this.method11593(local22, 2);
				}
				if (this.aByteArray26[local22] == 1) {
					local14.method24063();
				}
			}
		}
	}

	@OriginalMember(owner = "client!aid", name = "ae", descriptor = "()V", line = 307)
	void method11598() {
		if (this.aClass695_14 == null || this.method11581() == null) {
			return;
		}
		for (@Pc(14) Class77 local14 = this.aClass695_15.method36395(); local14 != null; local14 = this.aClass695_15.method36406()) {
			@Pc(22) int local22 = (int) (local14.aLong229 * 8258869577519436579L);
			if (local22 < 0 || local22 >= this.aClass468_1.anInt4986 * -540639821 || this.aClass468_1.anIntArray465[local22] == 0) {
				local14.method24063();
			} else {
				if (this.aByteArray26[local22] == 0) {
					this.method11593(local22, 1);
				}
				if (this.aByteArray26[local22] == -1) {
					this.method11593(local22, 2);
				}
				if (this.aByteArray26[local22] == 1) {
					local14.method24063();
				}
			}
		}
	}

	@OriginalMember(owner = "client!aid", name = "at", descriptor = "()V", line = 307)
	void method11599() {
		if (this.aClass695_14 == null || this.method11581() == null) {
			return;
		}
		for (@Pc(14) Class77 local14 = this.aClass695_15.method36395(); local14 != null; local14 = this.aClass695_15.method36406()) {
			@Pc(22) int local22 = (int) (local14.aLong229 * 8258869577519436579L);
			if (local22 < 0 || local22 >= this.aClass468_1.anInt4986 * -540639821 || this.aClass468_1.anIntArray465[local22] == 0) {
				local14.method24063();
			} else {
				if (this.aByteArray26[local22] == 0) {
					this.method11593(local22, 1);
				}
				if (this.aByteArray26[local22] == -1) {
					this.method11593(local22, 2);
				}
				if (this.aByteArray26[local22] == 1) {
					local14.method24063();
				}
			}
		}
	}

	@OriginalMember(owner = "client!aid", name = "b", descriptor = "(I)V", line = 322)
	void method11600() {
		if (this.aClass695_14 != null) {
			if (this.method11581() == null) {
				return;
			}
			@Pc(12) boolean local12;
			@Pc(17) Class77 local17;
			@Pc(25) int local25;
			if (this.aBoolean248) {
				local12 = true;
				for (local17 = this.aClass695_14.method36395(); local17 != null; local17 = this.aClass695_14.method36406()) {
					local25 = (int) (local17.aLong229 * 8258869577519436579L);
					if (this.aByteArray26[local25] == 0) {
						this.method11593(local25, 1);
					}
					if (this.aByteArray26[local25] == 0) {
						local12 = false;
					} else {
						local17.method24063();
					}
				}
				while (this.anInt1299 * 1547024225 < this.aClass468_1.anIntArray465.length) {
					if (this.aClass468_1.anIntArray465[this.anInt1299 * 1547024225] == 0) {
						this.anInt1299 += -1164759903;
					} else {
						if (this.aClass469_1.anInt4989 * 720483641 >= 250) {
							local12 = false;
							break;
						}
						if (this.aByteArray26[this.anInt1299 * 1547024225] == 0) {
							this.method11593(this.anInt1299 * 1547024225, 1);
						}
						if (this.aByteArray26[this.anInt1299 * 1547024225] == 0) {
							local17 = new Class77();
							local17.aLong229 = (long) this.anInt1299 * 323771927485105579L;
							this.aClass695_14.method36383(local17);
							local12 = false;
						}
						this.anInt1299 += -1164759903;
					}
				}
				if (local12) {
					this.aBoolean248 = false;
					this.anInt1299 = 0;
				}
			} else if (this.aBoolean246) {
				local12 = true;
				for (local17 = this.aClass695_14.method36395(); local17 != null; local17 = this.aClass695_14.method36406()) {
					local25 = (int) (local17.aLong229 * 8258869577519436579L);
					if (this.aByteArray26[local25] != 1) {
						this.method11593(local25, 2);
					}
					if (this.aByteArray26[local25] == 1) {
						local17.method24063();
					} else {
						local12 = false;
					}
				}
				while (this.anInt1299 * 1547024225 < this.aClass468_1.anIntArray465.length) {
					if (this.aClass468_1.anIntArray465[this.anInt1299 * 1547024225] == 0) {
						this.anInt1299 += -1164759903;
					} else {
						if (this.aClass129_2.method12179()) {
							local12 = false;
							break;
						}
						if (this.aByteArray26[this.anInt1299 * 1547024225] != 1) {
							this.method11593(this.anInt1299 * 1547024225, 2);
						}
						if (this.aByteArray26[this.anInt1299 * 1547024225] != 1) {
							local17 = new Class77();
							local17.aLong229 = (long) this.anInt1299 * 323771927485105579L;
							this.aClass695_14.method36383(local17);
							local12 = false;
						}
						this.anInt1299 += -1164759903;
					}
				}
				if (local12) {
					this.aBoolean246 = false;
					this.anInt1299 = 0;
				}
			} else {
				this.aClass695_14 = null;
			}
		}
		if (!this.aBoolean249 || Class280.method26667() < this.aLong47 * 7569302836751318645L) {
			return;
		}
		for (@Pc(313) Class77_Sub1_Sub18 local313 = (Class77_Sub1_Sub18) this.aClass12_8.method190(); local313 != null; local313 = (Class77_Sub1_Sub18) this.aClass12_8.method192()) {
			if (!local313.aBoolean540) {
				if (local313.aBoolean539) {
					if (!local313.aBoolean538) {
						throw new RuntimeException();
					}
					local313.method24063();
				} else {
					local313.aBoolean539 = true;
				}
			}
		}
		this.aLong47 = (Class280.method26667() + 1000L) * -7416744348770491939L;
	}

	@OriginalMember(owner = "client!aid", name = "ah", descriptor = "()V", line = 322)
	void method11601() {
		if (this.aClass695_14 != null) {
			if (this.method11581() == null) {
				return;
			}
			@Pc(12) boolean local12;
			@Pc(17) Class77 local17;
			@Pc(25) int local25;
			if (this.aBoolean248) {
				local12 = true;
				for (local17 = this.aClass695_14.method36395(); local17 != null; local17 = this.aClass695_14.method36406()) {
					local25 = (int) (local17.aLong229 * 8258869577519436579L);
					if (this.aByteArray26[local25] == 0) {
						this.method11593(local25, 1);
					}
					if (this.aByteArray26[local25] == 0) {
						local12 = false;
					} else {
						local17.method24063();
					}
				}
				while (this.anInt1299 * 1547024225 < this.aClass468_1.anIntArray465.length) {
					if (this.aClass468_1.anIntArray465[this.anInt1299 * 1547024225] == 0) {
						this.anInt1299 += -1164759903;
					} else {
						if (this.aClass469_1.anInt4989 * 720483641 >= 250) {
							local12 = false;
							break;
						}
						if (this.aByteArray26[this.anInt1299 * 1547024225] == 0) {
							this.method11593(this.anInt1299 * 1547024225, 1);
						}
						if (this.aByteArray26[this.anInt1299 * 1547024225] == 0) {
							local17 = new Class77();
							local17.aLong229 = (long) this.anInt1299 * 323771927485105579L;
							this.aClass695_14.method36383(local17);
							local12 = false;
						}
						this.anInt1299 += -1164759903;
					}
				}
				if (local12) {
					this.aBoolean248 = false;
					this.anInt1299 = 0;
				}
			} else if (this.aBoolean246) {
				local12 = true;
				for (local17 = this.aClass695_14.method36395(); local17 != null; local17 = this.aClass695_14.method36406()) {
					local25 = (int) (local17.aLong229 * 8258869577519436579L);
					if (this.aByteArray26[local25] != 1) {
						this.method11593(local25, 2);
					}
					if (this.aByteArray26[local25] == 1) {
						local17.method24063();
					} else {
						local12 = false;
					}
				}
				while (this.anInt1299 * 1547024225 < this.aClass468_1.anIntArray465.length) {
					if (this.aClass468_1.anIntArray465[this.anInt1299 * 1547024225] == 0) {
						this.anInt1299 += -1164759903;
					} else {
						if (this.aClass129_2.method12179()) {
							local12 = false;
							break;
						}
						if (this.aByteArray26[this.anInt1299 * 1547024225] != 1) {
							this.method11593(this.anInt1299 * 1547024225, 2);
						}
						if (this.aByteArray26[this.anInt1299 * 1547024225] != 1) {
							local17 = new Class77();
							local17.aLong229 = (long) this.anInt1299 * 323771927485105579L;
							this.aClass695_14.method36383(local17);
							local12 = false;
						}
						this.anInt1299 += -1164759903;
					}
				}
				if (local12) {
					this.aBoolean246 = false;
					this.anInt1299 = 0;
				}
			} else {
				this.aClass695_14 = null;
			}
		}
		if (!this.aBoolean249 || Class280.method26667() < this.aLong47 * 7569302836751318645L) {
			return;
		}
		for (@Pc(313) Class77_Sub1_Sub18 local313 = (Class77_Sub1_Sub18) this.aClass12_8.method190(); local313 != null; local313 = (Class77_Sub1_Sub18) this.aClass12_8.method192()) {
			if (!local313.aBoolean540) {
				if (local313.aBoolean539) {
					if (!local313.aBoolean538) {
						throw new RuntimeException();
					}
					local313.method24063();
				} else {
					local313.aBoolean539 = true;
				}
			}
		}
		this.aLong47 = (Class280.method26667() + 1000L) * -7416744348770491939L;
	}

	@OriginalMember(owner = "client!aid", name = "as", descriptor = "()V", line = 322)
	void method11602() {
		if (this.aClass695_14 != null) {
			if (this.method11581() == null) {
				return;
			}
			@Pc(12) boolean local12;
			@Pc(17) Class77 local17;
			@Pc(25) int local25;
			if (this.aBoolean248) {
				local12 = true;
				for (local17 = this.aClass695_14.method36395(); local17 != null; local17 = this.aClass695_14.method36406()) {
					local25 = (int) (local17.aLong229 * 8258869577519436579L);
					if (this.aByteArray26[local25] == 0) {
						this.method11593(local25, 1);
					}
					if (this.aByteArray26[local25] == 0) {
						local12 = false;
					} else {
						local17.method24063();
					}
				}
				while (this.anInt1299 * 1547024225 < this.aClass468_1.anIntArray465.length) {
					if (this.aClass468_1.anIntArray465[this.anInt1299 * 1547024225] == 0) {
						this.anInt1299 += -1164759903;
					} else {
						if (this.aClass469_1.anInt4989 * 720483641 >= 250) {
							local12 = false;
							break;
						}
						if (this.aByteArray26[this.anInt1299 * 1547024225] == 0) {
							this.method11593(this.anInt1299 * 1547024225, 1);
						}
						if (this.aByteArray26[this.anInt1299 * 1547024225] == 0) {
							local17 = new Class77();
							local17.aLong229 = (long) this.anInt1299 * 323771927485105579L;
							this.aClass695_14.method36383(local17);
							local12 = false;
						}
						this.anInt1299 += -1164759903;
					}
				}
				if (local12) {
					this.aBoolean248 = false;
					this.anInt1299 = 0;
				}
			} else if (this.aBoolean246) {
				local12 = true;
				for (local17 = this.aClass695_14.method36395(); local17 != null; local17 = this.aClass695_14.method36406()) {
					local25 = (int) (local17.aLong229 * 8258869577519436579L);
					if (this.aByteArray26[local25] != 1) {
						this.method11593(local25, 2);
					}
					if (this.aByteArray26[local25] == 1) {
						local17.method24063();
					} else {
						local12 = false;
					}
				}
				while (this.anInt1299 * 1547024225 < this.aClass468_1.anIntArray465.length) {
					if (this.aClass468_1.anIntArray465[this.anInt1299 * 1547024225] == 0) {
						this.anInt1299 += -1164759903;
					} else {
						if (this.aClass129_2.method12179()) {
							local12 = false;
							break;
						}
						if (this.aByteArray26[this.anInt1299 * 1547024225] != 1) {
							this.method11593(this.anInt1299 * 1547024225, 2);
						}
						if (this.aByteArray26[this.anInt1299 * 1547024225] != 1) {
							local17 = new Class77();
							local17.aLong229 = (long) this.anInt1299 * 323771927485105579L;
							this.aClass695_14.method36383(local17);
							local12 = false;
						}
						this.anInt1299 += -1164759903;
					}
				}
				if (local12) {
					this.aBoolean246 = false;
					this.anInt1299 = 0;
				}
			} else {
				this.aClass695_14 = null;
			}
		}
		if (!this.aBoolean249 || Class280.method26667() < this.aLong47 * 7569302836751318645L) {
			return;
		}
		for (@Pc(313) Class77_Sub1_Sub18 local313 = (Class77_Sub1_Sub18) this.aClass12_8.method190(); local313 != null; local313 = (Class77_Sub1_Sub18) this.aClass12_8.method192()) {
			if (!local313.aBoolean540) {
				if (local313.aBoolean539) {
					if (!local313.aBoolean538) {
						throw new RuntimeException();
					}
					local313.method24063();
				} else {
					local313.aBoolean539 = true;
				}
			}
		}
		this.aLong47 = (Class280.method26667() + 1000L) * -7416744348770491939L;
	}

	@OriginalMember(owner = "client!aid", name = "aq", descriptor = "()I", line = 404)
	public int method11603() {
		return this.aClass468_1 == null ? 0 : this.aClass468_1.anInt4985 * -1069101825;
	}

	@OriginalMember(owner = "client!aid", name = "n", descriptor = "(B)I", line = 404)
	public int method11604() {
		return this.aClass468_1 == null ? 0 : this.aClass468_1.anInt4985 * -1069101825;
	}

	@OriginalMember(owner = "client!aid", name = "am", descriptor = "()I", line = 404)
	public int method11605() {
		return this.aClass468_1 == null ? 0 : this.aClass468_1.anInt4985 * -1069101825;
	}

	@OriginalMember(owner = "client!aid", name = "af", descriptor = "()I", line = 409)
	public int method11606() {
		return this.anInt1298 * 176734731;
	}

	@OriginalMember(owner = "client!aid", name = "ay", descriptor = "()I", line = 409)
	public int method11607() {
		return this.anInt1298 * 176734731;
	}

	@OriginalMember(owner = "client!aid", name = "a", descriptor = "(I)I", line = 409)
	public int method11608() {
		return this.anInt1298 * 176734731;
	}

	@OriginalMember(owner = "client!aid", name = "m", descriptor = "(B)I", line = 413)
	public int method11609() {
		if (this.aClass468_1 == null) {
			return 0;
		} else if (this.aBoolean248) {
			@Pc(19) Class77 local19 = this.aClass695_14.method36395();
			return local19 == null ? 0 : (int) (local19.aLong229 * 8258869577519436579L);
		} else {
			return this.aClass468_1.anInt4985 * -1069101825;
		}
	}

	@OriginalMember(owner = "client!aid", name = "an", descriptor = "()I", line = 413)
	public int method11610() {
		if (this.aClass468_1 == null) {
			return 0;
		} else if (this.aBoolean248) {
			@Pc(19) Class77 local19 = this.aClass695_14.method36395();
			return local19 == null ? 0 : (int) (local19.aLong229 * 8258869577519436579L);
		} else {
			return this.aClass468_1.anInt4985 * -1069101825;
		}
	}

	@OriginalMember(owner = "client!aid", name = "ab", descriptor = "()V", line = 421)
	public void method11611() {
		if (this.aClass470_2 != null || this.aClass566_1 == null) {
			return;
		}
		this.aBoolean246 = true;
		this.aBoolean247 = true;
		if (this.aClass695_14 == null) {
			this.aClass695_14 = new Class695();
		}
	}

	@OriginalMember(owner = "client!aid", name = "h", descriptor = "(I)V", line = 421)
	public void method11612() {
		if (this.aClass470_2 != null || this.aClass566_1 == null) {
			return;
		}
		this.aBoolean246 = true;
		this.aBoolean247 = true;
		if (this.aClass695_14 == null) {
			this.aClass695_14 = new Class695();
		}
	}

	@OriginalMember(owner = "client!aid", name = "aa", descriptor = "()V", line = 421)
	public void method11613() {
		if (this.aClass470_2 != null || this.aClass566_1 == null) {
			return;
		}
		this.aBoolean246 = true;
		this.aBoolean247 = true;
		if (this.aClass695_14 == null) {
			this.aClass695_14 = new Class695();
		}
	}

	@OriginalMember(owner = "client!aid", name = "s", descriptor = "(I)V", line = 429)
	@Override
	void method11577(@OriginalArg(0) int arg0) {
		if (this.aClass566_1 == null) {
			return;
		}
		@Pc(9) Class77 local9;
		for (local9 = this.aClass695_15.method36395(); local9 != null; local9 = this.aClass695_15.method36406()) {
			if (local9.aLong229 * 8258869577519436579L == (long) arg0) {
				return;
			}
		}
		local9 = new Class77();
		local9.aLong229 = (long) arg0 * 936217890172187787L;
		this.aClass695_15.method36383(local9);
	}

	@OriginalMember(owner = "client!aid", name = "t", descriptor = "(I)V", line = 429)
	@Override
	void method11573(@OriginalArg(0) int arg0) {
		if (this.aClass566_1 == null) {
			return;
		}
		@Pc(9) Class77 local9;
		for (local9 = this.aClass695_15.method36395(); local9 != null; local9 = this.aClass695_15.method36406()) {
			if (local9.aLong229 * 8258869577519436579L == (long) arg0) {
				return;
			}
		}
		local9 = new Class77();
		local9.aLong229 = (long) arg0 * 936217890172187787L;
		this.aClass695_15.method36383(local9);
	}

	@OriginalMember(owner = "client!aid", name = "q", descriptor = "(I)V", line = 429)
	@Override
	void method11574(@OriginalArg(0) int arg0) {
		if (this.aClass566_1 == null) {
			return;
		}
		@Pc(9) Class77 local9;
		for (local9 = this.aClass695_15.method36395(); local9 != null; local9 = this.aClass695_15.method36406()) {
			if (local9.aLong229 * 8258869577519436579L == (long) arg0) {
				return;
			}
		}
		local9 = new Class77();
		local9.aLong229 = (long) arg0 * 936217890172187787L;
		this.aClass695_15.method36383(local9);
	}

	@OriginalMember(owner = "client!aid", name = "x", descriptor = "(I)V", line = 429)
	@Override
	void method11575(@OriginalArg(0) int arg0) {
		if (this.aClass566_1 == null) {
			return;
		}
		@Pc(9) Class77 local9;
		for (local9 = this.aClass695_15.method36395(); local9 != null; local9 = this.aClass695_15.method36406()) {
			if (local9.aLong229 * 8258869577519436579L == (long) arg0) {
				return;
			}
		}
		local9 = new Class77();
		local9.aLong229 = (long) arg0 * 936217890172187787L;
		this.aClass695_15.method36383(local9);
	}

	@OriginalMember(owner = "client!aid", name = "d", descriptor = "(I)V", line = 429)
	@Override
	void method11576(@OriginalArg(0) int arg0) {
		if (this.aClass566_1 == null) {
			return;
		}
		@Pc(9) Class77 local9;
		for (local9 = this.aClass695_15.method36395(); local9 != null; local9 = this.aClass695_15.method36406()) {
			if (local9.aLong229 * 8258869577519436579L == (long) arg0) {
				return;
			}
		}
		local9 = new Class77();
		local9.aLong229 = (long) arg0 * 936217890172187787L;
		this.aClass695_15.method36383(local9);
	}

	@OriginalMember(owner = "client!aid", name = "v", descriptor = "(II)V", line = 429)
	@Override
	void method11570(@OriginalArg(0) int arg0) {
		if (this.aClass566_1 == null) {
			return;
		}
		@Pc(9) Class77 local9;
		for (local9 = this.aClass695_15.method36395(); local9 != null; local9 = this.aClass695_15.method36406()) {
			if (local9.aLong229 * 8258869577519436579L == (long) arg0) {
				return;
			}
		}
		local9 = new Class77();
		local9.aLong229 = (long) arg0 * 936217890172187787L;
		this.aClass695_15.method36383(local9);
	}

	@OriginalMember(owner = "client!aid", name = "l", descriptor = "(II)I", line = 439)
	@Override
	int method11571(@OriginalArg(0) int arg0) {
		@Pc(6) Class77_Sub1_Sub18 local6 = (Class77_Sub1_Sub18) this.aClass12_8.method173((long) arg0);
		return local6 == null ? 0 : local6.method24034();
	}

	@OriginalMember(owner = "client!aid", name = "r", descriptor = "(I)I", line = 439)
	@Override
	int method11578(@OriginalArg(0) int arg0) {
		@Pc(6) Class77_Sub1_Sub18 local6 = (Class77_Sub1_Sub18) this.aClass12_8.method173((long) arg0);
		return local6 == null ? 0 : local6.method24034();
	}

	@OriginalMember(owner = "client!aid", name = "g", descriptor = "(I)I", line = 439)
	@Override
	int method11579(@OriginalArg(0) int arg0) {
		@Pc(6) Class77_Sub1_Sub18 local6 = (Class77_Sub1_Sub18) this.aClass12_8.method173((long) arg0);
		return local6 == null ? 0 : local6.method24034();
	}

	@OriginalMember(owner = "client!aid", name = "z", descriptor = "(I)I", line = 439)
	@Override
	int method11567(@OriginalArg(0) int arg0) {
		@Pc(6) Class77_Sub1_Sub18 local6 = (Class77_Sub1_Sub18) this.aClass12_8.method173((long) arg0);
		return local6 == null ? 0 : local6.method24034();
	}

	@OriginalMember(owner = "client!aid", name = "aj", descriptor = "(B)Z", line = 445)
	public boolean method11614() {
		return this.aBoolean247;
	}

	@OriginalMember(owner = "client!aid", name = "ap", descriptor = "()Z", line = 445)
	public boolean method11615() {
		return this.aBoolean247;
	}

	@OriginalMember(owner = "client!aid", name = "az", descriptor = "(Z)V", line = 449)
	void method11616(@OriginalArg(0) boolean arg0) {
		this.aClass470_2.method29610(arg0);
	}

	@OriginalMember(owner = "client!aid", name = "ai", descriptor = "(ZI)V", line = 449)
	void method11617(@OriginalArg(0) boolean arg0) {
		this.aClass470_2.method29610(arg0);
	}

	@OriginalMember(owner = "client!aid", name = "aw", descriptor = "(Z)V", line = 449)
	void method11618(@OriginalArg(0) boolean arg0) {
		this.aClass470_2.method29610(arg0);
	}

	@OriginalMember(owner = "client!aid", name = "ag", descriptor = "(I)Z", line = 453)
	boolean method11619() {
		return this.aClass470_2 != null;
	}

	@OriginalMember(owner = "client!aid", name = "bv", descriptor = "()Z", line = 453)
	boolean method11620() {
		return this.aClass470_2 != null;
	}

	@OriginalMember(owner = "client!aid", name = "ba", descriptor = "()Z", line = 453)
	boolean method11621() {
		return this.aClass470_2 != null;
	}

	@OriginalMember(owner = "client!aid", name = "bc", descriptor = "()Z", line = 453)
	boolean method11622() {
		return this.aClass470_2 != null;
	}

	@OriginalMember(owner = "client!aid", name = "bj", descriptor = "()Z", line = 453)
	boolean method11623() {
		return this.aClass470_2 != null;
	}

	@OriginalMember(owner = "client!aid", name = "ga", descriptor = "(Lclient!yf;I)V", line = 5606)
	static final void method11624(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class330.method27594(local16, local22, arg0);
	}
}

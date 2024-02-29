package com.jagex;

import java.math.BigInteger;
import java.util.HashMap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pr")
public class Class473 {

	@OriginalMember(owner = "client!pr", name = "eb", descriptor = "Lclient!ta;")
	static Class139 aClass139_4;

	@OriginalMember(owner = "client!pr", name = "q", descriptor = "Lclient!ph;")
	Class464 aClass464_1;

	@OriginalMember(owner = "client!pr", name = "x", descriptor = "Lclient!ph;")
	Class464 aClass464_2;

	@OriginalMember(owner = "client!pr", name = "s", descriptor = "[Lclient!aid;")
	Class126_Sub1[] aClass126_Sub1Array1;

	@OriginalMember(owner = "client!pr", name = "d", descriptor = "Z")
	boolean aBoolean755 = false;

	@OriginalMember(owner = "client!pr", name = "p", descriptor = "Lclient!pa;")
	Class129 aClass129_3;

	@OriginalMember(owner = "client!pr", name = "c", descriptor = "Lclient!po;")
	Class470 aClass470_3;

	@OriginalMember(owner = "client!pr", name = "v", descriptor = "Lclient!pn;")
	Class469 aClass469_2;

	@OriginalMember(owner = "client!pr", name = "l", descriptor = "Ljava/math/BigInteger;")
	BigInteger aBigInteger6;

	@OriginalMember(owner = "client!pr", name = "y", descriptor = "Ljava/math/BigInteger;")
	BigInteger aBigInteger5;

	@OriginalMember(owner = "client!pr", name = "w", descriptor = "Lclient!ati;")
	Class77_Sub1_Sub18_Sub2 aClass77_Sub1_Sub18_Sub2_3;

	@OriginalMember(owner = "client!pr", name = "t", descriptor = "Lclient!ata;")
	Class77_Sub1_Sub18_Sub1 aClass77_Sub1_Sub18_Sub1_1;

	@OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(Lclient!pa;Lclient!po;Lclient!pn;Ljava/math/BigInteger;Ljava/math/BigInteger;)V", line = 21)
	public Class473(@OriginalArg(0) Class129 arg0, @OriginalArg(1) Class470 arg1, @OriginalArg(2) Class469 arg2, @OriginalArg(3) BigInteger arg3, @OriginalArg(4) BigInteger arg4) {
		this.aClass129_3 = arg0;
		this.aClass470_3 = arg1;
		this.aClass469_2 = arg2;
		this.aBigInteger6 = arg3;
		this.aBigInteger5 = arg4;
		if (!this.aClass129_3.method12184()) {
			this.aClass77_Sub1_Sub18_Sub2_3 = this.aClass129_3.method12177(255, 255, (byte) 0, true);
		}
		if (this.aClass470_3 != null) {
			this.aClass77_Sub1_Sub18_Sub1_1 = this.aClass470_3.method29599();
		}
	}

	@OriginalMember(owner = "client!pr", name = "w", descriptor = "()Z", line = 32)
	public boolean method29637() {
		if (this.aClass464_1 != null) {
			return true;
		}
		if (this.aClass77_Sub1_Sub18_Sub2_3 == null) {
			if (this.aClass129_3.method12184()) {
				return false;
			}
			this.aClass77_Sub1_Sub18_Sub2_3 = this.aClass129_3.method12177(255, 255, (byte) 0, true);
		}
		if (this.aClass77_Sub1_Sub18_Sub2_3.aBoolean540) {
			return false;
		}
		@Pc(40) Class77_Sub39 local40 = new Class77_Sub39(this.aClass77_Sub1_Sub18_Sub2_3.method24033());
		this.aClass464_1 = new Class464(local40, this.aBigInteger6, this.aBigInteger5);
		if (this.aClass126_Sub1Array1 == null) {
			this.aClass126_Sub1Array1 = new Class126_Sub1[this.aClass464_1.aClass466Array1.length];
		} else {
			for (@Pc(64) int local64 = 0; local64 < this.aClass126_Sub1Array1.length; local64++) {
				if (this.aClass126_Sub1Array1[local64] != null) {
					@Pc(82) Class466 local82 = this.aClass464_1.aClass466Array1[local64];
					this.aClass126_Sub1Array1[local64].method11584(local82.anInt4980 * -1393657873, local82.aByteArray85, local82.anInt4981 * 1492181625, local82.anInt4979 * 13321921);
					if (this.aClass126_Sub1Array1[local64].method11619()) {
						this.aClass126_Sub1Array1[local64].method11617(false);
					}
				}
			}
		}
		this.aBoolean755 = false;
		return true;
	}

	@OriginalMember(owner = "client!pr", name = "p", descriptor = "(I)Z", line = 32)
	public boolean method29638() {
		if (this.aClass464_1 != null) {
			return true;
		}
		if (this.aClass77_Sub1_Sub18_Sub2_3 == null) {
			if (this.aClass129_3.method12184()) {
				return false;
			}
			this.aClass77_Sub1_Sub18_Sub2_3 = this.aClass129_3.method12177(255, 255, (byte) 0, true);
		}
		if (this.aClass77_Sub1_Sub18_Sub2_3.aBoolean540) {
			return false;
		}
		@Pc(40) Class77_Sub39 local40 = new Class77_Sub39(this.aClass77_Sub1_Sub18_Sub2_3.method24033());
		this.aClass464_1 = new Class464(local40, this.aBigInteger6, this.aBigInteger5);
		if (this.aClass126_Sub1Array1 == null) {
			this.aClass126_Sub1Array1 = new Class126_Sub1[this.aClass464_1.aClass466Array1.length];
		} else {
			for (@Pc(64) int local64 = 0; local64 < this.aClass126_Sub1Array1.length; local64++) {
				if (this.aClass126_Sub1Array1[local64] != null) {
					@Pc(82) Class466 local82 = this.aClass464_1.aClass466Array1[local64];
					this.aClass126_Sub1Array1[local64].method11584(local82.anInt4980 * -1393657873, local82.aByteArray85, local82.anInt4981 * 1492181625, local82.anInt4979 * 13321921);
					if (this.aClass126_Sub1Array1[local64].method11619()) {
						this.aClass126_Sub1Array1[local64].method11617(false);
					}
				}
			}
		}
		this.aBoolean755 = false;
		return true;
	}

	@OriginalMember(owner = "client!pr", name = "t", descriptor = "()Z", line = 32)
	public boolean method29639() {
		if (this.aClass464_1 != null) {
			return true;
		}
		if (this.aClass77_Sub1_Sub18_Sub2_3 == null) {
			if (this.aClass129_3.method12184()) {
				return false;
			}
			this.aClass77_Sub1_Sub18_Sub2_3 = this.aClass129_3.method12177(255, 255, (byte) 0, true);
		}
		if (this.aClass77_Sub1_Sub18_Sub2_3.aBoolean540) {
			return false;
		}
		@Pc(40) Class77_Sub39 local40 = new Class77_Sub39(this.aClass77_Sub1_Sub18_Sub2_3.method24033());
		this.aClass464_1 = new Class464(local40, this.aBigInteger6, this.aBigInteger5);
		if (this.aClass126_Sub1Array1 == null) {
			this.aClass126_Sub1Array1 = new Class126_Sub1[this.aClass464_1.aClass466Array1.length];
		} else {
			for (@Pc(64) int local64 = 0; local64 < this.aClass126_Sub1Array1.length; local64++) {
				if (this.aClass126_Sub1Array1[local64] != null) {
					@Pc(82) Class466 local82 = this.aClass464_1.aClass466Array1[local64];
					this.aClass126_Sub1Array1[local64].method11584(local82.anInt4980 * -1393657873, local82.aByteArray85, local82.anInt4981 * 1492181625, local82.anInt4979 * 13321921);
					if (this.aClass126_Sub1Array1[local64].method11619()) {
						this.aClass126_Sub1Array1[local64].method11617(false);
					}
				}
			}
		}
		this.aBoolean755 = false;
		return true;
	}

	@OriginalMember(owner = "client!pr", name = "y", descriptor = "()Z", line = 32)
	public boolean method29640() {
		if (this.aClass464_1 != null) {
			return true;
		}
		if (this.aClass77_Sub1_Sub18_Sub2_3 == null) {
			if (this.aClass129_3.method12184()) {
				return false;
			}
			this.aClass77_Sub1_Sub18_Sub2_3 = this.aClass129_3.method12177(255, 255, (byte) 0, true);
		}
		if (this.aClass77_Sub1_Sub18_Sub2_3.aBoolean540) {
			return false;
		}
		@Pc(40) Class77_Sub39 local40 = new Class77_Sub39(this.aClass77_Sub1_Sub18_Sub2_3.method24033());
		this.aClass464_1 = new Class464(local40, this.aBigInteger6, this.aBigInteger5);
		if (this.aClass126_Sub1Array1 == null) {
			this.aClass126_Sub1Array1 = new Class126_Sub1[this.aClass464_1.aClass466Array1.length];
		} else {
			for (@Pc(64) int local64 = 0; local64 < this.aClass126_Sub1Array1.length; local64++) {
				if (this.aClass126_Sub1Array1[local64] != null) {
					@Pc(82) Class466 local82 = this.aClass464_1.aClass466Array1[local64];
					this.aClass126_Sub1Array1[local64].method11584(local82.anInt4980 * -1393657873, local82.aByteArray85, local82.anInt4981 * 1492181625, local82.anInt4979 * 13321921);
					if (this.aClass126_Sub1Array1[local64].method11619()) {
						this.aClass126_Sub1Array1[local64].method11617(false);
					}
				}
			}
		}
		this.aBoolean755 = false;
		return true;
	}

	@OriginalMember(owner = "client!pr", name = "c", descriptor = "(ILclient!tx;Lclient!tx;ZI)Lclient!aid;", line = 56)
	public Class126_Sub1 method29641(@OriginalArg(0) int arg0, @OriginalArg(1) Class566 arg1, @OriginalArg(2) Class566 arg2, @OriginalArg(3) boolean arg3) {
		return this.method29645(arg0, arg1, arg2, true, arg3);
	}

	@OriginalMember(owner = "client!pr", name = "q", descriptor = "(ILclient!tx;Lclient!tx;Z)Lclient!aid;", line = 56)
	public Class126_Sub1 method29642(@OriginalArg(0) int arg0, @OriginalArg(1) Class566 arg1, @OriginalArg(2) Class566 arg2, @OriginalArg(3) boolean arg3) {
		return this.method29645(arg0, arg1, arg2, true, arg3);
	}

	@OriginalMember(owner = "client!pr", name = "d", descriptor = "(ILclient!tx;Lclient!tx;Z)Lclient!aid;", line = 56)
	public Class126_Sub1 method29643(@OriginalArg(0) int arg0, @OriginalArg(1) Class566 arg1, @OriginalArg(2) Class566 arg2, @OriginalArg(3) boolean arg3) {
		return this.method29645(arg0, arg1, arg2, true, arg3);
	}

	@OriginalMember(owner = "client!pr", name = "x", descriptor = "(ILclient!tx;Lclient!tx;Z)Lclient!aid;", line = 56)
	public Class126_Sub1 method29644(@OriginalArg(0) int arg0, @OriginalArg(1) Class566 arg1, @OriginalArg(2) Class566 arg2, @OriginalArg(3) boolean arg3) {
		return this.method29645(arg0, arg1, arg2, true, arg3);
	}

	@OriginalMember(owner = "client!pr", name = "v", descriptor = "(ILclient!tx;Lclient!tx;ZZI)Lclient!aid;", line = 60)
	Class126_Sub1 method29645(@OriginalArg(0) int arg0, @OriginalArg(1) Class566 arg1, @OriginalArg(2) Class566 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass464_1 == null) {
			throw new RuntimeException();
		} else if (arg0 < 0 || arg0 >= this.aClass126_Sub1Array1.length) {
			throw new RuntimeException();
		} else if (this.aClass126_Sub1Array1[arg0] == null) {
			@Pc(33) Class466 local33 = this.aClass464_1.aClass466Array1[arg0];
			@Pc(65) Class126_Sub1 local65 = new Class126_Sub1(arg0, arg1, arg2, this.aClass129_3, arg4 ? this.aClass470_3 : null, this.aClass469_2, local33.anInt4980 * -1393657873, local33.aByteArray85, local33.anInt4981 * 1492181625, arg3, local33.anInt4979 * 13321921);
			this.aClass126_Sub1Array1[arg0] = local65;
			if (this.aClass464_2 != null && arg4) {
				@Pc(81) Class466 local81 = this.aClass464_2.aClass466Array1[arg0];
				this.aClass126_Sub1Array1[arg0].method11617(this.aClass126_Sub1Array1[arg0].method11588(local81.anInt4980 * -1393657873, local81.aByteArray85, local81.anInt4981 * 1492181625, local81.anInt4979 * 13321921));
			}
			return local65;
		} else {
			return this.aClass126_Sub1Array1[arg0];
		}
	}

	@OriginalMember(owner = "client!pr", name = "g", descriptor = "(ILclient!tx;Lclient!tx;ZZ)Lclient!aid;", line = 60)
	Class126_Sub1 method29646(@OriginalArg(0) int arg0, @OriginalArg(1) Class566 arg1, @OriginalArg(2) Class566 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass464_1 == null) {
			throw new RuntimeException();
		} else if (arg0 < 0 || arg0 >= this.aClass126_Sub1Array1.length) {
			throw new RuntimeException();
		} else if (this.aClass126_Sub1Array1[arg0] == null) {
			@Pc(33) Class466 local33 = this.aClass464_1.aClass466Array1[arg0];
			@Pc(65) Class126_Sub1 local65 = new Class126_Sub1(arg0, arg1, arg2, this.aClass129_3, arg4 ? this.aClass470_3 : null, this.aClass469_2, local33.anInt4980 * -1393657873, local33.aByteArray85, local33.anInt4981 * 1492181625, arg3, local33.anInt4979 * 13321921);
			this.aClass126_Sub1Array1[arg0] = local65;
			if (this.aClass464_2 != null && arg4) {
				@Pc(81) Class466 local81 = this.aClass464_2.aClass466Array1[arg0];
				this.aClass126_Sub1Array1[arg0].method11617(this.aClass126_Sub1Array1[arg0].method11588(local81.anInt4980 * -1393657873, local81.aByteArray85, local81.anInt4981 * 1492181625, local81.anInt4979 * 13321921));
			}
			return local65;
		} else {
			return this.aClass126_Sub1Array1[arg0];
		}
	}

	@OriginalMember(owner = "client!pr", name = "z", descriptor = "(ILclient!tx;Lclient!tx;ZZ)Lclient!aid;", line = 60)
	Class126_Sub1 method29647(@OriginalArg(0) int arg0, @OriginalArg(1) Class566 arg1, @OriginalArg(2) Class566 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass464_1 == null) {
			throw new RuntimeException();
		} else if (arg0 < 0 || arg0 >= this.aClass126_Sub1Array1.length) {
			throw new RuntimeException();
		} else if (this.aClass126_Sub1Array1[arg0] == null) {
			@Pc(33) Class466 local33 = this.aClass464_1.aClass466Array1[arg0];
			@Pc(65) Class126_Sub1 local65 = new Class126_Sub1(arg0, arg1, arg2, this.aClass129_3, arg4 ? this.aClass470_3 : null, this.aClass469_2, local33.anInt4980 * -1393657873, local33.aByteArray85, local33.anInt4981 * 1492181625, arg3, local33.anInt4979 * 13321921);
			this.aClass126_Sub1Array1[arg0] = local65;
			if (this.aClass464_2 != null && arg4) {
				@Pc(81) Class466 local81 = this.aClass464_2.aClass466Array1[arg0];
				this.aClass126_Sub1Array1[arg0].method11617(this.aClass126_Sub1Array1[arg0].method11588(local81.anInt4980 * -1393657873, local81.aByteArray85, local81.anInt4981 * 1492181625, local81.anInt4979 * 13321921));
			}
			return local65;
		} else {
			return this.aClass126_Sub1Array1[arg0];
		}
	}

	@OriginalMember(owner = "client!pr", name = "s", descriptor = "(ILclient!tx;Lclient!tx;ZZ)Lclient!aid;", line = 60)
	Class126_Sub1 method29648(@OriginalArg(0) int arg0, @OriginalArg(1) Class566 arg1, @OriginalArg(2) Class566 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass464_1 == null) {
			throw new RuntimeException();
		} else if (arg0 < 0 || arg0 >= this.aClass126_Sub1Array1.length) {
			throw new RuntimeException();
		} else if (this.aClass126_Sub1Array1[arg0] == null) {
			@Pc(33) Class466 local33 = this.aClass464_1.aClass466Array1[arg0];
			@Pc(65) Class126_Sub1 local65 = new Class126_Sub1(arg0, arg1, arg2, this.aClass129_3, arg4 ? this.aClass470_3 : null, this.aClass469_2, local33.anInt4980 * -1393657873, local33.aByteArray85, local33.anInt4981 * 1492181625, arg3, local33.anInt4979 * 13321921);
			this.aClass126_Sub1Array1[arg0] = local65;
			if (this.aClass464_2 != null && arg4) {
				@Pc(81) Class466 local81 = this.aClass464_2.aClass466Array1[arg0];
				this.aClass126_Sub1Array1[arg0].method11617(this.aClass126_Sub1Array1[arg0].method11588(local81.anInt4980 * -1393657873, local81.aByteArray85, local81.anInt4981 * 1492181625, local81.anInt4979 * 13321921));
			}
			return local65;
		} else {
			return this.aClass126_Sub1Array1[arg0];
		}
	}

	@OriginalMember(owner = "client!pr", name = "r", descriptor = "(ILclient!tx;Lclient!tx;ZZ)Lclient!aid;", line = 60)
	Class126_Sub1 method29649(@OriginalArg(0) int arg0, @OriginalArg(1) Class566 arg1, @OriginalArg(2) Class566 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass464_1 == null) {
			throw new RuntimeException();
		} else if (arg0 < 0 || arg0 >= this.aClass126_Sub1Array1.length) {
			throw new RuntimeException();
		} else if (this.aClass126_Sub1Array1[arg0] == null) {
			@Pc(33) Class466 local33 = this.aClass464_1.aClass466Array1[arg0];
			@Pc(65) Class126_Sub1 local65 = new Class126_Sub1(arg0, arg1, arg2, this.aClass129_3, arg4 ? this.aClass470_3 : null, this.aClass469_2, local33.anInt4980 * -1393657873, local33.aByteArray85, local33.anInt4981 * 1492181625, arg3, local33.anInt4979 * 13321921);
			this.aClass126_Sub1Array1[arg0] = local65;
			if (this.aClass464_2 != null && arg4) {
				@Pc(81) Class466 local81 = this.aClass464_2.aClass466Array1[arg0];
				this.aClass126_Sub1Array1[arg0].method11617(this.aClass126_Sub1Array1[arg0].method11588(local81.anInt4980 * -1393657873, local81.aByteArray85, local81.anInt4981 * 1492181625, local81.anInt4979 * 13321921));
			}
			return local65;
		} else {
			return this.aClass126_Sub1Array1[arg0];
		}
	}

	@OriginalMember(owner = "client!pr", name = "l", descriptor = "(I)V", line = 78)
	public void method29650() {
		if (this.aClass126_Sub1Array1 == null) {
			return;
		}
		@Pc(5) int local5;
		for (local5 = 0; local5 < this.aClass126_Sub1Array1.length; local5++) {
			if (this.aClass126_Sub1Array1[local5] != null) {
				this.aClass126_Sub1Array1[local5].method11597();
			}
		}
		for (local5 = 0; local5 < this.aClass126_Sub1Array1.length; local5++) {
			if (this.aClass126_Sub1Array1[local5] != null) {
				this.aClass126_Sub1Array1[local5].method11600();
			}
		}
		if (this.aClass464_1 == null) {
			this.method29638();
		} else if (this.aClass470_3 != null && !this.aBoolean755) {
			if (this.aClass77_Sub1_Sub18_Sub1_1 == null) {
				this.aClass77_Sub1_Sub18_Sub1_1 = this.aClass470_3.method29599();
			} else if (!this.aClass77_Sub1_Sub18_Sub1_1.aBoolean540) {
				@Pc(80) byte[] local80 = this.aClass77_Sub1_Sub18_Sub1_1.method24033();
				try {
					this.aClass464_2 = new Class464(new Class77_Sub39(local80), this.aBigInteger6, this.aBigInteger5);
					for (@Pc(95) int local95 = 0; local95 < this.aClass126_Sub1Array1.length; local95++) {
						if (this.aClass126_Sub1Array1[local95] != null && this.aClass126_Sub1Array1[local95].method11619()) {
							@Pc(119) Class466 local119 = this.aClass464_2.aClass466Array1[local95];
							this.aClass126_Sub1Array1[local95].method11617(this.aClass126_Sub1Array1[local95].method11588(local119.anInt4980 * -1393657873, local119.aByteArray85, local119.anInt4981 * 1492181625, local119.anInt4979 * 13321921));
						}
					}
				} catch (@Pc(149) Exception local149) {
					for (@Pc(151) int local151 = 0; local151 < this.aClass126_Sub1Array1.length; local151++) {
						if (this.aClass126_Sub1Array1[local151] != null && this.aClass126_Sub1Array1[local151].method11619()) {
							this.aClass126_Sub1Array1[local151].method11617(false);
						}
					}
				}
				this.aClass77_Sub1_Sub18_Sub1_1 = null;
				this.aBoolean755 = true;
			}
		}
	}

	@OriginalMember(owner = "client!pr", name = "j", descriptor = "()V", line = 78)
	public void method29651() {
		if (this.aClass126_Sub1Array1 == null) {
			return;
		}
		@Pc(5) int local5;
		for (local5 = 0; local5 < this.aClass126_Sub1Array1.length; local5++) {
			if (this.aClass126_Sub1Array1[local5] != null) {
				this.aClass126_Sub1Array1[local5].method11597();
			}
		}
		for (local5 = 0; local5 < this.aClass126_Sub1Array1.length; local5++) {
			if (this.aClass126_Sub1Array1[local5] != null) {
				this.aClass126_Sub1Array1[local5].method11600();
			}
		}
		if (this.aClass464_1 == null) {
			this.method29638();
		} else if (this.aClass470_3 != null && !this.aBoolean755) {
			if (this.aClass77_Sub1_Sub18_Sub1_1 == null) {
				this.aClass77_Sub1_Sub18_Sub1_1 = this.aClass470_3.method29599();
			} else if (!this.aClass77_Sub1_Sub18_Sub1_1.aBoolean540) {
				@Pc(80) byte[] local80 = this.aClass77_Sub1_Sub18_Sub1_1.method24033();
				try {
					this.aClass464_2 = new Class464(new Class77_Sub39(local80), this.aBigInteger6, this.aBigInteger5);
					for (@Pc(95) int local95 = 0; local95 < this.aClass126_Sub1Array1.length; local95++) {
						if (this.aClass126_Sub1Array1[local95] != null && this.aClass126_Sub1Array1[local95].method11619()) {
							@Pc(119) Class466 local119 = this.aClass464_2.aClass466Array1[local95];
							this.aClass126_Sub1Array1[local95].method11617(this.aClass126_Sub1Array1[local95].method11588(local119.anInt4980 * -1393657873, local119.aByteArray85, local119.anInt4981 * 1492181625, local119.anInt4979 * 13321921));
						}
					}
				} catch (@Pc(149) Exception local149) {
					for (@Pc(151) int local151 = 0; local151 < this.aClass126_Sub1Array1.length; local151++) {
						if (this.aClass126_Sub1Array1[local151] != null && this.aClass126_Sub1Array1[local151].method11619()) {
							this.aClass126_Sub1Array1[local151].method11617(false);
						}
					}
				}
				this.aClass77_Sub1_Sub18_Sub1_1 = null;
				this.aBoolean755 = true;
			}
		}
	}

	@OriginalMember(owner = "client!pr", name = "i", descriptor = "()V", line = 78)
	public void method29652() {
		if (this.aClass126_Sub1Array1 == null) {
			return;
		}
		@Pc(5) int local5;
		for (local5 = 0; local5 < this.aClass126_Sub1Array1.length; local5++) {
			if (this.aClass126_Sub1Array1[local5] != null) {
				this.aClass126_Sub1Array1[local5].method11597();
			}
		}
		for (local5 = 0; local5 < this.aClass126_Sub1Array1.length; local5++) {
			if (this.aClass126_Sub1Array1[local5] != null) {
				this.aClass126_Sub1Array1[local5].method11600();
			}
		}
		if (this.aClass464_1 == null) {
			this.method29638();
		} else if (this.aClass470_3 != null && !this.aBoolean755) {
			if (this.aClass77_Sub1_Sub18_Sub1_1 == null) {
				this.aClass77_Sub1_Sub18_Sub1_1 = this.aClass470_3.method29599();
			} else if (!this.aClass77_Sub1_Sub18_Sub1_1.aBoolean540) {
				@Pc(80) byte[] local80 = this.aClass77_Sub1_Sub18_Sub1_1.method24033();
				try {
					this.aClass464_2 = new Class464(new Class77_Sub39(local80), this.aBigInteger6, this.aBigInteger5);
					for (@Pc(95) int local95 = 0; local95 < this.aClass126_Sub1Array1.length; local95++) {
						if (this.aClass126_Sub1Array1[local95] != null && this.aClass126_Sub1Array1[local95].method11619()) {
							@Pc(119) Class466 local119 = this.aClass464_2.aClass466Array1[local95];
							this.aClass126_Sub1Array1[local95].method11617(this.aClass126_Sub1Array1[local95].method11588(local119.anInt4980 * -1393657873, local119.aByteArray85, local119.anInt4981 * 1492181625, local119.anInt4979 * 13321921));
						}
					}
				} catch (@Pc(149) Exception local149) {
					for (@Pc(151) int local151 = 0; local151 < this.aClass126_Sub1Array1.length; local151++) {
						if (this.aClass126_Sub1Array1[local151] != null && this.aClass126_Sub1Array1[local151].method11619()) {
							this.aClass126_Sub1Array1[local151].method11617(false);
						}
					}
				}
				this.aClass77_Sub1_Sub18_Sub1_1 = null;
				this.aBoolean755 = true;
			}
		}
	}

	@OriginalMember(owner = "client!pr", name = "fk", descriptor = "(Lclient!abp;ZIZZI)Lclient!pw;", line = 1971)
	public static Class478 method29653(@OriginalArg(0) Class40 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		if (Class503.aClass126_Sub1Array2 == null) {
			Class503.aClass126_Sub1Array2 = new Class126_Sub1[Class258.method26229()];
			Class592.aMap21 = new HashMap();
		}
		@Pc(12) Class566 local12 = null;
		@Pc(16) int local16 = arg0.method677();
		if (client.aClass34_5 != null && !Class264.aBoolean660) {
			local12 = new Class566(local16, client.aClass34_5, Class99_Sub1.aClass34Array1[local16], local16 == Class40.aClass40_26.method677() ? 8000000 : 2500000);
		}
		Class503.aClass126_Sub1Array2[local16] = Class528.aClass473_1.method29641(local16, local12, Class221.aClass566_4, arg0.method681());
		if (arg3) {
			Class503.aClass126_Sub1Array2[local16].method11612();
		}
		@Pc(65) Class478 local65 = new Class478(Class503.aClass126_Sub1Array2[local16], arg1, arg2);
		Class592.aMap21.put(arg0, local65);
		return local65;
	}

	@OriginalMember(owner = "client!pr", name = "ih", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;I)V", line = 6115)
	static final void method29654(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		arg0.anInt3922 = arg2.anIntArray536[(arg2.anInt5784 -= 308999563) * 2088438307] * 755258967;
	}

	@OriginalMember(owner = "client!pr", name = "rv", descriptor = "(Lclient!yf;B)V", line = 7702)
	static final void method29655(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		Class326.method27534(local11, arg0);
	}

	@OriginalMember(owner = "client!pr", name = "ty", descriptor = "(Lclient!yf;I)V", line = 8044)
	static final void method29656(@OriginalArg(0) Class665 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt5781 -= 1460193483) * 1485266147];
		@Pc(15) int local15 = 0;
		if (Class547.method30973(local13)) {
			local15 = Class679.method36041(local13);
		}
		@Pc(29) Class77_Sub20 local29 = Class365.method28132(Class414.aClass414_107, client.aClass82_2.aClass16_1);
		local29.aClass77_Sub39_Sub1_2.method22417(local15);
		client.aClass82_2.method2004(local29);
	}
}

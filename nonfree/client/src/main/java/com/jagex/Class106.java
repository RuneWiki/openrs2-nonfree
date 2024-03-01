package com.jagex;

import java.awt.Canvas;
import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!c")
public class Class106 {

	@OriginalMember(owner = "client!c", name = "o", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas6;

	@OriginalMember(owner = "client!c", name = "p", descriptor = "I")
	public int anInt2990;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "I")
	int anInt2991;

	@OriginalMember(owner = "client!c", name = "p", descriptor = "(IIII)Z", line = 10)
	public boolean method21908(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = this.anInt2991 * 1671210205;
		if (this.anInt2990 * 1871843793 == arg0 && this.anInt2991 * 1671210205 == 0) {
			return false;
		}
		@Pc(60) boolean local60;
		@Pc(86) int local86;
		if (this.anInt2991 * 1671210205 == 0) {
			if (arg0 > this.anInt2990 * 1871843793 && arg0 <= this.anInt2990 * 1871843793 + arg1 || arg0 < this.anInt2990 * 1871843793 && arg0 >= this.anInt2990 * 1871843793 - arg1) {
				this.anInt2990 = arg0 * 105375537;
				return false;
			}
			local60 = true;
		} else {
			@Pc(93) int local93;
			if (this.anInt2991 * 1671210205 > 0 && arg0 > this.anInt2990 * 1871843793) {
				local86 = this.anInt2991 * 1671210205 * this.anInt2991 * 1671210205 / (arg1 * 2);
				local93 = local86 + this.anInt2990 * 1871843793;
				if (local93 < arg0 && local93 >= this.anInt2990 * 1871843793) {
					local60 = true;
				} else {
					local60 = false;
				}
			} else if (this.anInt2991 * 1671210205 < 0 && arg0 < this.anInt2990 * 1871843793) {
				local86 = this.anInt2991 * 1671210205 * this.anInt2991 * 1671210205 / (arg1 * 2);
				local93 = this.anInt2990 * 1871843793 - local86;
				if (local93 > arg0 && local93 <= this.anInt2990 * 1871843793) {
					local60 = true;
				} else {
					local60 = false;
				}
			} else {
				local60 = false;
			}
		}
		if (local60) {
			if (arg0 > this.anInt2990 * 1871843793) {
				this.anInt2991 += arg1 * -637971595;
				if (arg2 != 0 && this.anInt2991 * 1671210205 > arg2) {
					this.anInt2991 = arg2 * -637971595;
				}
			} else {
				this.anInt2991 -= arg1 * -637971595;
				if (arg2 != 0 && this.anInt2991 * 1671210205 < -arg2) {
					this.anInt2991 = -arg2 * -637971595;
				}
			}
			if (local4 != this.anInt2991 * 1671210205) {
				local86 = this.anInt2991 * 1671210205 * this.anInt2991 * 1671210205 / (arg1 * 2);
				if (arg0 > this.anInt2990 * 1871843793) {
					if (this.anInt2990 * 1871843793 + local86 > arg0) {
						this.anInt2991 = local4 * -637971595;
					}
				} else if (arg0 < this.anInt2990 * 1871843793 && this.anInt2990 * 1871843793 - local86 < arg0) {
					this.anInt2991 = local4 * -637971595;
				}
			}
		} else if (this.anInt2991 * 1671210205 > 0) {
			this.anInt2991 -= arg1 * -637971595;
			if (this.anInt2991 * 1671210205 < 0) {
				this.anInt2991 = 0;
			}
		} else {
			this.anInt2991 += arg1 * -637971595;
			if (this.anInt2991 * 1671210205 > 0) {
				this.anInt2991 = 0;
			}
		}
		this.anInt2990 += (local4 + this.anInt2991 * 1671210205 >> 1) * 105375537;
		return local60;
	}

	@OriginalMember(owner = "client!c", name = "h", descriptor = "(III)Z", line = 10)
	public boolean method21909(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = this.anInt2991 * 1671210205;
		if (this.anInt2990 * 1871843793 == arg0 && this.anInt2991 * 1671210205 == 0) {
			return false;
		}
		@Pc(60) boolean local60;
		@Pc(86) int local86;
		if (this.anInt2991 * 1671210205 == 0) {
			if (arg0 > this.anInt2990 * 1871843793 && arg0 <= this.anInt2990 * 1871843793 + arg1 || arg0 < this.anInt2990 * 1871843793 && arg0 >= this.anInt2990 * 1871843793 - arg1) {
				this.anInt2990 = arg0 * 105375537;
				return false;
			}
			local60 = true;
		} else {
			@Pc(93) int local93;
			if (this.anInt2991 * 1671210205 > 0 && arg0 > this.anInt2990 * 1871843793) {
				local86 = this.anInt2991 * 1671210205 * this.anInt2991 * 1671210205 / (arg1 * 2);
				local93 = local86 + this.anInt2990 * 1871843793;
				if (local93 < arg0 && local93 >= this.anInt2990 * 1871843793) {
					local60 = true;
				} else {
					local60 = false;
				}
			} else if (this.anInt2991 * 1671210205 < 0 && arg0 < this.anInt2990 * 1871843793) {
				local86 = this.anInt2991 * 1671210205 * this.anInt2991 * 1671210205 / (arg1 * 2);
				local93 = this.anInt2990 * 1871843793 - local86;
				if (local93 > arg0 && local93 <= this.anInt2990 * 1871843793) {
					local60 = true;
				} else {
					local60 = false;
				}
			} else {
				local60 = false;
			}
		}
		if (local60) {
			if (arg0 > this.anInt2990 * 1871843793) {
				this.anInt2991 += arg1 * -637971595;
				if (arg2 != 0 && this.anInt2991 * 1671210205 > arg2) {
					this.anInt2991 = arg2 * -637971595;
				}
			} else {
				this.anInt2991 -= arg1 * -637971595;
				if (arg2 != 0 && this.anInt2991 * 1671210205 < -arg2) {
					this.anInt2991 = -arg2 * -637971595;
				}
			}
			if (local4 != this.anInt2991 * 1671210205) {
				local86 = this.anInt2991 * 1671210205 * this.anInt2991 * 1671210205 / (arg1 * 2);
				if (arg0 > this.anInt2990 * 1871843793) {
					if (this.anInt2990 * 1871843793 + local86 > arg0) {
						this.anInt2991 = local4 * -637971595;
					}
				} else if (arg0 < this.anInt2990 * 1871843793 && this.anInt2990 * 1871843793 - local86 < arg0) {
					this.anInt2991 = local4 * -637971595;
				}
			}
		} else if (this.anInt2991 * 1671210205 > 0) {
			this.anInt2991 -= arg1 * -637971595;
			if (this.anInt2991 * 1671210205 < 0) {
				this.anInt2991 = 0;
			}
		} else {
			this.anInt2991 += arg1 * -637971595;
			if (this.anInt2991 * 1671210205 > 0) {
				this.anInt2991 = 0;
			}
		}
		this.anInt2990 += (local4 + this.anInt2991 * 1671210205 >> 1) * 105375537;
		return local60;
	}

	@OriginalMember(owner = "client!c", name = "g", descriptor = "(Ljava/io/File;I)[B", line = 31)
	public static byte[] method21919(@OriginalArg(0) File arg0) {
		return Class53_Sub2.method9975(arg0, (int) arg0.length());
	}

	@OriginalMember(owner = "client!c", name = "g", descriptor = "([BIIB)Ljava/lang/String;", line = 56)
	static String method21918(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) StringBuilder local3 = new StringBuilder();
		for (@Pc(5) int local5 = arg1; local5 < arg1 + arg2; local5 += 3) {
			@Pc(16) int local16 = arg0[local5] & 0xFF;
			local3.append(Class529.aCharArray4[local16 >>> 2]);
			if (local5 < arg2 - 1) {
				@Pc(37) int local37 = arg0[local5 + 1] & 0xFF;
				local3.append(Class529.aCharArray4[(local16 & 0x3) << 4 | local37 >>> 4]);
				if (local5 < arg2 - 2) {
					@Pc(64) int local64 = arg0[local5 + 2] & 0xFF;
					local3.append(Class529.aCharArray4[(local37 & 0xF) << 2 | local64 >>> 6]).append(Class529.aCharArray4[local64 & 0x3F]);
				} else {
					local3.append(Class529.aCharArray4[(local37 & 0xF) << 2]).append('=');
				}
			} else {
				local3.append(Class529.aCharArray4[(local16 & 0x3) << 4]).append('=').append('=');
			}
		}
		return local3.toString();
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(II)V", line = 67)
	public void method21907(@OriginalArg(0) int arg0) {
		this.anInt2990 = arg0 * 105375537;
		this.anInt2991 = 0;
	}

	@OriginalMember(owner = "client!c", name = "x", descriptor = "(I)V", line = 67)
	public void method21913(@OriginalArg(0) int arg0) {
		this.anInt2990 = arg0 * 105375537;
		this.anInt2991 = 0;
	}

	@OriginalMember(owner = "client!c", name = "g", descriptor = "(I)I", line = 72)
	public int method21910() {
		return this.anInt2990 * 1871843793 & 0x3FFF;
	}

	@OriginalMember(owner = "client!c", name = "u", descriptor = "()I", line = 72)
	public int method21912() {
		return this.anInt2990 * 1871843793 & 0x3FFF;
	}

	@OriginalMember(owner = "client!c", name = "s", descriptor = "()I", line = 72)
	public int method21914() {
		return this.anInt2990 * 1871843793 & 0x3FFF;
	}

	@OriginalMember(owner = "client!c", name = "y", descriptor = "()I", line = 72)
	public int method21915() {
		return this.anInt2990 * 1871843793 & 0x3FFF;
	}

	@OriginalMember(owner = "client!c", name = "l", descriptor = "(I)V", line = 76)
	public void method21911() {
		this.anInt2990 = (this.anInt2990 * 1871843793 & 0x3FFF) * 105375537;
	}

	@OriginalMember(owner = "client!c", name = "y", descriptor = "([I[Ljava/lang/Object;B)V", line = 173)
	public static void method21916(@OriginalArg(0) int[] arg0, @OriginalArg(1) Object[] arg1) {
		Class204.method24176(arg0, arg1, 0, arg0.length - 1);
	}

	@OriginalMember(owner = "client!c", name = "ahp", descriptor = "(Lclient!vs;I)V", line = 10450)
	static final void method21917(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
	}
}

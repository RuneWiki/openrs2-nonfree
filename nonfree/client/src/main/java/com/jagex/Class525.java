package com.jagex;

import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rz")
public class Class525 {

	@OriginalMember(owner = "client!rz", name = "qt", descriptor = "[Lclient!gm;")
	static Class277[] aClass277Array5;

	@OriginalMember(owner = "client!rz", name = "c", descriptor = "I")
	int anInt5162;

	@OriginalMember(owner = "client!rz", name = "l", descriptor = "I")
	int anInt5163;

	@OriginalMember(owner = "client!rz", name = "y", descriptor = "Ljava/io/OutputStream;")
	OutputStream anOutputStream1;

	@OriginalMember(owner = "client!rz", name = "p", descriptor = "[B")
	byte[] aByteArray90;

	@OriginalMember(owner = "client!rz", name = "v", descriptor = "I")
	int anInt5161 = 0;

	@OriginalMember(owner = "client!rz", name = "d", descriptor = "(I)V", line = 13)
	public void method30641(@OriginalArg(0) int arg0) {
		if (this.aByteArray90 == null || this.anInt5161 * -1133431023 != arg0) {
			this.aByteArray90 = new byte[arg0];
		}
		this.anInt5161 = arg0 * 727882225;
		this.anInt5162 = 0;
		this.anInt5163 = 0;
	}

	@OriginalMember(owner = "client!rz", name = "p", descriptor = "(II)V", line = 13)
	public void method30642(@OriginalArg(0) int arg0) {
		if (this.aByteArray90 == null || this.anInt5161 * -1133431023 != arg0) {
			this.aByteArray90 = new byte[arg0];
		}
		this.anInt5161 = arg0 * 727882225;
		this.anInt5162 = 0;
		this.anInt5163 = 0;
	}

	@OriginalMember(owner = "client!rz", name = "x", descriptor = "(I)V", line = 13)
	public void method30643(@OriginalArg(0) int arg0) {
		if (this.aByteArray90 == null || this.anInt5161 * -1133431023 != arg0) {
			this.aByteArray90 = new byte[arg0];
		}
		this.anInt5161 = arg0 * 727882225;
		this.anInt5162 = 0;
		this.anInt5163 = 0;
	}

	@OriginalMember(owner = "client!rz", name = "s", descriptor = "(I)V", line = 13)
	public void method30644(@OriginalArg(0) int arg0) {
		if (this.aByteArray90 == null || this.anInt5161 * -1133431023 != arg0) {
			this.aByteArray90 = new byte[arg0];
		}
		this.anInt5161 = arg0 * 727882225;
		this.anInt5162 = 0;
		this.anInt5163 = 0;
	}

	@OriginalMember(owner = "client!rz", name = "c", descriptor = "(Ljava/io/OutputStream;I)V", line = 20)
	public void method30645(@OriginalArg(0) OutputStream arg0) throws IOException {
		this.method30649();
		this.anOutputStream1 = arg0;
	}

	@OriginalMember(owner = "client!rz", name = "z", descriptor = "(Ljava/io/OutputStream;)V", line = 20)
	public void method30646(@OriginalArg(0) OutputStream arg0) throws IOException {
		this.method30649();
		this.anOutputStream1 = arg0;
	}

	@OriginalMember(owner = "client!rz", name = "g", descriptor = "(Ljava/io/OutputStream;)V", line = 20)
	public void method30647(@OriginalArg(0) OutputStream arg0) throws IOException {
		this.method30649();
		this.anOutputStream1 = arg0;
	}

	@OriginalMember(owner = "client!rz", name = "r", descriptor = "(Ljava/io/OutputStream;)V", line = 20)
	public void method30648(@OriginalArg(0) OutputStream arg0) throws IOException {
		this.method30649();
		this.anOutputStream1 = arg0;
	}

	@OriginalMember(owner = "client!rz", name = "v", descriptor = "(I)V", line = 25)
	public void method30649() throws IOException {
		this.method30655();
		this.anOutputStream1 = null;
	}

	@OriginalMember(owner = "client!rz", name = "j", descriptor = "()V", line = 25)
	public void method30650() throws IOException {
		this.method30655();
		this.anOutputStream1 = null;
	}

	@OriginalMember(owner = "client!rz", name = "i", descriptor = "()V", line = 25)
	public void method30651() throws IOException {
		this.method30655();
		this.anOutputStream1 = null;
	}

	@OriginalMember(owner = "client!rz", name = "l", descriptor = "(ZB)V", line = 30)
	public void method30652(@OriginalArg(0) boolean arg0) {
		if (!arg0) {
			this.anInt5163 = 0;
			this.anInt5162 = 0;
		}
	}

	@OriginalMember(owner = "client!rz", name = "u", descriptor = "(Z)V", line = 30)
	public void method30653(@OriginalArg(0) boolean arg0) {
		if (!arg0) {
			this.anInt5163 = 0;
			this.anInt5162 = 0;
		}
	}

	@OriginalMember(owner = "client!rz", name = "k", descriptor = "(Z)V", line = 30)
	public void method30654(@OriginalArg(0) boolean arg0) {
		if (!arg0) {
			this.anInt5163 = 0;
			this.anInt5162 = 0;
		}
	}

	@OriginalMember(owner = "client!rz", name = "y", descriptor = "(I)V", line = 37)
	public void method30655() throws IOException {
		@Pc(9) int local9 = this.anInt5162 * -1463735993 - this.anInt5163 * -719749665;
		if (local9 == 0) {
			return;
		}
		this.anOutputStream1.write(this.aByteArray90, this.anInt5163 * -719749665, local9);
		if (this.anInt5162 * -1463735993 >= this.anInt5161 * -1133431023) {
			this.anInt5162 = 0;
		}
		this.anInt5163 = this.anInt5162 * 1203433881;
	}

	@OriginalMember(owner = "client!rz", name = "e", descriptor = "()V", line = 37)
	public void method30656() throws IOException {
		@Pc(9) int local9 = this.anInt5162 * -1463735993 - this.anInt5163 * -719749665;
		if (local9 == 0) {
			return;
		}
		this.anOutputStream1.write(this.aByteArray90, this.anInt5163 * -719749665, local9);
		if (this.anInt5162 * -1463735993 >= this.anInt5161 * -1133431023) {
			this.anInt5162 = 0;
		}
		this.anInt5163 = this.anInt5162 * 1203433881;
	}

	@OriginalMember(owner = "client!rz", name = "f", descriptor = "()V", line = 37)
	public void method30657() throws IOException {
		@Pc(9) int local9 = this.anInt5162 * -1463735993 - this.anInt5163 * -719749665;
		if (local9 == 0) {
			return;
		}
		this.anOutputStream1.write(this.aByteArray90, this.anInt5163 * -719749665, local9);
		if (this.anInt5162 * -1463735993 >= this.anInt5161 * -1133431023) {
			this.anInt5162 = 0;
		}
		this.anInt5163 = this.anInt5162 * 1203433881;
	}

	@OriginalMember(owner = "client!rz", name = "o", descriptor = "()V", line = 37)
	public void method30658() throws IOException {
		@Pc(9) int local9 = this.anInt5162 * -1463735993 - this.anInt5163 * -719749665;
		if (local9 == 0) {
			return;
		}
		this.anOutputStream1.write(this.aByteArray90, this.anInt5163 * -719749665, local9);
		if (this.anInt5162 * -1463735993 >= this.anInt5161 * -1133431023) {
			this.anInt5162 = 0;
		}
		this.anInt5163 = this.anInt5162 * 1203433881;
	}

	@OriginalMember(owner = "client!rz", name = "w", descriptor = "(III)V", line = 45)
	public void method30659(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws IOException {
		@Pc(8) int local8 = this.anInt5162 * -1463735993 - arg0 - 1;
		if (local8 < 0) {
			local8 += this.anInt5161 * -1133431023;
		}
		while (arg1 != 0) {
			if (local8 >= this.anInt5161 * -1133431023) {
				local8 = 0;
			}
			this.aByteArray90[(this.anInt5162 += -1979469705) * -1463735993 - 1] = this.aByteArray90[local8++];
			if (this.anInt5162 * -1463735993 >= this.anInt5161 * -1133431023) {
				this.method30655();
			}
			arg1--;
		}
	}

	@OriginalMember(owner = "client!rz", name = "m", descriptor = "(II)V", line = 45)
	public void method30660(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws IOException {
		@Pc(8) int local8 = this.anInt5162 * -1463735993 - arg0 - 1;
		if (local8 < 0) {
			local8 += this.anInt5161 * -1133431023;
		}
		while (arg1 != 0) {
			if (local8 >= this.anInt5161 * -1133431023) {
				local8 = 0;
			}
			this.aByteArray90[(this.anInt5162 += -1979469705) * -1463735993 - 1] = this.aByteArray90[local8++];
			if (this.anInt5162 * -1463735993 >= this.anInt5161 * -1133431023) {
				this.method30655();
			}
			arg1--;
		}
	}

	@OriginalMember(owner = "client!rz", name = "a", descriptor = "(II)V", line = 45)
	public void method30661(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws IOException {
		@Pc(8) int local8 = this.anInt5162 * -1463735993 - arg0 - 1;
		if (local8 < 0) {
			local8 += this.anInt5161 * -1133431023;
		}
		while (arg1 != 0) {
			if (local8 >= this.anInt5161 * -1133431023) {
				local8 = 0;
			}
			this.aByteArray90[(this.anInt5162 += -1979469705) * -1463735993 - 1] = this.aByteArray90[local8++];
			if (this.anInt5162 * -1463735993 >= this.anInt5161 * -1133431023) {
				this.method30655();
			}
			arg1--;
		}
	}

	@OriginalMember(owner = "client!rz", name = "b", descriptor = "(II)V", line = 45)
	public void method30662(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws IOException {
		@Pc(8) int local8 = this.anInt5162 * -1463735993 - arg0 - 1;
		if (local8 < 0) {
			local8 += this.anInt5161 * -1133431023;
		}
		while (arg1 != 0) {
			if (local8 >= this.anInt5161 * -1133431023) {
				local8 = 0;
			}
			this.aByteArray90[(this.anInt5162 += -1979469705) * -1463735993 - 1] = this.aByteArray90[local8++];
			if (this.anInt5162 * -1463735993 >= this.anInt5161 * -1133431023) {
				this.method30655();
			}
			arg1--;
		}
	}

	@OriginalMember(owner = "client!rz", name = "n", descriptor = "(II)V", line = 45)
	public void method30663(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws IOException {
		@Pc(8) int local8 = this.anInt5162 * -1463735993 - arg0 - 1;
		if (local8 < 0) {
			local8 += this.anInt5161 * -1133431023;
		}
		while (arg1 != 0) {
			if (local8 >= this.anInt5161 * -1133431023) {
				local8 = 0;
			}
			this.aByteArray90[(this.anInt5162 += -1979469705) * -1463735993 - 1] = this.aByteArray90[local8++];
			if (this.anInt5162 * -1463735993 >= this.anInt5161 * -1133431023) {
				this.method30655();
			}
			arg1--;
		}
	}

	@OriginalMember(owner = "client!rz", name = "h", descriptor = "(II)V", line = 45)
	public void method30664(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws IOException {
		@Pc(8) int local8 = this.anInt5162 * -1463735993 - arg0 - 1;
		if (local8 < 0) {
			local8 += this.anInt5161 * -1133431023;
		}
		while (arg1 != 0) {
			if (local8 >= this.anInt5161 * -1133431023) {
				local8 = 0;
			}
			this.aByteArray90[(this.anInt5162 += -1979469705) * -1463735993 - 1] = this.aByteArray90[local8++];
			if (this.anInt5162 * -1463735993 >= this.anInt5161 * -1133431023) {
				this.method30655();
			}
			arg1--;
		}
	}

	@OriginalMember(owner = "client!rz", name = "l", descriptor = "(Ljava/lang/CharSequence;IZI)Z", line = 47)
	static boolean method30665(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (arg1 < 2 || arg1 > 36) {
			throw new IllegalArgumentException("" + arg1);
		}
		@Pc(19) boolean local19 = false;
		@Pc(21) boolean local21 = false;
		@Pc(23) int local23 = 0;
		@Pc(26) int local26 = arg0.length();
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(35) char local35 = arg0.charAt(local28);
			if (local28 == 0) {
				if (local35 == '-') {
					local19 = true;
					continue;
				}
				if (local35 == '+' && arg2) {
					continue;
				}
			}
			@Pc(57) int local57;
			if (local35 >= '0' && local35 <= '9') {
				local57 = local35 - '0';
			} else if (local35 >= 'A' && local35 <= 'Z') {
				local57 = local35 - '7';
			} else if (local35 >= 'a' && local35 <= 'z') {
				local57 = local35 - 'W';
			} else {
				return false;
			}
			if (local57 >= arg1) {
				return false;
			}
			if (local19) {
				local57 = -local57;
			}
			@Pc(92) int local92 = local23 * arg1 + local57;
			if (local92 / arg1 != local23) {
				return false;
			}
			local23 = local92;
			local21 = true;
		}
		return local21;
	}

	@OriginalMember(owner = "client!rz", name = "t", descriptor = "(BB)V", line = 55)
	public void method30666(@OriginalArg(0) byte arg0) throws IOException {
		this.aByteArray90[(this.anInt5162 += -1979469705) * -1463735993 - 1] = arg0;
		if (this.anInt5162 * -1463735993 >= this.anInt5161 * -1133431023) {
			this.method30655();
		}
	}

	@OriginalMember(owner = "client!rz", name = "aj", descriptor = "(B)V", line = 55)
	public void method30667(@OriginalArg(0) byte arg0) throws IOException {
		this.aByteArray90[(this.anInt5162 += -1979469705) * -1463735993 - 1] = arg0;
		if (this.anInt5162 * -1463735993 >= this.anInt5161 * -1133431023) {
			this.method30655();
		}
	}

	@OriginalMember(owner = "client!rz", name = "ai", descriptor = "(B)V", line = 55)
	public void method30668(@OriginalArg(0) byte arg0) throws IOException {
		this.aByteArray90[(this.anInt5162 += -1979469705) * -1463735993 - 1] = arg0;
		if (this.anInt5162 * -1463735993 >= this.anInt5161 * -1133431023) {
			this.method30655();
		}
	}

	@OriginalMember(owner = "client!rz", name = "ag", descriptor = "(B)V", line = 55)
	public void method30669(@OriginalArg(0) byte arg0) throws IOException {
		this.aByteArray90[(this.anInt5162 += -1979469705) * -1463735993 - 1] = arg0;
		if (this.anInt5162 * -1463735993 >= this.anInt5161 * -1133431023) {
			this.method30655();
		}
	}

	@OriginalMember(owner = "client!rz", name = "q", descriptor = "(IB)B", line = 60)
	public byte method30670(@OriginalArg(0) int arg0) {
		@Pc(8) int local8 = this.anInt5162 * -1463735993 - arg0 - 1;
		if (local8 < 0) {
			local8 += this.anInt5161 * -1133431023;
		}
		return this.aByteArray90[local8];
	}

	@OriginalMember(owner = "client!rz", name = "ao", descriptor = "(I)B", line = 60)
	public byte method30671(@OriginalArg(0) int arg0) {
		@Pc(8) int local8 = this.anInt5162 * -1463735993 - arg0 - 1;
		if (local8 < 0) {
			local8 += this.anInt5161 * -1133431023;
		}
		return this.aByteArray90[local8];
	}

	@OriginalMember(owner = "client!rz", name = "al", descriptor = "(I)B", line = 60)
	public byte method30672(@OriginalArg(0) int arg0) {
		@Pc(8) int local8 = this.anInt5162 * -1463735993 - arg0 - 1;
		if (local8 < 0) {
			local8 += this.anInt5161 * -1133431023;
		}
		return this.aByteArray90[local8];
	}

	@OriginalMember(owner = "client!rz", name = "ak", descriptor = "(I)B", line = 60)
	public byte method30673(@OriginalArg(0) int arg0) {
		@Pc(8) int local8 = this.anInt5162 * -1463735993 - arg0 - 1;
		if (local8 < 0) {
			local8 += this.anInt5161 * -1133431023;
		}
		return this.aByteArray90[local8];
	}
}

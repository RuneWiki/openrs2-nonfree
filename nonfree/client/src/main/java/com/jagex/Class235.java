package com.jagex;

import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ii")
public class Class235 {

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "I")
	static final int anInt3741 = 128;

	@OriginalMember(owner = "client!ii", name = "p", descriptor = "I")
	static final int anInt3742 = 7;

	@OriginalMember(owner = "client!ii", name = "n", descriptor = "[I")
	int[] anIntArray396;

	@OriginalMember(owner = "client!ii", name = "e", descriptor = "[B")
	byte[] aByteArray74;

	@OriginalMember(owner = "client!ii", name = "s", descriptor = "Z")
	boolean aBoolean681 = true;

	@OriginalMember(owner = "client!ii", name = "u", descriptor = "I")
	int anInt3745 = -1;

	@OriginalMember(owner = "client!ii", name = "g", descriptor = "Lclient!abv;")
	final Class21_Sub3 aClass21_Sub3_35;

	@OriginalMember(owner = "client!ii", name = "l", descriptor = "Lclient!iv;")
	final Class246 aClass246_2;

	@OriginalMember(owner = "client!ii", name = "h", descriptor = "I")
	final int anInt3743;

	@OriginalMember(owner = "client!ii", name = "x", descriptor = "I")
	final int anInt3747;

	@OriginalMember(owner = "client!ii", name = "j", descriptor = "I")
	int anInt3748;

	@OriginalMember(owner = "client!ii", name = "z", descriptor = "I")
	int anInt3744;

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "Lclient!jw;")
	Interface30 anInterface30_7;

	@OriginalMember(owner = "client!ii", name = "y", descriptor = "I")
	final int anInt3746;

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "Lclient!ic;")
	Interface20 anInterface20_25;

	@OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(Lclient!abv;Lclient!iv;Lclient!abs;IIIII)V", line = 25)
	Class235(@OriginalArg(0) Class21_Sub3 arg0, @OriginalArg(1) Class246 arg1, @OriginalArg(2) Class17_Sub3 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass21_Sub3_35 = arg0;
		this.aClass246_2 = arg1;
		this.anInt3743 = arg6;
		this.anInt3747 = arg7;
		@Pc(23) int local23 = 0x1 << arg5;
		@Pc(25) int local25 = 0;
		@Pc(29) int local29 = arg3 << arg5;
		@Pc(33) int local33 = arg4 << arg5;
		@Pc(49) int local49;
		@Pc(51) int local51;
		for (@Pc(35) int local35 = 0; local35 < local23; local35++) {
			local49 = (local33 + local35) * arg2.anInt339 * -1007974723 + local29;
			for (local51 = 0; local51 < local23; local51++) {
				@Pc(60) short[] local60 = arg2.aShortArrayArray2[local49++];
				if (local60 != null) {
					local25 += local60.length;
				}
			}
		}
		if (local25 > 0) {
			this.anInt3748 = Integer.MIN_VALUE;
			this.anInt3744 = Integer.MAX_VALUE;
			this.anInterface30_7 = this.aClass21_Sub3_35.method17648(false);
			this.anInterface30_7.method25720(local25);
			@Pc(93) ByteBuffer local93 = this.aClass21_Sub3_35.aByteBuffer4;
			local93.clear();
			for (local49 = 0; local49 < local23; local49++) {
				local51 = (local33 + local49) * arg2.anInt339 * -1007974723 + local29;
				for (@Pc(114) int local114 = 0; local114 < local23; local114++) {
					@Pc(123) short[] local123 = arg2.aShortArrayArray2[local51++];
					if (local123 != null) {
						for (@Pc(127) int local127 = 0; local127 < local123.length; local127++) {
							@Pc(137) int local137 = local123[local127] & 0xFFFF;
							if (local137 < this.anInt3744) {
								this.anInt3744 = local137;
							}
							if (local137 > this.anInt3748) {
								this.anInt3748 = local137;
							}
							local93.putShort((short) local137);
						}
					}
				}
			}
			this.anInterface30_7.method25705(0, local93.position(), this.aClass21_Sub3_35.aLong101);
			this.anInt3746 = local25 / 3;
		} else {
			this.anInt3746 = 0;
			this.anInterface20_25 = null;
		}
	}

	@OriginalMember(owner = "client!ii", name = "p", descriptor = "(Lclient!hn;)V", line = 72)
	void method24594(@OriginalArg(0) Class32 arg0) {
		this.method24593(arg0, this.anInterface30_7, 0, this.anInt3746);
	}

	@OriginalMember(owner = "client!ii", name = "l", descriptor = "(Lclient!hn;Lclient!jw;II)V", line = 76)
	void method24592(@OriginalArg(0) Class32 arg0, @OriginalArg(1) Interface30 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg3 <= 0) {
			return;
		}
		this.method24591();
		this.aClass21_Sub3_35.method17545(arg1);
		arg0.anInterface20_14 = this.anInterface20_25;
		arg0.anInt842 = this.anInt3744;
		arg0.anInt841 = this.anInt3748 - this.anInt3744 + 1;
		arg0.anInt843 = arg2;
		arg0.anInt844 = arg3;
		arg0.method7775(false);
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!hn;Lclient!jw;II)V", line = 76)
	void method24593(@OriginalArg(0) Class32 arg0, @OriginalArg(1) Interface30 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg3 <= 0) {
			return;
		}
		this.method24591();
		this.aClass21_Sub3_35.method17545(arg1);
		arg0.anInterface20_14 = this.anInterface20_25;
		arg0.anInt842 = this.anInt3744;
		arg0.anInt841 = this.anInt3748 - this.anInt3744 + 1;
		arg0.anInt843 = arg2;
		arg0.anInt844 = arg3;
		arg0.method7775(false);
	}

	@OriginalMember(owner = "client!ii", name = "x", descriptor = "(Lclient!hn;Lclient!jw;II)V", line = 76)
	void method24595(@OriginalArg(0) Class32 arg0, @OriginalArg(1) Interface30 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg3 <= 0) {
			return;
		}
		this.method24591();
		this.aClass21_Sub3_35.method17545(arg1);
		arg0.anInterface20_14 = this.anInterface20_25;
		arg0.anInt842 = this.anInt3744;
		arg0.anInt841 = this.anInt3748 - this.anInt3744 + 1;
		arg0.anInt843 = arg2;
		arg0.anInt844 = arg3;
		arg0.method7775(false);
	}

	@OriginalMember(owner = "client!ii", name = "h", descriptor = "(Lclient!hn;Lclient!jw;II)V", line = 76)
	void method24596(@OriginalArg(0) Class32 arg0, @OriginalArg(1) Interface30 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg3 <= 0) {
			return;
		}
		this.method24591();
		this.aClass21_Sub3_35.method17545(arg1);
		arg0.anInterface20_14 = this.anInterface20_25;
		arg0.anInt842 = this.anInt3744;
		arg0.anInt841 = this.anInt3748 - this.anInt3744 + 1;
		arg0.anInt843 = arg2;
		arg0.anInt844 = arg3;
		arg0.method7775(false);
	}

	@OriginalMember(owner = "client!ii", name = "g", descriptor = "()V", line = 89)
	void method24591() {
		if (!this.aBoolean681) {
			return;
		}
		this.aBoolean681 = false;
		@Pc(10) byte[] local10 = this.aClass246_2.aByteArray76;
		@Pc(12) int local12 = 0;
		@Pc(16) int local16 = this.aClass246_2.anInt3792;
		@Pc(26) int local26 = this.anInt3743 + this.anInt3747 * this.aClass246_2.anInt3792;
		@Pc(28) int local28;
		for (local28 = -128; local28 < 0; local28++) {
			local12 = (local12 << 8) - local12;
			for (@Pc(38) int local38 = -128; local38 < 0; local38++) {
				if (local10[local26++] != 0) {
					local12++;
				}
			}
			local26 += local16 - 128;
		}
		if (this.anInterface20_25 != null && this.anInt3745 == local12) {
			this.aBoolean681 = false;
			return;
		}
		this.anInt3745 = local12;
		local28 = 0;
		local26 = this.anInt3743 + this.anInt3747 * local16;
		@Pc(98) int local98;
		@Pc(102) int local102;
		@Pc(116) int local116;
		if (!this.aClass21_Sub3_35.method17768(Class121.aClass121_23, Class127.aClass127_23)) {
			if (this.anIntArray396 == null) {
				this.anIntArray396 = new int[16384];
			}
			@Pc(208) int[] local208 = this.anIntArray396;
			for (local98 = -128; local98 < 0; local98++) {
				for (local102 = -128; local102 < 0; local102++) {
					if (local10[local26] == 0) {
						local116 = 0;
						if (local10[local26 - 1] != 0) {
							local116++;
						}
						if (local10[local26 + 1] != 0) {
							local116++;
						}
						if (local10[local26 - local16] != 0) {
							local116++;
						}
						if (local10[local26 + local16] != 0) {
							local116++;
						}
						local208[local28++] = local116 * 17 << 24;
					} else {
						local208[local28++] = 1140850688;
					}
					local26++;
				}
				local26 += this.aClass246_2.anInt3792 - 128;
			}
			if (this.anInterface20_25 == null) {
				this.anInterface20_25 = this.aClass21_Sub3_35.method17501(128, 128, false, this.anIntArray396);
				this.anInterface20_25.method8951(false, false);
			} else {
				this.anInterface20_25.method8935(0, 0, 128, 128, this.anIntArray396, 0, 128);
			}
			return;
		}
		if (this.aByteArray74 == null) {
			this.aByteArray74 = new byte[16384];
		}
		@Pc(96) byte[] local96 = this.aByteArray74;
		for (local98 = -128; local98 < 0; local98++) {
			for (local102 = -128; local102 < 0; local102++) {
				if (local10[local26] == 0) {
					local116 = 0;
					if (local10[local26 - 1] != 0) {
						local116++;
					}
					if (local10[local26 + 1] != 0) {
						local116++;
					}
					if (local10[local26 - local16] != 0) {
						local116++;
					}
					if (local10[local26 + local16] != 0) {
						local116++;
					}
					local96[local28++] = (byte) (local116 * 17);
				} else {
					local96[local28++] = 68;
				}
				local26++;
			}
			local26 += this.aClass246_2.anInt3792 - 128;
		}
		if (this.anInterface20_25 == null) {
			this.anInterface20_25 = this.aClass21_Sub3_35.method17502(Class121.aClass121_23, 128, 128, false, this.aByteArray74);
			this.anInterface20_25.method8951(false, false);
		} else {
			this.anInterface20_25.method8936(0, 0, 128, 128, this.aByteArray74, Class121.aClass121_23, 0, 128);
		}
	}
}

package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aco")
public class Class63 implements Interface12 {

	@OriginalMember(owner = "client!aco", name = "v", descriptor = "I")
	public int anInt192;

	@OriginalMember(owner = "client!aco", name = "c", descriptor = "I")
	public int anInt193;

	@OriginalMember(owner = "client!aco", name = "y", descriptor = "[I")
	int[] anIntArray14;

	@OriginalMember(owner = "client!aco", name = "l", descriptor = "Z")
	public boolean aBoolean18 = false;

	@OriginalMember(owner = "client!aco", name = "p", descriptor = "Lclient!ace;")
	Class54 aClass54_1;

	@OriginalMember(owner = "client!aco", name = "<init>", descriptor = "(ILclient!ace;)V", line = 17)
	Class63(@OriginalArg(0) int arg0, @OriginalArg(1) Class54 arg1) {
		this.aClass54_1 = arg1;
	}

	@OriginalMember(owner = "client!aco", name = "l", descriptor = "(Lclient!akv;)V", line = 23)
	@Override
	public void method36030(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method913(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!aco", name = "p", descriptor = "(Lclient!akv;B)V", line = 23)
	@Override
	public void method36031(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method913(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!aco", name = "v", descriptor = "(Lclient!akv;)V", line = 23)
	@Override
	public void method36032(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method913(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!aco", name = "y", descriptor = "(Lclient!akv;)V", line = 23)
	@Override
	public void method36033(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method913(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!aco", name = "q", descriptor = "(Lclient!akv;IB)V", line = 30)
	void method913(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt193 = arg0.method22549() * -1417249877;
		} else if (arg1 == 2) {
			this.anInt192 = arg0.method22492() * -1516930387;
		} else if (arg1 == 3) {
			this.aBoolean18 = true;
		} else if (arg1 == 4) {
			this.anInt193 = 1417249877;
		} else if (arg1 == 5) {
		}
	}

	@OriginalMember(owner = "client!aco", name = "j", descriptor = "(Lclient!akv;I)V", line = 30)
	void method914(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt193 = arg0.method22549() * -1417249877;
		} else if (arg1 == 2) {
			this.anInt192 = arg0.method22492() * -1516930387;
		} else if (arg1 == 3) {
			this.aBoolean18 = true;
		} else if (arg1 == 4) {
			this.anInt193 = 1417249877;
		} else if (arg1 == 5) {
		}
	}

	@OriginalMember(owner = "client!aco", name = "g", descriptor = "(Lclient!akv;I)V", line = 30)
	void method915(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt193 = arg0.method22549() * -1417249877;
		} else if (arg1 == 2) {
			this.anInt192 = arg0.method22492() * -1516930387;
		} else if (arg1 == 3) {
			this.aBoolean18 = true;
		} else if (arg1 == 4) {
			this.anInt193 = 1417249877;
		} else if (arg1 == 5) {
		}
	}

	@OriginalMember(owner = "client!aco", name = "z", descriptor = "(Lclient!akv;I)V", line = 30)
	void method916(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt193 = arg0.method22549() * -1417249877;
		} else if (arg1 == 2) {
			this.anInt192 = arg0.method22492() * -1516930387;
		} else if (arg1 == 3) {
			this.aBoolean18 = true;
		} else if (arg1 == 4) {
			this.anInt193 = 1417249877;
		} else if (arg1 == 5) {
		}
	}

	@OriginalMember(owner = "client!aco", name = "x", descriptor = "(Lclient!dx;IZS)Lclient!cy;", line = 39)
	public Class83 method917(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(22) long local22 = (long) (this.anInt193 * 138454787 | arg1 << 16 | (arg2 ? 262144 : 0) | arg0.anInt2780 * 2098753835 << 19);
		@Pc(29) Class83 local29 = (Class83) this.aClass54_1.aClass232_59.method25835(local22);
		if (local29 == null) {
			this.method921(arg0, arg1, arg2, local22);
			return (Class83) this.aClass54_1.aClass232_59.method25835(local22);
		} else {
			return local29;
		}
	}

	@OriginalMember(owner = "client!aco", name = "i", descriptor = "(Lclient!dx;IZ)Lclient!cy;", line = 39)
	public Class83 method918(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(22) long local22 = (long) (this.anInt193 * 138454787 | arg1 << 16 | (arg2 ? 262144 : 0) | arg0.anInt2780 * 2098753835 << 19);
		@Pc(29) Class83 local29 = (Class83) this.aClass54_1.aClass232_59.method25835(local22);
		if (local29 == null) {
			this.method921(arg0, arg1, arg2, local22);
			return (Class83) this.aClass54_1.aClass232_59.method25835(local22);
		} else {
			return local29;
		}
	}

	@OriginalMember(owner = "client!aco", name = "d", descriptor = "(Lclient!dx;IZI)[I", line = 47)
	public int[] method919(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.anIntArray14 == null) {
			@Pc(28) long local28 = (long) (this.anInt193 * 138454787 | arg1 << 16 | (arg2 ? 262144 : 0) | arg0.anInt2780 * 2098753835 << 19);
			this.method921(arg0, arg1, arg2, local28);
			return this.anIntArray14;
		} else {
			return this.anIntArray14;
		}
	}

	@OriginalMember(owner = "client!aco", name = "k", descriptor = "(Lclient!dx;IZ)[I", line = 47)
	public int[] method920(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.anIntArray14 == null) {
			@Pc(28) long local28 = (long) (this.anInt193 * 138454787 | arg1 << 16 | (arg2 ? 262144 : 0) | arg0.anInt2780 * 2098753835 << 19);
			this.method921(arg0, arg1, arg2, local28);
			return this.anIntArray14;
		} else {
			return this.anIntArray14;
		}
	}

	@OriginalMember(owner = "client!aco", name = "s", descriptor = "(Lclient!dx;IZJ)V", line = 54)
	void method921(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) long arg3) {
		if (!this.aClass54_1.aClass478_73.method29730(this.anInt193 * 138454787)) {
			return;
		}
		@Pc(20) Class89 local20 = Class210.method25593(this.aClass54_1.aClass478_73, this.anInt193 * 138454787, 0);
		if (local20 != null) {
			local20.method6688();
			if (arg2) {
				local20.method6699();
			}
			@Pc(30) int local30;
			for (local30 = 0; local30 < arg1; local30++) {
				local20.method6691();
			}
			this.anIntArray14 = local20.method6686(false);
			if (this.anInt192 * 2126510373 != 0) {
				local30 = this.anInt192 * 2126510373 >> 16 & 0xFF;
				@Pc(65) int local65 = this.anInt192 * 2126510373 >> 8 & 0xFF;
				@Pc(72) int local72 = this.anInt192 * 2126510373 & 0xFF;
				for (@Pc(74) int local74 = 0; local74 < this.anIntArray14.length; local74++) {
					@Pc(88) int local88 = this.anIntArray14[local74] >> 24 & 0xFF;
					@Pc(92) int local92 = 256 - local88;
					if (local88 != 0) {
						@Pc(107) int local107 = local30 * -16777216 * (this.anIntArray14[local74] & 0xFF0000);
						@Pc(118) int local118 = local65 * (this.anIntArray14[local74] & 0xFF00) * 16711680;
						@Pc(129) int local129 = (this.anIntArray14[local74] & 0xFF) * 65280 * local72;
						@Pc(137) int local137 = (local107 | local118 | local129) >>> 8;
						if (local88 == 255) {
							this.anIntArray14[local74] = local137;
						} else {
							@Pc(151) int local151 = this.anIntArray14[local74];
							this.anIntArray14[local74] = local88 << 24 | (local88 * (local151 & 0xFF00) + local92 * (local137 & 0xFF00) & 0xFF0000) + ((local151 & 0xFF00FF) * local88 + local92 * (local137 & 0xFF00FF) & 0xFF00FF00) >> 8;
						}
					}
				}
			}
		}
		@Pc(195) Class83 local195 = arg0.method20076(local20, true);
		if (local195 != null) {
			this.aClass54_1.aClass232_59.method25844(local195, arg3);
		}
	}

	@OriginalMember(owner = "client!aco", name = "u", descriptor = "(Lclient!dx;IZJ)V", line = 54)
	void method922(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) long arg3) {
		if (!this.aClass54_1.aClass478_73.method29730(this.anInt193 * 138454787)) {
			return;
		}
		@Pc(20) Class89 local20 = Class210.method25593(this.aClass54_1.aClass478_73, this.anInt193 * 138454787, 0);
		if (local20 != null) {
			local20.method6688();
			if (arg2) {
				local20.method6699();
			}
			@Pc(30) int local30;
			for (local30 = 0; local30 < arg1; local30++) {
				local20.method6691();
			}
			this.anIntArray14 = local20.method6686(false);
			if (this.anInt192 * 2126510373 != 0) {
				local30 = this.anInt192 * 2126510373 >> 16 & 0xFF;
				@Pc(65) int local65 = this.anInt192 * 2126510373 >> 8 & 0xFF;
				@Pc(72) int local72 = this.anInt192 * 2126510373 & 0xFF;
				for (@Pc(74) int local74 = 0; local74 < this.anIntArray14.length; local74++) {
					@Pc(88) int local88 = this.anIntArray14[local74] >> 24 & 0xFF;
					@Pc(92) int local92 = 256 - local88;
					if (local88 != 0) {
						@Pc(107) int local107 = local30 * -16777216 * (this.anIntArray14[local74] & 0xFF0000);
						@Pc(118) int local118 = local65 * (this.anIntArray14[local74] & 0xFF00) * 16711680;
						@Pc(129) int local129 = (this.anIntArray14[local74] & 0xFF) * 65280 * local72;
						@Pc(137) int local137 = (local107 | local118 | local129) >>> 8;
						if (local88 == 255) {
							this.anIntArray14[local74] = local137;
						} else {
							@Pc(151) int local151 = this.anIntArray14[local74];
							this.anIntArray14[local74] = local88 << 24 | (local88 * (local151 & 0xFF00) + local92 * (local137 & 0xFF00) & 0xFF0000) + ((local151 & 0xFF00FF) * local88 + local92 * (local137 & 0xFF00FF) & 0xFF00FF00) >> 8;
						}
					}
				}
			}
		}
		@Pc(195) Class83 local195 = arg0.method20076(local20, true);
		if (local195 != null) {
			this.aClass54_1.aClass232_59.method25844(local195, arg3);
		}
	}

	@OriginalMember(owner = "client!aco", name = "l", descriptor = "(JIS)Ljava/lang/String;", line = 76)
	static String method923(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		Class694.method36377(arg0);
		@Pc(5) int local5 = Class61.aCalendar2.get(5);
		@Pc(11) int local11 = Class61.aCalendar2.get(2) + 1;
		@Pc(15) int local15 = Class61.aCalendar2.get(1);
		return Integer.toString(local5 / 10) + local5 % 10 + "/" + local11 / 10 + local11 % 10 + "/" + local15 % 100 / 10 + local15 % 10;
	}

	@OriginalMember(owner = "client!aco", name = "r", descriptor = "(I)Z", line = 88)
	public boolean method924() {
		return this.aClass54_1.aClass478_73.method29730(this.anInt193 * 138454787);
	}

	@OriginalMember(owner = "client!aco", name = "c", descriptor = "(I)V", line = 91)
	@Override
	public void method36034() {
	}

	@OriginalMember(owner = "client!aco", name = "t", descriptor = "()V", line = 91)
	@Override
	public void method36036() {
	}

	@OriginalMember(owner = "client!aco", name = "w", descriptor = "()V", line = 91)
	@Override
	public void method36035() {
	}
}

package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jv")
public class Class351 implements Interface12 {

	@OriginalMember(owner = "client!jv", name = "d", descriptor = "[I")
	public static final int[] anIntArray446 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!jv", name = "s", descriptor = "[I")
	public static final int[] anIntArray445 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!jv", name = "c", descriptor = "[I")
	int[] anIntArray444;

	@OriginalMember(owner = "client!jv", name = "v", descriptor = "[S")
	short[] aShortArray123;

	@OriginalMember(owner = "client!jv", name = "l", descriptor = "[S")
	short[] aShortArray124;

	@OriginalMember(owner = "client!jv", name = "y", descriptor = "[S")
	short[] aShortArray125;

	@OriginalMember(owner = "client!jv", name = "t", descriptor = "[B")
	byte[] aByteArray79;

	@OriginalMember(owner = "client!jv", name = "w", descriptor = "[S")
	short[] aShortArray126;

	@OriginalMember(owner = "client!jv", name = "q", descriptor = "[B")
	byte[] aByteArray80;

	@OriginalMember(owner = "client!jv", name = "x", descriptor = "[I")
	int[] anIntArray443 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!jv", name = "p", descriptor = "Lclient!pw;")
	final Class478 aClass478_107;

	@OriginalMember(owner = "client!jv", name = "<init>", descriptor = "(ILclient!pw;)V", line = 23)
	Class351(@OriginalArg(0) int arg0, @OriginalArg(1) Class478 arg1) {
		this.aClass478_107 = arg1;
	}

	@OriginalMember(owner = "client!jv", name = "p", descriptor = "(Lclient!akv;B)V", line = 29)
	@Override
	public void method36031(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method27891(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!jv", name = "l", descriptor = "(Lclient!akv;)V", line = 29)
	@Override
	public void method36030(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method27891(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!jv", name = "y", descriptor = "(Lclient!akv;)V", line = 29)
	@Override
	public void method36033(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method27891(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!jv", name = "v", descriptor = "(Lclient!akv;)V", line = 29)
	@Override
	public void method36032(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method27891(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!jv", name = "z", descriptor = "(Lclient!akv;I)V", line = 36)
	void method27890(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			arg0.method22478();
			return;
		}
		@Pc(14) int local14;
		@Pc(20) int local20;
		if (arg1 == 2) {
			local14 = arg0.method22478();
			this.anIntArray444 = new int[local14];
			for (local20 = 0; local20 < local14; local20++) {
				this.anIntArray444[local20] = arg0.method22549();
			}
		} else if (arg1 != 3) {
			if (arg1 == 40) {
				local14 = arg0.method22478();
				this.aShortArray123 = new short[local14];
				this.aShortArray124 = new short[local14];
				for (local20 = 0; local20 < local14; local20++) {
					this.aShortArray123[local20] = (short) arg0.method22483();
					this.aShortArray124[local20] = (short) arg0.method22483();
				}
			} else if (arg1 == 41) {
				local14 = arg0.method22478();
				this.aShortArray125 = new short[local14];
				this.aShortArray126 = new short[local14];
				for (local20 = 0; local20 < local14; local20++) {
					this.aShortArray125[local20] = (short) arg0.method22483();
					this.aShortArray126[local20] = (short) arg0.method22483();
				}
			} else {
				@Pc(126) int local126;
				@Pc(142) int local142;
				@Pc(140) byte local140;
				if (arg1 == 44) {
					local14 = arg0.method22483();
					local20 = 0;
					for (local126 = local14; local126 > 0; local126 >>= 0x1) {
						local20++;
					}
					this.aByteArray79 = new byte[local20];
					local140 = 0;
					for (local142 = 0; local142 < local20; local142++) {
						if ((local14 & 0x1 << local142) > 0) {
							this.aByteArray79[local142] = local140++;
						} else {
							this.aByteArray79[local142] = -1;
						}
					}
				} else if (arg1 == 45) {
					local14 = arg0.method22483();
					local20 = 0;
					for (local126 = local14; local126 > 0; local126 >>= 0x1) {
						local20++;
					}
					this.aByteArray80 = new byte[local20];
					local140 = 0;
					for (local142 = 0; local142 < local20; local142++) {
						if ((local14 & 0x1 << local142) > 0) {
							this.aByteArray80[local142] = local140++;
						} else {
							this.aByteArray80[local142] = -1;
						}
					}
				} else if (arg1 >= 60 && arg1 < 70) {
					this.anIntArray443[arg1 - 60] = arg0.method22549();
				}
			}
		}
	}

	@OriginalMember(owner = "client!jv", name = "q", descriptor = "(Lclient!akv;IB)V", line = 36)
	void method27891(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			arg0.method22478();
			return;
		}
		@Pc(14) int local14;
		@Pc(20) int local20;
		if (arg1 == 2) {
			local14 = arg0.method22478();
			this.anIntArray444 = new int[local14];
			for (local20 = 0; local20 < local14; local20++) {
				this.anIntArray444[local20] = arg0.method22549();
			}
		} else if (arg1 != 3) {
			if (arg1 == 40) {
				local14 = arg0.method22478();
				this.aShortArray123 = new short[local14];
				this.aShortArray124 = new short[local14];
				for (local20 = 0; local20 < local14; local20++) {
					this.aShortArray123[local20] = (short) arg0.method22483();
					this.aShortArray124[local20] = (short) arg0.method22483();
				}
			} else if (arg1 == 41) {
				local14 = arg0.method22478();
				this.aShortArray125 = new short[local14];
				this.aShortArray126 = new short[local14];
				for (local20 = 0; local20 < local14; local20++) {
					this.aShortArray125[local20] = (short) arg0.method22483();
					this.aShortArray126[local20] = (short) arg0.method22483();
				}
			} else {
				@Pc(126) int local126;
				@Pc(142) int local142;
				@Pc(140) byte local140;
				if (arg1 == 44) {
					local14 = arg0.method22483();
					local20 = 0;
					for (local126 = local14; local126 > 0; local126 >>= 0x1) {
						local20++;
					}
					this.aByteArray79 = new byte[local20];
					local140 = 0;
					for (local142 = 0; local142 < local20; local142++) {
						if ((local14 & 0x1 << local142) > 0) {
							this.aByteArray79[local142] = local140++;
						} else {
							this.aByteArray79[local142] = -1;
						}
					}
				} else if (arg1 == 45) {
					local14 = arg0.method22483();
					local20 = 0;
					for (local126 = local14; local126 > 0; local126 >>= 0x1) {
						local20++;
					}
					this.aByteArray80 = new byte[local20];
					local140 = 0;
					for (local142 = 0; local142 < local20; local142++) {
						if ((local14 & 0x1 << local142) > 0) {
							this.aByteArray80[local142] = local140++;
						} else {
							this.aByteArray80[local142] = -1;
						}
					}
				} else if (arg1 >= 60 && arg1 < 70) {
					this.anIntArray443[arg1 - 60] = arg0.method22549();
				}
			}
		}
	}

	@OriginalMember(owner = "client!jv", name = "g", descriptor = "(Lclient!akv;I)V", line = 36)
	void method27892(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			arg0.method22478();
			return;
		}
		@Pc(14) int local14;
		@Pc(20) int local20;
		if (arg1 == 2) {
			local14 = arg0.method22478();
			this.anIntArray444 = new int[local14];
			for (local20 = 0; local20 < local14; local20++) {
				this.anIntArray444[local20] = arg0.method22549();
			}
		} else if (arg1 != 3) {
			if (arg1 == 40) {
				local14 = arg0.method22478();
				this.aShortArray123 = new short[local14];
				this.aShortArray124 = new short[local14];
				for (local20 = 0; local20 < local14; local20++) {
					this.aShortArray123[local20] = (short) arg0.method22483();
					this.aShortArray124[local20] = (short) arg0.method22483();
				}
			} else if (arg1 == 41) {
				local14 = arg0.method22478();
				this.aShortArray125 = new short[local14];
				this.aShortArray126 = new short[local14];
				for (local20 = 0; local20 < local14; local20++) {
					this.aShortArray125[local20] = (short) arg0.method22483();
					this.aShortArray126[local20] = (short) arg0.method22483();
				}
			} else {
				@Pc(126) int local126;
				@Pc(142) int local142;
				@Pc(140) byte local140;
				if (arg1 == 44) {
					local14 = arg0.method22483();
					local20 = 0;
					for (local126 = local14; local126 > 0; local126 >>= 0x1) {
						local20++;
					}
					this.aByteArray79 = new byte[local20];
					local140 = 0;
					for (local142 = 0; local142 < local20; local142++) {
						if ((local14 & 0x1 << local142) > 0) {
							this.aByteArray79[local142] = local140++;
						} else {
							this.aByteArray79[local142] = -1;
						}
					}
				} else if (arg1 == 45) {
					local14 = arg0.method22483();
					local20 = 0;
					for (local126 = local14; local126 > 0; local126 >>= 0x1) {
						local20++;
					}
					this.aByteArray80 = new byte[local20];
					local140 = 0;
					for (local142 = 0; local142 < local20; local142++) {
						if ((local14 & 0x1 << local142) > 0) {
							this.aByteArray80[local142] = local140++;
						} else {
							this.aByteArray80[local142] = -1;
						}
					}
				} else if (arg1 >= 60 && arg1 < 70) {
					this.anIntArray443[arg1 - 60] = arg0.method22549();
				}
			}
		}
	}

	@OriginalMember(owner = "client!jv", name = "v", descriptor = "(CS)Z", line = 48)
	static final boolean method27893(@OriginalArg(0) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}

	@OriginalMember(owner = "client!jv", name = "w", descriptor = "()V", line = 99)
	@Override
	public void method36035() {
	}

	@OriginalMember(owner = "client!jv", name = "c", descriptor = "(I)V", line = 99)
	@Override
	public void method36034() {
	}

	@OriginalMember(owner = "client!jv", name = "t", descriptor = "()V", line = 99)
	@Override
	public void method36036() {
	}

	@OriginalMember(owner = "client!jv", name = "x", descriptor = "(I)Z", line = 102)
	public boolean method27894() {
		if (this.anIntArray444 == null) {
			return true;
		}
		@Pc(7) boolean local7 = true;
		@Pc(11) Class478 local11 = this.aClass478_107;
		synchronized (this.aClass478_107) {
			for (@Pc(14) int local14 = 0; local14 < this.anIntArray444.length; local14++) {
				if (!this.aClass478_107.method29727(this.anIntArray444[local14], 0)) {
					local7 = false;
				}
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!jv", name = "i", descriptor = "()Z", line = 102)
	public boolean method27895() {
		if (this.anIntArray444 == null) {
			return true;
		}
		@Pc(7) boolean local7 = true;
		@Pc(11) Class478 local11 = this.aClass478_107;
		synchronized (this.aClass478_107) {
			for (@Pc(14) int local14 = 0; local14 < this.anIntArray444.length; local14++) {
				if (!this.aClass478_107.method29727(this.anIntArray444[local14], 0)) {
					local7 = false;
				}
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!jv", name = "j", descriptor = "()Z", line = 102)
	public boolean method27896() {
		if (this.anIntArray444 == null) {
			return true;
		}
		@Pc(7) boolean local7 = true;
		@Pc(11) Class478 local11 = this.aClass478_107;
		synchronized (this.aClass478_107) {
			for (@Pc(14) int local14 = 0; local14 < this.anIntArray444.length; local14++) {
				if (!this.aClass478_107.method29727(this.anIntArray444[local14], 0)) {
					local7 = false;
				}
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!jv", name = "k", descriptor = "()Z", line = 102)
	public boolean method27897() {
		if (this.anIntArray444 == null) {
			return true;
		}
		@Pc(7) boolean local7 = true;
		@Pc(11) Class478 local11 = this.aClass478_107;
		synchronized (this.aClass478_107) {
			for (@Pc(14) int local14 = 0; local14 < this.anIntArray444.length; local14++) {
				if (!this.aClass478_107.method29727(this.anIntArray444[local14], 0)) {
					local7 = false;
				}
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!jv", name = "d", descriptor = "(I)Lclient!dz;", line = 111)
	public Class216 method27898() {
		if (this.anIntArray444 == null) {
			return null;
		}
		@Pc(9) Class216[] local9 = new Class216[this.anIntArray444.length];
		@Pc(13) Class478 local13 = this.aClass478_107;
		@Pc(16) int local16;
		synchronized (this.aClass478_107) {
			local16 = 0;
			while (true) {
				if (local16 >= this.anIntArray444.length) {
					break;
				}
				local9[local16] = Class216.method25655(this.aClass478_107, this.anIntArray444[local16], 0);
				local16++;
			}
		}
		for (@Pc(44) int local44 = 0; local44 < this.anIntArray444.length; local44++) {
			if (local9[local44].anInt3733 < 13) {
				local9[local44].method25695(2);
			}
		}
		@Pc(70) Class216 local70;
		if (local9.length == 1) {
			local70 = local9[0];
		} else {
			local70 = new Class216(local9, local9.length);
		}
		if (local70 == null) {
			return null;
		}
		if (this.aShortArray123 != null) {
			for (local16 = 0; local16 < this.aShortArray123.length; local16++) {
				local70.method25682(this.aShortArray123[local16], this.aShortArray124[local16]);
			}
		}
		if (this.aShortArray125 != null) {
			for (local16 = 0; local16 < this.aShortArray125.length; local16++) {
				local70.method25688(this.aShortArray125[local16], this.aShortArray126[local16]);
			}
		}
		return local70;
	}

	@OriginalMember(owner = "client!jv", name = "f", descriptor = "()Lclient!dz;", line = 111)
	public Class216 method27899() {
		if (this.anIntArray444 == null) {
			return null;
		}
		@Pc(9) Class216[] local9 = new Class216[this.anIntArray444.length];
		@Pc(13) Class478 local13 = this.aClass478_107;
		@Pc(16) int local16;
		synchronized (this.aClass478_107) {
			local16 = 0;
			while (true) {
				if (local16 >= this.anIntArray444.length) {
					break;
				}
				local9[local16] = Class216.method25655(this.aClass478_107, this.anIntArray444[local16], 0);
				local16++;
			}
		}
		for (@Pc(44) int local44 = 0; local44 < this.anIntArray444.length; local44++) {
			if (local9[local44].anInt3733 < 13) {
				local9[local44].method25695(2);
			}
		}
		@Pc(70) Class216 local70;
		if (local9.length == 1) {
			local70 = local9[0];
		} else {
			local70 = new Class216(local9, local9.length);
		}
		if (local70 == null) {
			return null;
		}
		if (this.aShortArray123 != null) {
			for (local16 = 0; local16 < this.aShortArray123.length; local16++) {
				local70.method25682(this.aShortArray123[local16], this.aShortArray124[local16]);
			}
		}
		if (this.aShortArray125 != null) {
			for (local16 = 0; local16 < this.aShortArray125.length; local16++) {
				local70.method25688(this.aShortArray125[local16], this.aShortArray126[local16]);
			}
		}
		return local70;
	}

	@OriginalMember(owner = "client!jv", name = "u", descriptor = "()Lclient!dz;", line = 111)
	public Class216 method27900() {
		if (this.anIntArray444 == null) {
			return null;
		}
		@Pc(9) Class216[] local9 = new Class216[this.anIntArray444.length];
		@Pc(13) Class478 local13 = this.aClass478_107;
		@Pc(16) int local16;
		synchronized (this.aClass478_107) {
			local16 = 0;
			while (true) {
				if (local16 >= this.anIntArray444.length) {
					break;
				}
				local9[local16] = Class216.method25655(this.aClass478_107, this.anIntArray444[local16], 0);
				local16++;
			}
		}
		for (@Pc(44) int local44 = 0; local44 < this.anIntArray444.length; local44++) {
			if (local9[local44].anInt3733 < 13) {
				local9[local44].method25695(2);
			}
		}
		@Pc(70) Class216 local70;
		if (local9.length == 1) {
			local70 = local9[0];
		} else {
			local70 = new Class216(local9, local9.length);
		}
		if (local70 == null) {
			return null;
		}
		if (this.aShortArray123 != null) {
			for (local16 = 0; local16 < this.aShortArray123.length; local16++) {
				local70.method25682(this.aShortArray123[local16], this.aShortArray124[local16]);
			}
		}
		if (this.aShortArray125 != null) {
			for (local16 = 0; local16 < this.aShortArray125.length; local16++) {
				local70.method25688(this.aShortArray125[local16], this.aShortArray126[local16]);
			}
		}
		return local70;
	}

	@OriginalMember(owner = "client!jv", name = "e", descriptor = "()Lclient!dz;", line = 111)
	public Class216 method27901() {
		if (this.anIntArray444 == null) {
			return null;
		}
		@Pc(9) Class216[] local9 = new Class216[this.anIntArray444.length];
		@Pc(13) Class478 local13 = this.aClass478_107;
		@Pc(16) int local16;
		synchronized (this.aClass478_107) {
			local16 = 0;
			while (true) {
				if (local16 >= this.anIntArray444.length) {
					break;
				}
				local9[local16] = Class216.method25655(this.aClass478_107, this.anIntArray444[local16], 0);
				local16++;
			}
		}
		for (@Pc(44) int local44 = 0; local44 < this.anIntArray444.length; local44++) {
			if (local9[local44].anInt3733 < 13) {
				local9[local44].method25695(2);
			}
		}
		@Pc(70) Class216 local70;
		if (local9.length == 1) {
			local70 = local9[0];
		} else {
			local70 = new Class216(local9, local9.length);
		}
		if (local70 == null) {
			return null;
		}
		if (this.aShortArray123 != null) {
			for (local16 = 0; local16 < this.aShortArray123.length; local16++) {
				local70.method25682(this.aShortArray123[local16], this.aShortArray124[local16]);
			}
		}
		if (this.aShortArray125 != null) {
			for (local16 = 0; local16 < this.aShortArray125.length; local16++) {
				local70.method25688(this.aShortArray125[local16], this.aShortArray126[local16]);
			}
		}
		return local70;
	}

	@OriginalMember(owner = "client!jv", name = "o", descriptor = "()Z", line = 137)
	public boolean method27902() {
		@Pc(1) boolean local1 = true;
		@Pc(5) Class478 local5 = this.aClass478_107;
		synchronized (this.aClass478_107) {
			for (@Pc(8) int local8 = 0; local8 < 5; local8++) {
				if (this.anIntArray443[local8] != -1 && !this.aClass478_107.method29727(this.anIntArray443[local8], 0)) {
					local1 = false;
				}
			}
			return local1;
		}
	}

	@OriginalMember(owner = "client!jv", name = "s", descriptor = "(B)Z", line = 137)
	public boolean method27903() {
		@Pc(1) boolean local1 = true;
		@Pc(5) Class478 local5 = this.aClass478_107;
		synchronized (this.aClass478_107) {
			for (@Pc(8) int local8 = 0; local8 < 5; local8++) {
				if (this.anIntArray443[local8] != -1 && !this.aClass478_107.method29727(this.anIntArray443[local8], 0)) {
					local1 = false;
				}
			}
			return local1;
		}
	}

	@OriginalMember(owner = "client!jv", name = "r", descriptor = "(B)Lclient!dz;", line = 147)
	public Class216 method27904() {
		@Pc(2) Class216[] local2 = new Class216[5];
		@Pc(4) int local4 = 0;
		@Pc(8) Class478 local8 = this.aClass478_107;
		@Pc(11) int local11;
		synchronized (this.aClass478_107) {
			local11 = 0;
			while (true) {
				if (local11 >= 5) {
					break;
				}
				if (this.anIntArray443[local11] != -1) {
					local2[local4++] = Class216.method25655(this.aClass478_107, this.anIntArray443[local11], 0);
				}
				local11++;
			}
		}
		for (@Pc(44) int local44 = 0; local44 < 5; local44++) {
			if (local2[local44] != null && local2[local44].anInt3733 < 13) {
				local2[local44].method25695(2);
			}
		}
		@Pc(71) Class216 local71 = new Class216(local2, local4);
		if (this.aShortArray123 != null) {
			for (local11 = 0; local11 < this.aShortArray123.length; local11++) {
				local71.method25682(this.aShortArray123[local11], this.aShortArray124[local11]);
			}
		}
		if (this.aShortArray125 != null) {
			for (local11 = 0; local11 < this.aShortArray125.length; local11++) {
				local71.method25688(this.aShortArray125[local11], this.aShortArray126[local11]);
			}
		}
		return local71;
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "()Lclient!dz;", line = 147)
	public Class216 method27905() {
		@Pc(2) Class216[] local2 = new Class216[5];
		@Pc(4) int local4 = 0;
		@Pc(8) Class478 local8 = this.aClass478_107;
		@Pc(11) int local11;
		synchronized (this.aClass478_107) {
			local11 = 0;
			while (true) {
				if (local11 >= 5) {
					break;
				}
				if (this.anIntArray443[local11] != -1) {
					local2[local4++] = Class216.method25655(this.aClass478_107, this.anIntArray443[local11], 0);
				}
				local11++;
			}
		}
		for (@Pc(44) int local44 = 0; local44 < 5; local44++) {
			if (local2[local44] != null && local2[local44].anInt3733 < 13) {
				local2[local44].method25695(2);
			}
		}
		@Pc(71) Class216 local71 = new Class216(local2, local4);
		if (this.aShortArray123 != null) {
			for (local11 = 0; local11 < this.aShortArray123.length; local11++) {
				local71.method25682(this.aShortArray123[local11], this.aShortArray124[local11]);
			}
		}
		if (this.aShortArray125 != null) {
			for (local11 = 0; local11 < this.aShortArray125.length; local11++) {
				local71.method25688(this.aShortArray125[local11], this.aShortArray126[local11]);
			}
		}
		return local71;
	}

	@OriginalMember(owner = "client!jv", name = "b", descriptor = "()Lclient!dz;", line = 147)
	public Class216 method27906() {
		@Pc(2) Class216[] local2 = new Class216[5];
		@Pc(4) int local4 = 0;
		@Pc(8) Class478 local8 = this.aClass478_107;
		@Pc(11) int local11;
		synchronized (this.aClass478_107) {
			local11 = 0;
			while (true) {
				if (local11 >= 5) {
					break;
				}
				if (this.anIntArray443[local11] != -1) {
					local2[local4++] = Class216.method25655(this.aClass478_107, this.anIntArray443[local11], 0);
				}
				local11++;
			}
		}
		for (@Pc(44) int local44 = 0; local44 < 5; local44++) {
			if (local2[local44] != null && local2[local44].anInt3733 < 13) {
				local2[local44].method25695(2);
			}
		}
		@Pc(71) Class216 local71 = new Class216(local2, local4);
		if (this.aShortArray123 != null) {
			for (local11 = 0; local11 < this.aShortArray123.length; local11++) {
				local71.method25682(this.aShortArray123[local11], this.aShortArray124[local11]);
			}
		}
		if (this.aShortArray125 != null) {
			for (local11 = 0; local11 < this.aShortArray125.length; local11++) {
				local71.method25688(this.aShortArray125[local11], this.aShortArray126[local11]);
			}
		}
		return local71;
	}

	@OriginalMember(owner = "client!jv", name = "n", descriptor = "()Lclient!dz;", line = 147)
	public Class216 method27907() {
		@Pc(2) Class216[] local2 = new Class216[5];
		@Pc(4) int local4 = 0;
		@Pc(8) Class478 local8 = this.aClass478_107;
		@Pc(11) int local11;
		synchronized (this.aClass478_107) {
			local11 = 0;
			while (true) {
				if (local11 >= 5) {
					break;
				}
				if (this.anIntArray443[local11] != -1) {
					local2[local4++] = Class216.method25655(this.aClass478_107, this.anIntArray443[local11], 0);
				}
				local11++;
			}
		}
		for (@Pc(44) int local44 = 0; local44 < 5; local44++) {
			if (local2[local44] != null && local2[local44].anInt3733 < 13) {
				local2[local44].method25695(2);
			}
		}
		@Pc(71) Class216 local71 = new Class216(local2, local4);
		if (this.aShortArray123 != null) {
			for (local11 = 0; local11 < this.aShortArray123.length; local11++) {
				local71.method25682(this.aShortArray123[local11], this.aShortArray124[local11]);
			}
		}
		if (this.aShortArray125 != null) {
			for (local11 = 0; local11 < this.aShortArray125.length; local11++) {
				local71.method25688(this.aShortArray125[local11], this.aShortArray126[local11]);
			}
		}
		return local71;
	}

	@OriginalMember(owner = "client!jv", name = "h", descriptor = "(Lclient!yf;I)V", line = 4416)
	static final void method27908(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5786 += arg0.anIntArray535[arg0.anInt5786 * 662605117] * -793595371;
	}

	@OriginalMember(owner = "client!jv", name = "sh", descriptor = "(Lclient!yf;I)V", line = 7814)
	static final void method27909(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local16.anInt3875 * -1279656873;
	}

	@OriginalMember(owner = "client!jv", name = "awl", descriptor = "(Lclient!yf;I)V", line = 13313)
	static final void method27910(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class35_Sub6.aClass77_Sub35_45.aClass143_Sub21_1.method16264(local12);
	}
}

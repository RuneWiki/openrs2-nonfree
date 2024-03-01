package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!amj")
public class Class3_Sub1_Sub6 extends Class3_Sub1 {

	@OriginalMember(owner = "client!amj", name = "j", descriptor = "I")
	public int anInt2656;

	@OriginalMember(owner = "client!amj", name = "s", descriptor = "Lclient!zz;")
	public Class634 aClass634_1;

	@OriginalMember(owner = "client!amj", name = "y", descriptor = "[Lclient!pc;")
	public Class385[] aClass385Array1;

	@OriginalMember(owner = "client!amj", name = "b", descriptor = "[I")
	public int[] anIntArray260;

	@OriginalMember(owner = "client!amj", name = "c", descriptor = "[Ljava/lang/Object;")
	public Object[] anObjectArray4;

	@OriginalMember(owner = "client!amj", name = "z", descriptor = "I")
	public int anInt2657;

	@OriginalMember(owner = "client!amj", name = "u", descriptor = "Ljava/lang/String;")
	public String aString107;

	@OriginalMember(owner = "client!amj", name = "e", descriptor = "I")
	public int anInt2658;

	@OriginalMember(owner = "client!amj", name = "r", descriptor = "I")
	public int anInt2659;

	@OriginalMember(owner = "client!amj", name = "d", descriptor = "I")
	public int anInt2660;

	@OriginalMember(owner = "client!amj", name = "q", descriptor = "[Lclient!xn;")
	public Class581[] aClass581Array1;

	@OriginalMember(owner = "client!amj", name = "n", descriptor = "I")
	public int anInt2661;

	@OriginalMember(owner = "client!amj", name = "m", descriptor = "Lclient!cz;")
	final Interface9 anInterface9_3;

	@OriginalMember(owner = "client!amj", name = "<init>", descriptor = "(Lclient!ahb;Lclient!cz;)V", line = 30)
	public Class3_Sub1_Sub6(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) Interface9 arg1) {
		this.anInterface9_3 = arg1;
		@Pc(9) int local9 = this.method18962(arg0);
		@Pc(11) int local11 = 0;
		@Pc(14) Class385[] local14 = Class314.method25829();
		while (arg0.anInt2803 * 62066237 < local9) {
			@Pc(26) Class385 local26 = this.method18955(arg0, local14);
			this.method18957(arg0, local11, local26);
			local11++;
		}
	}

	@OriginalMember(owner = "client!amj", name = "p", descriptor = "(Lclient!ahb;[Lclient!pc;S)Lclient!pc;", line = 43)
	Class385 method18955(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) Class385[] arg1) {
		@Pc(3) int local3 = arg0.method20271();
		if (local3 < 0 || local3 >= arg1.length) {
			throw new RuntimeException("");
		}
		return arg1[local3];
	}

	@OriginalMember(owner = "client!amj", name = "l", descriptor = "(Lclient!ahb;[Lclient!pc;)Lclient!pc;", line = 43)
	Class385 method18958(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) Class385[] arg1) {
		@Pc(3) int local3 = arg0.method20271();
		if (local3 < 0 || local3 >= arg1.length) {
			throw new RuntimeException("");
		}
		return arg1[local3];
	}

	@OriginalMember(owner = "client!amj", name = "h", descriptor = "(Lclient!ahb;)I", line = 52)
	int method18959(@OriginalArg(0) Class3_Sub41 arg0) {
		arg0.anInt2803 = (arg0.aByteArray51.length - 2) * -918980331;
		@Pc(12) int local12 = arg0.method20271();
		@Pc(22) int local22 = arg0.aByteArray51.length - 2 - local12 - 16;
		arg0.anInt2803 = local22 * -918980331;
		@Pc(31) int local31 = arg0.method20275();
		this.anInt2657 = arg0.method20271() * 1868230683;
		this.anInt2656 = arg0.method20271() * -1890675467;
		this.anInt2661 = arg0.method20271() * -1420093547;
		this.anInt2658 = arg0.method20271() * 442912165;
		this.anInt2659 = arg0.method20271() * 1019782927;
		this.anInt2660 = arg0.method20271() * -791813653;
		@Pc(77) int local77 = arg0.method20269();
		if (local77 > 0) {
			this.aClass581Array1 = new Class581[local77];
			for (@Pc(85) int local85 = 0; local85 < local77; local85++) {
				@Pc(92) int local92 = arg0.method20271();
				@Pc(99) Class581 local99 = new Class581(Class302.method25670(local92));
				this.aClass581Array1[local85] = local99;
				while (local92-- > 0) {
					@Pc(111) int local111 = arg0.method20275();
					@Pc(115) int local115 = arg0.method20275();
					local99.method33241(new Class3_Sub21(local115), (long) local111);
				}
			}
		}
		arg0.anInt2803 = 0;
		this.aString107 = arg0.method20282();
		this.aClass385Array1 = new Class385[local31];
		return local22;
	}

	@OriginalMember(owner = "client!amj", name = "x", descriptor = "(Lclient!ahb;)I", line = 52)
	int method18960(@OriginalArg(0) Class3_Sub41 arg0) {
		arg0.anInt2803 = (arg0.aByteArray51.length - 2) * -918980331;
		@Pc(12) int local12 = arg0.method20271();
		@Pc(22) int local22 = arg0.aByteArray51.length - 2 - local12 - 16;
		arg0.anInt2803 = local22 * -918980331;
		@Pc(31) int local31 = arg0.method20275();
		this.anInt2657 = arg0.method20271() * 1868230683;
		this.anInt2656 = arg0.method20271() * -1890675467;
		this.anInt2661 = arg0.method20271() * -1420093547;
		this.anInt2658 = arg0.method20271() * 442912165;
		this.anInt2659 = arg0.method20271() * 1019782927;
		this.anInt2660 = arg0.method20271() * -791813653;
		@Pc(77) int local77 = arg0.method20269();
		if (local77 > 0) {
			this.aClass581Array1 = new Class581[local77];
			for (@Pc(85) int local85 = 0; local85 < local77; local85++) {
				@Pc(92) int local92 = arg0.method20271();
				@Pc(99) Class581 local99 = new Class581(Class302.method25670(local92));
				this.aClass581Array1[local85] = local99;
				while (local92-- > 0) {
					@Pc(111) int local111 = arg0.method20275();
					@Pc(115) int local115 = arg0.method20275();
					local99.method33241(new Class3_Sub21(local115), (long) local111);
				}
			}
		}
		arg0.anInt2803 = 0;
		this.aString107 = arg0.method20282();
		this.aClass385Array1 = new Class385[local31];
		return local22;
	}

	@OriginalMember(owner = "client!amj", name = "s", descriptor = "(Lclient!ahb;)I", line = 52)
	int method18961(@OriginalArg(0) Class3_Sub41 arg0) {
		arg0.anInt2803 = (arg0.aByteArray51.length - 2) * -918980331;
		@Pc(12) int local12 = arg0.method20271();
		@Pc(22) int local22 = arg0.aByteArray51.length - 2 - local12 - 16;
		arg0.anInt2803 = local22 * -918980331;
		@Pc(31) int local31 = arg0.method20275();
		this.anInt2657 = arg0.method20271() * 1868230683;
		this.anInt2656 = arg0.method20271() * -1890675467;
		this.anInt2661 = arg0.method20271() * -1420093547;
		this.anInt2658 = arg0.method20271() * 442912165;
		this.anInt2659 = arg0.method20271() * 1019782927;
		this.anInt2660 = arg0.method20271() * -791813653;
		@Pc(77) int local77 = arg0.method20269();
		if (local77 > 0) {
			this.aClass581Array1 = new Class581[local77];
			for (@Pc(85) int local85 = 0; local85 < local77; local85++) {
				@Pc(92) int local92 = arg0.method20271();
				@Pc(99) Class581 local99 = new Class581(Class302.method25670(local92));
				this.aClass581Array1[local85] = local99;
				while (local92-- > 0) {
					@Pc(111) int local111 = arg0.method20275();
					@Pc(115) int local115 = arg0.method20275();
					local99.method33241(new Class3_Sub21(local115), (long) local111);
				}
			}
		}
		arg0.anInt2803 = 0;
		this.aString107 = arg0.method20282();
		this.aClass385Array1 = new Class385[local31];
		return local22;
	}

	@OriginalMember(owner = "client!amj", name = "a", descriptor = "(Lclient!ahb;I)I", line = 52)
	int method18962(@OriginalArg(0) Class3_Sub41 arg0) {
		arg0.anInt2803 = (arg0.aByteArray51.length - 2) * -918980331;
		@Pc(12) int local12 = arg0.method20271();
		@Pc(22) int local22 = arg0.aByteArray51.length - 2 - local12 - 16;
		arg0.anInt2803 = local22 * -918980331;
		@Pc(31) int local31 = arg0.method20275();
		this.anInt2657 = arg0.method20271() * 1868230683;
		this.anInt2656 = arg0.method20271() * -1890675467;
		this.anInt2661 = arg0.method20271() * -1420093547;
		this.anInt2658 = arg0.method20271() * 442912165;
		this.anInt2659 = arg0.method20271() * 1019782927;
		this.anInt2660 = arg0.method20271() * -791813653;
		@Pc(77) int local77 = arg0.method20269();
		if (local77 > 0) {
			this.aClass581Array1 = new Class581[local77];
			for (@Pc(85) int local85 = 0; local85 < local77; local85++) {
				@Pc(92) int local92 = arg0.method20271();
				@Pc(99) Class581 local99 = new Class581(Class302.method25670(local92));
				this.aClass581Array1[local85] = local99;
				while (local92-- > 0) {
					@Pc(111) int local111 = arg0.method20275();
					@Pc(115) int local115 = arg0.method20275();
					local99.method33241(new Class3_Sub21(local115), (long) local111);
				}
			}
		}
		arg0.anInt2803 = 0;
		this.aString107 = arg0.method20282();
		this.aClass385Array1 = new Class385[local31];
		return local22;
	}

	@OriginalMember(owner = "client!amj", name = "b", descriptor = "(Lclient!ahb;ILclient!pc;)V", line = 84)
	void method18956(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class385 arg2) {
		@Pc(3) int local3 = this.aClass385Array1.length;
		if (arg2 == Class385.aClass385_581 || arg2 == Class385.aClass385_3) {
			@Pc(18) Class43 local18 = (Class43) Class356.method26649(Class43.method9496(), arg0.method20269());
			@Pc(22) int local22 = arg0.method20271();
			if (this.anObjectArray4 == null) {
				this.anObjectArray4 = new Object[local3];
			}
			this.anObjectArray4[arg1] = this.anInterface9_3.method24295(local18, local22);
			if (this.anIntArray260 == null) {
				this.anIntArray260 = new int[local3];
			}
			this.anIntArray260[arg1] = arg0.method20269();
		} else if (arg2 == Class385.aClass385_6) {
			@Pc(67) Class342 local67 = (Class342) Class356.method26649(Class342.method26467(), arg0.method20269());
			switch(local67.anInt4604 * -324049181) {
				case 0:
					if (this.anObjectArray4 == null) {
						this.anObjectArray4 = new Object[local3];
					}
					this.anObjectArray4[arg1] = arg0.method20283().intern();
					break;
				case 1:
				default:
					throw new RuntimeException();
				case 2:
					if (this.anObjectArray4 == null) {
						this.anObjectArray4 = new Object[local3];
					}
					arg2 = Class385.aClass385_26;
					this.anObjectArray4[arg1] = arg0.method20371();
					break;
				case 3:
					if (this.anIntArray260 == null) {
						this.anIntArray260 = new int[local3];
					}
					arg2 = Class385.aClass385_13;
					this.anIntArray260[arg1] = arg0.method20275();
			}
		} else if (arg2 == Class385.aClass385_1069 || Class385.aClass385_5 == arg2) {
			@Pc(138) int local138 = arg0.method20271();
			if (this.anObjectArray4 == null) {
				this.anObjectArray4 = new Object[local3];
			}
			this.anObjectArray4[arg1] = this.anInterface9_3.method24296(local138);
			if (this.anIntArray260 == null) {
				this.anIntArray260 = new int[local3];
			}
			this.anIntArray260[arg1] = arg0.method20269();
		} else {
			if (this.anIntArray260 == null) {
				this.anIntArray260 = new int[local3];
			}
			if (arg2 != null && arg2.aBoolean744) {
				this.anIntArray260[arg1] = arg0.method20275();
			} else {
				this.anIntArray260[arg1] = arg0.method20269();
			}
		}
		this.aClass385Array1[arg1] = arg2;
	}

	@OriginalMember(owner = "client!amj", name = "g", descriptor = "(Lclient!ahb;ILclient!pc;B)V", line = 84)
	void method18957(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class385 arg2) {
		@Pc(3) int local3 = this.aClass385Array1.length;
		if (arg2 == Class385.aClass385_581 || arg2 == Class385.aClass385_3) {
			@Pc(18) Class43 local18 = (Class43) Class356.method26649(Class43.method9496(), arg0.method20269());
			@Pc(22) int local22 = arg0.method20271();
			if (this.anObjectArray4 == null) {
				this.anObjectArray4 = new Object[local3];
			}
			this.anObjectArray4[arg1] = this.anInterface9_3.method24295(local18, local22);
			if (this.anIntArray260 == null) {
				this.anIntArray260 = new int[local3];
			}
			this.anIntArray260[arg1] = arg0.method20269();
		} else if (arg2 == Class385.aClass385_6) {
			@Pc(67) Class342 local67 = (Class342) Class356.method26649(Class342.method26467(), arg0.method20269());
			switch(local67.anInt4604 * -324049181) {
				case 0:
					if (this.anObjectArray4 == null) {
						this.anObjectArray4 = new Object[local3];
					}
					this.anObjectArray4[arg1] = arg0.method20283().intern();
					break;
				case 1:
				default:
					throw new RuntimeException();
				case 2:
					if (this.anObjectArray4 == null) {
						this.anObjectArray4 = new Object[local3];
					}
					arg2 = Class385.aClass385_26;
					this.anObjectArray4[arg1] = arg0.method20371();
					break;
				case 3:
					if (this.anIntArray260 == null) {
						this.anIntArray260 = new int[local3];
					}
					arg2 = Class385.aClass385_13;
					this.anIntArray260[arg1] = arg0.method20275();
			}
		} else if (arg2 == Class385.aClass385_1069 || Class385.aClass385_5 == arg2) {
			@Pc(138) int local138 = arg0.method20271();
			if (this.anObjectArray4 == null) {
				this.anObjectArray4 = new Object[local3];
			}
			this.anObjectArray4[arg1] = this.anInterface9_3.method24296(local138);
			if (this.anIntArray260 == null) {
				this.anIntArray260 = new int[local3];
			}
			this.anIntArray260[arg1] = arg0.method20269();
		} else {
			if (this.anIntArray260 == null) {
				this.anIntArray260 = new int[local3];
			}
			if (arg2 != null && arg2.aBoolean744) {
				this.anIntArray260[arg1] = arg0.method20275();
			} else {
				this.anIntArray260[arg1] = arg0.method20269();
			}
		}
		this.aClass385Array1[arg1] = arg2;
	}

	@OriginalMember(owner = "client!amj", name = "y", descriptor = "(Lclient!ahb;ILclient!pc;)V", line = 84)
	void method18963(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class385 arg2) {
		@Pc(3) int local3 = this.aClass385Array1.length;
		if (arg2 == Class385.aClass385_581 || arg2 == Class385.aClass385_3) {
			@Pc(18) Class43 local18 = (Class43) Class356.method26649(Class43.method9496(), arg0.method20269());
			@Pc(22) int local22 = arg0.method20271();
			if (this.anObjectArray4 == null) {
				this.anObjectArray4 = new Object[local3];
			}
			this.anObjectArray4[arg1] = this.anInterface9_3.method24295(local18, local22);
			if (this.anIntArray260 == null) {
				this.anIntArray260 = new int[local3];
			}
			this.anIntArray260[arg1] = arg0.method20269();
		} else if (arg2 == Class385.aClass385_6) {
			@Pc(67) Class342 local67 = (Class342) Class356.method26649(Class342.method26467(), arg0.method20269());
			switch(local67.anInt4604 * -324049181) {
				case 0:
					if (this.anObjectArray4 == null) {
						this.anObjectArray4 = new Object[local3];
					}
					this.anObjectArray4[arg1] = arg0.method20283().intern();
					break;
				case 1:
				default:
					throw new RuntimeException();
				case 2:
					if (this.anObjectArray4 == null) {
						this.anObjectArray4 = new Object[local3];
					}
					arg2 = Class385.aClass385_26;
					this.anObjectArray4[arg1] = arg0.method20371();
					break;
				case 3:
					if (this.anIntArray260 == null) {
						this.anIntArray260 = new int[local3];
					}
					arg2 = Class385.aClass385_13;
					this.anIntArray260[arg1] = arg0.method20275();
			}
		} else if (arg2 == Class385.aClass385_1069 || Class385.aClass385_5 == arg2) {
			@Pc(138) int local138 = arg0.method20271();
			if (this.anObjectArray4 == null) {
				this.anObjectArray4 = new Object[local3];
			}
			this.anObjectArray4[arg1] = this.anInterface9_3.method24296(local138);
			if (this.anIntArray260 == null) {
				this.anIntArray260 = new int[local3];
			}
			this.anIntArray260[arg1] = arg0.method20269();
		} else {
			if (this.anIntArray260 == null) {
				this.anIntArray260 = new int[local3];
			}
			if (arg2 != null && arg2.aBoolean744) {
				this.anIntArray260[arg1] = arg0.method20275();
			} else {
				this.anIntArray260[arg1] = arg0.method20269();
			}
		}
		this.aClass385Array1[arg1] = arg2;
	}

	@OriginalMember(owner = "client!amj", name = "u", descriptor = "(Lclient!ahb;ILclient!pc;)V", line = 84)
	void method18964(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class385 arg2) {
		@Pc(3) int local3 = this.aClass385Array1.length;
		if (arg2 == Class385.aClass385_581 || arg2 == Class385.aClass385_3) {
			@Pc(18) Class43 local18 = (Class43) Class356.method26649(Class43.method9496(), arg0.method20269());
			@Pc(22) int local22 = arg0.method20271();
			if (this.anObjectArray4 == null) {
				this.anObjectArray4 = new Object[local3];
			}
			this.anObjectArray4[arg1] = this.anInterface9_3.method24295(local18, local22);
			if (this.anIntArray260 == null) {
				this.anIntArray260 = new int[local3];
			}
			this.anIntArray260[arg1] = arg0.method20269();
		} else if (arg2 == Class385.aClass385_6) {
			@Pc(67) Class342 local67 = (Class342) Class356.method26649(Class342.method26467(), arg0.method20269());
			switch(local67.anInt4604 * -324049181) {
				case 0:
					if (this.anObjectArray4 == null) {
						this.anObjectArray4 = new Object[local3];
					}
					this.anObjectArray4[arg1] = arg0.method20283().intern();
					break;
				case 1:
				default:
					throw new RuntimeException();
				case 2:
					if (this.anObjectArray4 == null) {
						this.anObjectArray4 = new Object[local3];
					}
					arg2 = Class385.aClass385_26;
					this.anObjectArray4[arg1] = arg0.method20371();
					break;
				case 3:
					if (this.anIntArray260 == null) {
						this.anIntArray260 = new int[local3];
					}
					arg2 = Class385.aClass385_13;
					this.anIntArray260[arg1] = arg0.method20275();
			}
		} else if (arg2 == Class385.aClass385_1069 || Class385.aClass385_5 == arg2) {
			@Pc(138) int local138 = arg0.method20271();
			if (this.anObjectArray4 == null) {
				this.anObjectArray4 = new Object[local3];
			}
			this.anObjectArray4[arg1] = this.anInterface9_3.method24296(local138);
			if (this.anIntArray260 == null) {
				this.anIntArray260 = new int[local3];
			}
			this.anIntArray260[arg1] = arg0.method20269();
		} else {
			if (this.anIntArray260 == null) {
				this.anIntArray260 = new int[local3];
			}
			if (arg2 != null && arg2.aBoolean744) {
				this.anIntArray260[arg1] = arg0.method20275();
			} else {
				this.anIntArray260[arg1] = arg0.method20269();
			}
		}
		this.aClass385Array1[arg1] = arg2;
	}
}

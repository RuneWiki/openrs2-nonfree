package com.jagex;

import java.util.Iterator;
import java.util.LinkedList;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wj")
public class Class620 implements Iterable {

	@OriginalMember(owner = "client!wj", name = "n", descriptor = "I")
	static int anInt5628;

	@OriginalMember(owner = "client!wj", name = "p", descriptor = "[Lclient!wt;")
	Class630[] aClass630Array1;

	@OriginalMember(owner = "client!wj", name = "c", descriptor = "[Lclient!wg;")
	Class617[] aClass617Array1;

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(Lclient!pw;)V", line = 11)
	public Class620(@OriginalArg(0) Class478 arg0) {
		this.method32404(arg0.method29745(Class614.aClass614_9.anInt5587 * -448671533));
	}

	@OriginalMember(owner = "client!wj", name = "p", descriptor = "(I)V", line = 16)
	void method32399() {
		this.aClass630Array1 = null;
	}

	@OriginalMember(owner = "client!wj", name = "w", descriptor = "()V", line = 16)
	void method32400() {
		this.aClass630Array1 = null;
	}

	@OriginalMember(owner = "client!wj", name = "x", descriptor = "()V", line = 16)
	void method32401() {
		this.aClass630Array1 = null;
	}

	@OriginalMember(owner = "client!wj", name = "t", descriptor = "()V", line = 16)
	void method32402() {
		this.aClass630Array1 = null;
	}

	@OriginalMember(owner = "client!wj", name = "q", descriptor = "()V", line = 16)
	void method32403() {
		this.aClass630Array1 = null;
	}

	@OriginalMember(owner = "client!wj", name = "c", descriptor = "([BS)V", line = 20)
	void method32404(@OriginalArg(0) byte[] arg0) {
		this.method32399();
		if (arg0 == null) {
			this.aClass630Array1 = new Class630[0];
		} else {
			this.method32407(new Class77_Sub39(arg0));
		}
	}

	@OriginalMember(owner = "client!wj", name = "d", descriptor = "([B)V", line = 20)
	void method32405(@OriginalArg(0) byte[] arg0) {
		this.method32399();
		if (arg0 == null) {
			this.aClass630Array1 = new Class630[0];
		} else {
			this.method32407(new Class77_Sub39(arg0));
		}
	}

	@OriginalMember(owner = "client!wj", name = "g", descriptor = "([B)V", line = 20)
	void method32406(@OriginalArg(0) byte[] arg0) {
		this.method32399();
		if (arg0 == null) {
			this.aClass630Array1 = new Class630[0];
		} else {
			this.method32407(new Class77_Sub39(arg0));
		}
	}

	@OriginalMember(owner = "client!wj", name = "v", descriptor = "(Lclient!akv;B)V", line = 30)
	void method32407(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			@Pc(14) int local14;
			if (local3 == 1) {
				local14 = arg0.method22478();
				@Pc(16) int local16 = 0;
				@Pc(20) LinkedList local20 = new LinkedList();
				for (@Pc(22) int local22 = 0; local22 < local14; local22++) {
					@Pc(29) int local29 = arg0.method22478();
					@Pc(33) int local33 = arg0.method22483();
					@Pc(37) int local37 = arg0.method22478();
					@Pc(39) int local39 = 0;
					@Pc(41) Class617 local41 = Class617.aClass617_1;
					@Pc(43) byte local43 = 1;
					@Pc(52) boolean local52 = (local37 & 0x1) != 0;
					if ((local37 & 0x2) != 0) {
						local39 = arg0.method22478();
					}
					if ((local37 & 0x4) != 0) {
						local41 = this.aClass617Array1[arg0.method22478()];
					}
					if ((local37 & 0x8) != 0) {
						local43 = arg0.method22481();
					}
					@Pc(89) boolean local89 = arg0.method22478() == 1;
					local20.add(new Class630(local29, local33, local52, local89, local39, local41, local43));
					if (local29 > local16) {
						local16 = local29;
					}
				}
				this.aClass630Array1 = new Class630[local16 + 1];
				@Pc(118) Iterator local118 = local20.iterator();
				while (local118.hasNext()) {
					@Pc(125) Class630 local125 = (Class630) local118.next();
					this.aClass630Array1[local125.method32581()] = local125;
				}
			} else if (local3 == 2) {
				this.aClass617Array1 = new Class617[arg0.method22478()];
				for (local14 = arg0.method22478(); local14 != 255; local14 = arg0.method22478()) {
					@Pc(155) int[] local155 = new int[arg0.method22483()];
					for (@Pc(157) int local157 = 0; local157 < local155.length; local157++) {
						local155[local157] = arg0.method22500();
					}
					this.aClass617Array1[local14] = new Class617(local155);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wj", name = "z", descriptor = "(Lclient!akv;)V", line = 30)
	void method32408(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			@Pc(14) int local14;
			if (local3 == 1) {
				local14 = arg0.method22478();
				@Pc(16) int local16 = 0;
				@Pc(20) LinkedList local20 = new LinkedList();
				for (@Pc(22) int local22 = 0; local22 < local14; local22++) {
					@Pc(29) int local29 = arg0.method22478();
					@Pc(33) int local33 = arg0.method22483();
					@Pc(37) int local37 = arg0.method22478();
					@Pc(39) int local39 = 0;
					@Pc(41) Class617 local41 = Class617.aClass617_1;
					@Pc(43) byte local43 = 1;
					@Pc(52) boolean local52 = (local37 & 0x1) != 0;
					if ((local37 & 0x2) != 0) {
						local39 = arg0.method22478();
					}
					if ((local37 & 0x4) != 0) {
						local41 = this.aClass617Array1[arg0.method22478()];
					}
					if ((local37 & 0x8) != 0) {
						local43 = arg0.method22481();
					}
					@Pc(89) boolean local89 = arg0.method22478() == 1;
					local20.add(new Class630(local29, local33, local52, local89, local39, local41, local43));
					if (local29 > local16) {
						local16 = local29;
					}
				}
				this.aClass630Array1 = new Class630[local16 + 1];
				@Pc(118) Iterator local118 = local20.iterator();
				while (local118.hasNext()) {
					@Pc(125) Class630 local125 = (Class630) local118.next();
					this.aClass630Array1[local125.method32581()] = local125;
				}
			} else if (local3 == 2) {
				this.aClass617Array1 = new Class617[arg0.method22478()];
				for (local14 = arg0.method22478(); local14 != 255; local14 = arg0.method22478()) {
					@Pc(155) int[] local155 = new int[arg0.method22483()];
					for (@Pc(157) int local157 = 0; local157 < local155.length; local157++) {
						local155[local157] = arg0.method22500();
					}
					this.aClass617Array1[local14] = new Class617(local155);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wj", name = "j", descriptor = "(Lclient!akv;)V", line = 30)
	void method32409(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			@Pc(14) int local14;
			if (local3 == 1) {
				local14 = arg0.method22478();
				@Pc(16) int local16 = 0;
				@Pc(20) LinkedList local20 = new LinkedList();
				for (@Pc(22) int local22 = 0; local22 < local14; local22++) {
					@Pc(29) int local29 = arg0.method22478();
					@Pc(33) int local33 = arg0.method22483();
					@Pc(37) int local37 = arg0.method22478();
					@Pc(39) int local39 = 0;
					@Pc(41) Class617 local41 = Class617.aClass617_1;
					@Pc(43) byte local43 = 1;
					@Pc(52) boolean local52 = (local37 & 0x1) != 0;
					if ((local37 & 0x2) != 0) {
						local39 = arg0.method22478();
					}
					if ((local37 & 0x4) != 0) {
						local41 = this.aClass617Array1[arg0.method22478()];
					}
					if ((local37 & 0x8) != 0) {
						local43 = arg0.method22481();
					}
					@Pc(89) boolean local89 = arg0.method22478() == 1;
					local20.add(new Class630(local29, local33, local52, local89, local39, local41, local43));
					if (local29 > local16) {
						local16 = local29;
					}
				}
				this.aClass630Array1 = new Class630[local16 + 1];
				@Pc(118) Iterator local118 = local20.iterator();
				while (local118.hasNext()) {
					@Pc(125) Class630 local125 = (Class630) local118.next();
					this.aClass630Array1[local125.method32581()] = local125;
				}
			} else if (local3 == 2) {
				this.aClass617Array1 = new Class617[arg0.method22478()];
				for (local14 = arg0.method22478(); local14 != 255; local14 = arg0.method22478()) {
					@Pc(155) int[] local155 = new int[arg0.method22483()];
					for (@Pc(157) int local157 = 0; local157 < local155.length; local157++) {
						local155[local157] = arg0.method22500();
					}
					this.aClass617Array1[local14] = new Class617(local155);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wj", name = "l", descriptor = "(I)I", line = 76)
	public int method32410() {
		return this.aClass630Array1.length;
	}

	@OriginalMember(owner = "client!wj", name = "i", descriptor = "()I", line = 76)
	public int method32411() {
		return this.aClass630Array1.length;
	}

	@OriginalMember(owner = "client!wj", name = "y", descriptor = "(II)Lclient!wt;", line = 80)
	public Class630 method32412(@OriginalArg(0) int arg0) {
		return this.aClass630Array1[arg0];
	}

	@OriginalMember(owner = "client!wj", name = "iterator", descriptor = "()Ljava/util/Iterator;", line = 84)
	@Override
	public Iterator iterator() {
		return new Class624(this.aClass630Array1);
	}

	@OriginalMember(owner = "client!wj", name = "r", descriptor = "()Ljava/util/Iterator;", line = 84)
	public Iterator method32413() {
		return new Class624(this.aClass630Array1);
	}

	@OriginalMember(owner = "client!wj", name = "s", descriptor = "()Ljava/util/Iterator;", line = 84)
	public Iterator method32414() {
		return new Class624(this.aClass630Array1);
	}

	@OriginalMember(owner = "client!wj", name = "vh", descriptor = "(Lclient!yf;B)V", line = 8365)
	static final void method32415(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class55.aClass124_1.method11098(local12);
	}

	@OriginalMember(owner = "client!wj", name = "xm", descriptor = "(Lclient!yf;I)V", line = 8691)
	static final void method32416(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 926998689;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		@Pc(33) int local33 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 2];
		if (local23 == -1) {
			throw new RuntimeException();
		}
		@Pc(46) Class36 local46 = (Class36) Class663.aClass35_Sub21_1.method18319(local23);
		if (local46.aClass498_1.method36479() != local13) {
			throw new RuntimeException();
		}
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local46.method628(local33) ? 1 : 0;
	}
}

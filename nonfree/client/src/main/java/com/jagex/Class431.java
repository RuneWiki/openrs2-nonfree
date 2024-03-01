package com.jagex;

import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ri")
public class Class431 {

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "I")
	static final int anInt4865 = 1;

	@OriginalMember(owner = "client!ri", name = "g", descriptor = "I")
	static final int anInt4866 = 2;

	@OriginalMember(owner = "client!ri", name = "l", descriptor = "I")
	static final int anInt4867 = 3;

	@OriginalMember(owner = "client!ri", name = "h", descriptor = "I")
	static final int anInt4868 = 4;

	@OriginalMember(owner = "client!ri", name = "v", descriptor = "I")
	static final int anInt4870 = 15;

	@OriginalMember(owner = "client!ri", name = "y", descriptor = "I")
	static final int anInt4871 = 4;

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "I")
	static final int anInt4873 = 5;

	@OriginalMember(owner = "client!ri", name = "s", descriptor = "I")
	static final int anInt4874 = 2;

	@OriginalMember(owner = "client!ri", name = "z", descriptor = "I")
	static final int anInt4875 = 7;

	@OriginalMember(owner = "client!ri", name = "j", descriptor = "I")
	static final int anInt4876 = 8;

	@OriginalMember(owner = "client!ri", name = "n", descriptor = "I")
	static final int anInt4877 = 9;

	@OriginalMember(owner = "client!ri", name = "e", descriptor = "I")
	static final int anInt4878 = 10;

	@OriginalMember(owner = "client!ri", name = "r", descriptor = "I")
	static final int anInt4879 = 11;

	@OriginalMember(owner = "client!ri", name = "d", descriptor = "I")
	static final int anInt4880 = 12;

	@OriginalMember(owner = "client!ri", name = "q", descriptor = "I")
	static final int anInt4881 = 13;

	@OriginalMember(owner = "client!ri", name = "m", descriptor = "I")
	static final int anInt4882 = 14;

	@OriginalMember(owner = "client!ri", name = "c", descriptor = "I")
	static final int anInt4883 = 6;

	@OriginalMember(owner = "client!ri", name = "t", descriptor = "I")
	static final int anInt4884 = 16;

	@OriginalMember(owner = "client!ri", name = "w", descriptor = "I")
	public static final int anInt4885 = 31;

	@OriginalMember(owner = "client!ri", name = "x", descriptor = "I")
	static final int anInt4886 = 5;

	@OriginalMember(owner = "client!ri", name = "p", descriptor = "I")
	public static final int anInt4888 = 0;

	@OriginalMember(owner = "client!ri", name = "u", descriptor = "I")
	static final int anInt4889 = 3;

	@OriginalMember(owner = "client!ri", name = "aj", descriptor = "I")
	int anInt4864;

	@OriginalMember(owner = "client!ri", name = "ak", descriptor = "I")
	int anInt4869;

	@OriginalMember(owner = "client!ri", name = "o", descriptor = "Lclient!afz;")
	public Class3_Sub15 aClass3_Sub15_3;

	@OriginalMember(owner = "client!ri", name = "aa", descriptor = "I")
	int anInt4890;

	@OriginalMember(owner = "client!ri", name = "an", descriptor = "I")
	int anInt4892;

	@OriginalMember(owner = "client!ri", name = "k", descriptor = "I")
	public int anInt4887;

	@OriginalMember(owner = "client!ri", name = "i", descriptor = "Z")
	boolean aBoolean759;

	@OriginalMember(owner = "client!ri", name = "f", descriptor = "Z")
	boolean aBoolean760;

	@OriginalMember(owner = "client!ri", name = "at", descriptor = "[S")
	short[] aShortArray110;

	@OriginalMember(owner = "client!ri", name = "af", descriptor = "I")
	public int anInt4872;

	@OriginalMember(owner = "client!ri", name = "ah", descriptor = "I")
	int anInt4891;

	@OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(Lclient!de;ILclient!ahb;I)V", line = 45)
	public Class431(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub41 arg2, @OriginalArg(3) int arg3) {
		if (Class363.anIntArray423 == null) {
			Class116.method22810();
		}
		this.anInt4887 = arg2.method20269() * 782638171;
		this.aBoolean759 = (this.anInt4887 * -180767789 & 0x8) != 0;
		this.aBoolean760 = (this.anInt4887 * -180767789 & 0x10) != 0;
		this.anInt4887 = (this.anInt4887 * -180767789 & 0x7) * 782638171;
		@Pc(53) int local53 = arg2.method20271() << arg3;
		@Pc(59) int local59 = arg2.method20271() << arg3;
		@Pc(65) int local65 = arg2.method20271() << arg3;
		@Pc(69) int local69 = arg2.method20269();
		@Pc(75) int local75 = local69 * 2 + 1;
		this.aShortArray110 = new short[local75];
		@Pc(81) int local81;
		for (local81 = 0; local81 < this.aShortArray110.length; local81++) {
			@Pc(91) short local91 = (short) arg2.method20271();
			@Pc(95) int local95 = local91 >>> 8;
			@Pc(99) int local99 = local91 & 0xFF;
			if (local95 >= local75) {
				local95 = local75 - 1;
			}
			if (local99 > local75 - local95) {
				local99 = local75 - local95;
			}
			this.aShortArray110[local81] = (short) (local95 << 8 | local99);
		}
		local69 = (0x1 << arg1 >> 1) + (local69 << arg1);
		local81 = Class360.anIntArray422 == null ? Class515.anIntArray490[Class61.method12768(arg2.method20271()) & 0xFFFF] : Class360.anIntArray422[arg2.method20271()];
		@Pc(159) int local159 = arg2.method20269();
		this.anInt4872 = (local159 & 0x1F) * -477191541;
		this.anInt4891 = ((local159 & 0xE0) << 3) * -1409325763;
		if (this.anInt4872 * 2074817827 != 31) {
			this.method27947();
		}
		this.method27944(arg0, local53, local65, local59, local69, local81);
	}

	@OriginalMember(owner = "client!ri", name = "g", descriptor = "(BB)Z", line = 61)
	public static boolean method27963(@OriginalArg(0) byte arg0) {
		@Pc(3) int local3 = arg0 & 0xFF;
		if (local3 == 0) {
			return false;
		} else {
			return local3 < 128 || local3 >= 160 || Class535.aCharArray5[local3 - 128] != 0;
		}
	}

	@OriginalMember(owner = "client!ri", name = "p", descriptor = "(Lclient!de;IIIIII)V", line = 75)
	void method27944(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass3_Sub15_3 = arg0.method17311(arg1, arg2, arg3, arg4, arg5, 1.0F);
	}

	@OriginalMember(owner = "client!ri", name = "x", descriptor = "(Lclient!de;IIIII)V", line = 75)
	void method27945(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass3_Sub15_3 = arg0.method17311(arg1, arg2, arg3, arg4, arg5, 1.0F);
	}

	@OriginalMember(owner = "client!ri", name = "s", descriptor = "(IIII)V", line = 79)
	public void method27948(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4869 = arg0 * -1542729515;
		this.anInt4864 = arg3 * -419132467;
		this.anInt4892 = arg2 * 99638639;
		this.anInt4890 = arg1 * -241577363;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIII)V", line = 79)
	public void method27950(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4869 = arg0 * -1542729515;
		this.anInt4864 = arg3 * -419132467;
		this.anInt4892 = arg2 * 99638639;
		this.anInt4890 = arg1 * -241577363;
	}

	@OriginalMember(owner = "client!ri", name = "p", descriptor = "(II)Z", line = 80)
	public static boolean method27957(@OriginalArg(0) int arg0) {
		return arg0 != 1 && arg0 != 7;
	}

	@OriginalMember(owner = "client!ri", name = "y", descriptor = "()V", line = 86)
	void method27946() {
		switch(this.anInt4872 * 2074817827) {
			case 2:
				this.anInt4869 = -1542729515;
				this.anInt4864 = 0;
				this.anInt4892 = -2098497536;
				this.anInt4890 = -829200384;
				break;
			case 3:
				this.anInt4869 = -1542729515;
				this.anInt4864 = 0;
				this.anInt4892 = -2098497536;
				this.anInt4890 = -1658400768;
				break;
			case 4:
				this.anInt4869 = -1875950764;
				this.anInt4864 = 0;
				this.anInt4892 = -2098497536;
				this.anInt4890 = -829200384;
				break;
			case 5:
				this.anInt4869 = -1875950764;
				this.anInt4864 = 0;
				this.anInt4892 = -2098497536;
				this.anInt4890 = 978165760;
				break;
			case 6:
				this.anInt4869 = -333221249;
				this.anInt4864 = 381354240;
				this.anInt4892 = -786936576;
				this.anInt4890 = -829200384;
				break;
			case 7:
				this.anInt4869 = -333221249;
				this.anInt4864 = 381354240;
				this.anInt4892 = -786936576;
				this.anInt4890 = -1658400768;
				break;
			case 8:
				this.anInt4869 = -333221249;
				this.anInt4864 = 305083392;
				this.anInt4892 = -1049248768;
				this.anInt4890 = -829200384;
				break;
			case 9:
				this.anInt4869 = -333221249;
				this.anInt4864 = 305083392;
				this.anInt4892 = -1049248768;
				this.anInt4890 = -1658400768;
				break;
			case 10:
				this.anInt4869 = -333221249;
				this.anInt4864 = 457625088;
				this.anInt4892 = -524624384;
				this.anInt4890 = -829200384;
				break;
			case 11:
				this.anInt4869 = -333221249;
				this.anInt4864 = 457625088;
				this.anInt4892 = -524624384;
				this.anInt4890 = -1658400768;
				break;
			case 12:
				this.anInt4869 = 1209508266;
				this.anInt4864 = 0;
				this.anInt4892 = -2098497536;
				this.anInt4890 = -829200384;
				break;
			case 13:
				this.anInt4869 = 1209508266;
				this.anInt4864 = 0;
				this.anInt4892 = -2098497536;
				this.anInt4890 = 978165760;
				break;
			case 14:
				this.anInt4869 = -1542729515;
				this.anInt4864 = 381354240;
				this.anInt4892 = -786936576;
				this.anInt4890 = -829200384;
				break;
			case 15:
				this.anInt4869 = -1542729515;
				this.anInt4864 = 457625088;
				this.anInt4892 = -524624384;
				this.anInt4890 = -1658400768;
				break;
			case 16:
				this.anInt4869 = -1542729515;
				this.anInt4864 = 533895936;
				this.anInt4892 = -262312192;
				this.anInt4890 = 978165760;
				break;
			default:
				this.anInt4864 = 0;
				this.anInt4869 = 0;
				this.anInt4892 = -2098497536;
				this.anInt4890 = -829200384;
		}
	}

	@OriginalMember(owner = "client!ri", name = "g", descriptor = "(I)V", line = 86)
	void method27947() {
		switch(this.anInt4872 * 2074817827) {
			case 2:
				this.anInt4869 = -1542729515;
				this.anInt4864 = 0;
				this.anInt4892 = -2098497536;
				this.anInt4890 = -829200384;
				break;
			case 3:
				this.anInt4869 = -1542729515;
				this.anInt4864 = 0;
				this.anInt4892 = -2098497536;
				this.anInt4890 = -1658400768;
				break;
			case 4:
				this.anInt4869 = -1875950764;
				this.anInt4864 = 0;
				this.anInt4892 = -2098497536;
				this.anInt4890 = -829200384;
				break;
			case 5:
				this.anInt4869 = -1875950764;
				this.anInt4864 = 0;
				this.anInt4892 = -2098497536;
				this.anInt4890 = 978165760;
				break;
			case 6:
				this.anInt4869 = -333221249;
				this.anInt4864 = 381354240;
				this.anInt4892 = -786936576;
				this.anInt4890 = -829200384;
				break;
			case 7:
				this.anInt4869 = -333221249;
				this.anInt4864 = 381354240;
				this.anInt4892 = -786936576;
				this.anInt4890 = -1658400768;
				break;
			case 8:
				this.anInt4869 = -333221249;
				this.anInt4864 = 305083392;
				this.anInt4892 = -1049248768;
				this.anInt4890 = -829200384;
				break;
			case 9:
				this.anInt4869 = -333221249;
				this.anInt4864 = 305083392;
				this.anInt4892 = -1049248768;
				this.anInt4890 = -1658400768;
				break;
			case 10:
				this.anInt4869 = -333221249;
				this.anInt4864 = 457625088;
				this.anInt4892 = -524624384;
				this.anInt4890 = -829200384;
				break;
			case 11:
				this.anInt4869 = -333221249;
				this.anInt4864 = 457625088;
				this.anInt4892 = -524624384;
				this.anInt4890 = -1658400768;
				break;
			case 12:
				this.anInt4869 = 1209508266;
				this.anInt4864 = 0;
				this.anInt4892 = -2098497536;
				this.anInt4890 = -829200384;
				break;
			case 13:
				this.anInt4869 = 1209508266;
				this.anInt4864 = 0;
				this.anInt4892 = -2098497536;
				this.anInt4890 = 978165760;
				break;
			case 14:
				this.anInt4869 = -1542729515;
				this.anInt4864 = 381354240;
				this.anInt4892 = -786936576;
				this.anInt4890 = -829200384;
				break;
			case 15:
				this.anInt4869 = -1542729515;
				this.anInt4864 = 457625088;
				this.anInt4892 = -524624384;
				this.anInt4890 = -1658400768;
				break;
			case 16:
				this.anInt4869 = -1542729515;
				this.anInt4864 = 533895936;
				this.anInt4892 = -262312192;
				this.anInt4890 = 978165760;
				break;
			default:
				this.anInt4864 = 0;
				this.anInt4869 = 0;
				this.anInt4892 = -2098497536;
				this.anInt4890 = -829200384;
		}
	}

	@OriginalMember(owner = "client!ri", name = "u", descriptor = "()V", line = 86)
	void method27949() {
		switch(this.anInt4872 * 2074817827) {
			case 2:
				this.anInt4869 = -1542729515;
				this.anInt4864 = 0;
				this.anInt4892 = -2098497536;
				this.anInt4890 = -829200384;
				break;
			case 3:
				this.anInt4869 = -1542729515;
				this.anInt4864 = 0;
				this.anInt4892 = -2098497536;
				this.anInt4890 = -1658400768;
				break;
			case 4:
				this.anInt4869 = -1875950764;
				this.anInt4864 = 0;
				this.anInt4892 = -2098497536;
				this.anInt4890 = -829200384;
				break;
			case 5:
				this.anInt4869 = -1875950764;
				this.anInt4864 = 0;
				this.anInt4892 = -2098497536;
				this.anInt4890 = 978165760;
				break;
			case 6:
				this.anInt4869 = -333221249;
				this.anInt4864 = 381354240;
				this.anInt4892 = -786936576;
				this.anInt4890 = -829200384;
				break;
			case 7:
				this.anInt4869 = -333221249;
				this.anInt4864 = 381354240;
				this.anInt4892 = -786936576;
				this.anInt4890 = -1658400768;
				break;
			case 8:
				this.anInt4869 = -333221249;
				this.anInt4864 = 305083392;
				this.anInt4892 = -1049248768;
				this.anInt4890 = -829200384;
				break;
			case 9:
				this.anInt4869 = -333221249;
				this.anInt4864 = 305083392;
				this.anInt4892 = -1049248768;
				this.anInt4890 = -1658400768;
				break;
			case 10:
				this.anInt4869 = -333221249;
				this.anInt4864 = 457625088;
				this.anInt4892 = -524624384;
				this.anInt4890 = -829200384;
				break;
			case 11:
				this.anInt4869 = -333221249;
				this.anInt4864 = 457625088;
				this.anInt4892 = -524624384;
				this.anInt4890 = -1658400768;
				break;
			case 12:
				this.anInt4869 = 1209508266;
				this.anInt4864 = 0;
				this.anInt4892 = -2098497536;
				this.anInt4890 = -829200384;
				break;
			case 13:
				this.anInt4869 = 1209508266;
				this.anInt4864 = 0;
				this.anInt4892 = -2098497536;
				this.anInt4890 = 978165760;
				break;
			case 14:
				this.anInt4869 = -1542729515;
				this.anInt4864 = 381354240;
				this.anInt4892 = -786936576;
				this.anInt4890 = -829200384;
				break;
			case 15:
				this.anInt4869 = -1542729515;
				this.anInt4864 = 457625088;
				this.anInt4892 = -524624384;
				this.anInt4890 = -1658400768;
				break;
			case 16:
				this.anInt4869 = -1542729515;
				this.anInt4864 = 533895936;
				this.anInt4892 = -262312192;
				this.anInt4890 = 978165760;
				break;
			default:
				this.anInt4864 = 0;
				this.anInt4869 = 0;
				this.anInt4892 = -2098497536;
				this.anInt4890 = -829200384;
		}
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "()V", line = 86)
	void method27951() {
		switch(this.anInt4872 * 2074817827) {
			case 2:
				this.anInt4869 = -1542729515;
				this.anInt4864 = 0;
				this.anInt4892 = -2098497536;
				this.anInt4890 = -829200384;
				break;
			case 3:
				this.anInt4869 = -1542729515;
				this.anInt4864 = 0;
				this.anInt4892 = -2098497536;
				this.anInt4890 = -1658400768;
				break;
			case 4:
				this.anInt4869 = -1875950764;
				this.anInt4864 = 0;
				this.anInt4892 = -2098497536;
				this.anInt4890 = -829200384;
				break;
			case 5:
				this.anInt4869 = -1875950764;
				this.anInt4864 = 0;
				this.anInt4892 = -2098497536;
				this.anInt4890 = 978165760;
				break;
			case 6:
				this.anInt4869 = -333221249;
				this.anInt4864 = 381354240;
				this.anInt4892 = -786936576;
				this.anInt4890 = -829200384;
				break;
			case 7:
				this.anInt4869 = -333221249;
				this.anInt4864 = 381354240;
				this.anInt4892 = -786936576;
				this.anInt4890 = -1658400768;
				break;
			case 8:
				this.anInt4869 = -333221249;
				this.anInt4864 = 305083392;
				this.anInt4892 = -1049248768;
				this.anInt4890 = -829200384;
				break;
			case 9:
				this.anInt4869 = -333221249;
				this.anInt4864 = 305083392;
				this.anInt4892 = -1049248768;
				this.anInt4890 = -1658400768;
				break;
			case 10:
				this.anInt4869 = -333221249;
				this.anInt4864 = 457625088;
				this.anInt4892 = -524624384;
				this.anInt4890 = -829200384;
				break;
			case 11:
				this.anInt4869 = -333221249;
				this.anInt4864 = 457625088;
				this.anInt4892 = -524624384;
				this.anInt4890 = -1658400768;
				break;
			case 12:
				this.anInt4869 = 1209508266;
				this.anInt4864 = 0;
				this.anInt4892 = -2098497536;
				this.anInt4890 = -829200384;
				break;
			case 13:
				this.anInt4869 = 1209508266;
				this.anInt4864 = 0;
				this.anInt4892 = -2098497536;
				this.anInt4890 = 978165760;
				break;
			case 14:
				this.anInt4869 = -1542729515;
				this.anInt4864 = 381354240;
				this.anInt4892 = -786936576;
				this.anInt4890 = -829200384;
				break;
			case 15:
				this.anInt4869 = -1542729515;
				this.anInt4864 = 457625088;
				this.anInt4892 = -524624384;
				this.anInt4890 = -1658400768;
				break;
			case 16:
				this.anInt4869 = -1542729515;
				this.anInt4864 = 533895936;
				this.anInt4892 = -262312192;
				this.anInt4890 = 978165760;
				break;
			default:
				this.anInt4864 = 0;
				this.anInt4869 = 0;
				this.anInt4892 = -2098497536;
				this.anInt4890 = -829200384;
		}
	}

	@OriginalMember(owner = "client!ri", name = "c", descriptor = "()V", line = 86)
	void method27952() {
		switch(this.anInt4872 * 2074817827) {
			case 2:
				this.anInt4869 = -1542729515;
				this.anInt4864 = 0;
				this.anInt4892 = -2098497536;
				this.anInt4890 = -829200384;
				break;
			case 3:
				this.anInt4869 = -1542729515;
				this.anInt4864 = 0;
				this.anInt4892 = -2098497536;
				this.anInt4890 = -1658400768;
				break;
			case 4:
				this.anInt4869 = -1875950764;
				this.anInt4864 = 0;
				this.anInt4892 = -2098497536;
				this.anInt4890 = -829200384;
				break;
			case 5:
				this.anInt4869 = -1875950764;
				this.anInt4864 = 0;
				this.anInt4892 = -2098497536;
				this.anInt4890 = 978165760;
				break;
			case 6:
				this.anInt4869 = -333221249;
				this.anInt4864 = 381354240;
				this.anInt4892 = -786936576;
				this.anInt4890 = -829200384;
				break;
			case 7:
				this.anInt4869 = -333221249;
				this.anInt4864 = 381354240;
				this.anInt4892 = -786936576;
				this.anInt4890 = -1658400768;
				break;
			case 8:
				this.anInt4869 = -333221249;
				this.anInt4864 = 305083392;
				this.anInt4892 = -1049248768;
				this.anInt4890 = -829200384;
				break;
			case 9:
				this.anInt4869 = -333221249;
				this.anInt4864 = 305083392;
				this.anInt4892 = -1049248768;
				this.anInt4890 = -1658400768;
				break;
			case 10:
				this.anInt4869 = -333221249;
				this.anInt4864 = 457625088;
				this.anInt4892 = -524624384;
				this.anInt4890 = -829200384;
				break;
			case 11:
				this.anInt4869 = -333221249;
				this.anInt4864 = 457625088;
				this.anInt4892 = -524624384;
				this.anInt4890 = -1658400768;
				break;
			case 12:
				this.anInt4869 = 1209508266;
				this.anInt4864 = 0;
				this.anInt4892 = -2098497536;
				this.anInt4890 = -829200384;
				break;
			case 13:
				this.anInt4869 = 1209508266;
				this.anInt4864 = 0;
				this.anInt4892 = -2098497536;
				this.anInt4890 = 978165760;
				break;
			case 14:
				this.anInt4869 = -1542729515;
				this.anInt4864 = 381354240;
				this.anInt4892 = -786936576;
				this.anInt4890 = -829200384;
				break;
			case 15:
				this.anInt4869 = -1542729515;
				this.anInt4864 = 457625088;
				this.anInt4892 = -524624384;
				this.anInt4890 = -1658400768;
				break;
			case 16:
				this.anInt4869 = -1542729515;
				this.anInt4864 = 533895936;
				this.anInt4892 = -262312192;
				this.anInt4890 = 978165760;
				break;
			default:
				this.anInt4864 = 0;
				this.anInt4869 = 0;
				this.anInt4892 = -2098497536;
				this.anInt4890 = -829200384;
		}
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(II)J", line = 111)
	public static long method27960(@OriginalArg(0) int arg0) {
		return (long) (arg0 + 11745) * 86400000L;
	}

	@OriginalMember(owner = "client!ri", name = "l", descriptor = "(IZI)V", line = 188)
	void method27943(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(32) int local32;
		if (arg1) {
			local32 = 2048;
		} else {
			@Pc(17) int local17 = arg0 * -563411099 * this.anInt4890 / 50 + this.anInt4891 * 874420757 & 0x7FF;
			switch(this.anInt4869 * 2048059517) {
				case 1:
					local32 = (Class317.anIntArray419[local17 << 3] >> 4) + 1024;
					break;
				case 2:
					local32 = local17;
					break;
				case 3:
					local32 = Class363.anIntArray423[local17] >> 1;
					break;
				case 4:
					local32 = local17 >> 10 << 11;
					break;
				case 5:
					local32 = (local17 < 1024 ? local17 : 2048 - local17) << 1;
					break;
				default:
					local32 = 2048;
			}
		}
		this.aClass3_Sub15_3.method11285((float) ((this.anInt4892 * 1360503183 * local32 >> 11) + this.anInt4864 * 9132293) / 2048.0F);
	}

	@OriginalMember(owner = "client!ri", name = "z", descriptor = "()V", line = 216)
	static void method27953() {
		Class363.anIntArray423 = Class454.method28458(2048, 35, 8, 8, 4, 0.4F, true);
	}

	@OriginalMember(owner = "client!ri", name = "j", descriptor = "()V", line = 216)
	static void method27954() {
		Class363.anIntArray423 = Class454.method28458(2048, 35, 8, 8, 4, 0.4F, true);
	}

	@OriginalMember(owner = "client!ri", name = "n", descriptor = "()V", line = 216)
	static void method27955() {
		Class363.anIntArray423 = Class454.method28458(2048, 35, 8, 8, 4, 0.4F, true);
	}

	@OriginalMember(owner = "client!ri", name = "e", descriptor = "()V", line = 216)
	static void method27956() {
		Class363.anIntArray423 = Class454.method28458(2048, 35, 8, 8, 4, 0.4F, true);
	}

	@OriginalMember(owner = "client!ri", name = "bs", descriptor = "(Lclient!vs;B)V", line = 4187)
	static final void method27958(@OriginalArg(0) Class536 arg0) {
		if (arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381] == 1) {
			arg0.anInt5318 += arg0.anIntArray497[-2140198955 * arg0.anInt5318] * -836839043;
		}
	}

	@OriginalMember(owner = "client!ri", name = "jw", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;I)V", line = 5801)
	static final void method27962(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		arg0.anInt3548 = arg2.anIntArray496[(arg2.anInt5319 -= 312124549) * 960738381] * -353855041;
	}

	@OriginalMember(owner = "client!ri", name = "ald", descriptor = "(Lclient!vs;I)V", line = 11175)
	static final void method27959(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class190.anInt3671 * -780345315;
	}

	@OriginalMember(owner = "client!ri", name = "mm", descriptor = "(J)Ljava/lang/String;", line = 11726)
	static String method27961(@OriginalArg(0) long arg0) {
		return Class179.method23520(new Date(arg0), "EEE dd-MMM-yyyy HH:mm:ss zzz");
	}
}

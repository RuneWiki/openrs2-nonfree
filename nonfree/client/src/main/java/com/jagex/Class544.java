package com.jagex;

import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sv")
public class Class544 {

	@OriginalMember(owner = "client!sv", name = "q", descriptor = "I")
	public static int anInt5212;

	@OriginalMember(owner = "client!sv", name = "ig", descriptor = "Lclient!wj;")
	public static Class620 aClass620_1;

	// $FF: synthetic field
	@OriginalMember(owner = "client!sv", name = "this$1", descriptor = "Lclient!sw;")
	final Class545 this$1;

	@OriginalMember(owner = "client!sv", name = "p", descriptor = "[S")
	short[] aShortArray138;

	@OriginalMember(owner = "client!sv", name = "p", descriptor = "(CI)B", line = 12)
	public static byte method30950(@OriginalArg(0) char arg0) {
		@Pc(13) byte local13;
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			local13 = (byte) arg0;
		} else if (arg0 == '€') {
			local13 = -128;
		} else if (arg0 == '‚') {
			local13 = -126;
		} else if (arg0 == 'ƒ') {
			local13 = -125;
		} else if (arg0 == '„') {
			local13 = -124;
		} else if (arg0 == '…') {
			local13 = -123;
		} else if (arg0 == '†') {
			local13 = -122;
		} else if (arg0 == '‡') {
			local13 = -121;
		} else if (arg0 == 'ˆ') {
			local13 = -120;
		} else if (arg0 == '‰') {
			local13 = -119;
		} else if (arg0 == 'Š') {
			local13 = -118;
		} else if (arg0 == '‹') {
			local13 = -117;
		} else if (arg0 == 'Œ') {
			local13 = -116;
		} else if (arg0 == 'Ž') {
			local13 = -114;
		} else if (arg0 == '‘') {
			local13 = -111;
		} else if (arg0 == '’') {
			local13 = -110;
		} else if (arg0 == '“') {
			local13 = -109;
		} else if (arg0 == '”') {
			local13 = -108;
		} else if (arg0 == '•') {
			local13 = -107;
		} else if (arg0 == '–') {
			local13 = -106;
		} else if (arg0 == '—') {
			local13 = -105;
		} else if (arg0 == '˜') {
			local13 = -104;
		} else if (arg0 == '™') {
			local13 = -103;
		} else if (arg0 == 'š') {
			local13 = -102;
		} else if (arg0 == '›') {
			local13 = -101;
		} else if (arg0 == 'œ') {
			local13 = -100;
		} else if (arg0 == 'ž') {
			local13 = -98;
		} else if (arg0 == 'Ÿ') {
			local13 = -97;
		} else {
			local13 = 63;
		}
		return local13;
	}

	@OriginalMember(owner = "client!sv", name = "<init>", descriptor = "(Lclient!sw;)V", line = 231)
	Class544(@OriginalArg(0) Class545 arg0) {
		this.this$1 = arg0;
		this.aShortArray138 = new short[768];
	}

	@OriginalMember(owner = "client!sv", name = "p", descriptor = "(I)V", line = 234)
	void method30951() {
		Class350.method27880(this.aShortArray138);
	}

	@OriginalMember(owner = "client!sv", name = "l", descriptor = "()V", line = 234)
	void method30952() {
		Class350.method27880(this.aShortArray138);
	}

	@OriginalMember(owner = "client!sv", name = "y", descriptor = "()V", line = 234)
	void method30953() {
		Class350.method27880(this.aShortArray138);
	}

	@OriginalMember(owner = "client!sv", name = "c", descriptor = "(Lclient!jh;I)B", line = 238)
	byte method30954(@OriginalArg(0) Class342 arg0) throws IOException {
		@Pc(1) int local1 = 1;
		do {
			local1 = local1 << 1 | arg0.method27779(this.aShortArray138, local1);
		} while (local1 < 256);
		return (byte) local1;
	}

	@OriginalMember(owner = "client!sv", name = "w", descriptor = "(Lclient!jh;)B", line = 238)
	byte method30955(@OriginalArg(0) Class342 arg0) throws IOException {
		@Pc(1) int local1 = 1;
		do {
			local1 = local1 << 1 | arg0.method27779(this.aShortArray138, local1);
		} while (local1 < 256);
		return (byte) local1;
	}

	@OriginalMember(owner = "client!sv", name = "t", descriptor = "(Lclient!jh;B)B", line = 246)
	byte method30956(@OriginalArg(0) Class342 arg0, @OriginalArg(1) byte arg1) throws IOException {
		@Pc(1) int local1 = 1;
		do {
			@Pc(7) int local7 = arg1 >> 7 & 0x1;
			arg1 = (byte) (arg1 << 1);
			@Pc(25) int local25 = arg0.method27779(this.aShortArray138, local1 + (local7 + 1 << 8));
			local1 = local1 << 1 | local25;
			if (local25 != local7) {
				while (local1 < 256) {
					local1 = local1 << 1 | arg0.method27779(this.aShortArray138, local1);
				}
				return (byte) local1;
			}
		} while (local1 < 256);
		return (byte) local1;
	}

	@OriginalMember(owner = "client!sv", name = "v", descriptor = "(Lclient!jh;BI)B", line = 246)
	byte method30957(@OriginalArg(0) Class342 arg0, @OriginalArg(1) byte arg1) throws IOException {
		@Pc(1) int local1 = 1;
		do {
			@Pc(7) int local7 = arg1 >> 7 & 0x1;
			arg1 = (byte) (arg1 << 1);
			@Pc(25) int local25 = arg0.method27779(this.aShortArray138, local1 + (local7 + 1 << 8));
			local1 = local1 << 1 | local25;
			if (local25 != local7) {
				while (local1 < 256) {
					local1 = local1 << 1 | arg0.method27779(this.aShortArray138, local1);
				}
				return (byte) local1;
			}
		} while (local1 < 256);
		return (byte) local1;
	}

	@OriginalMember(owner = "client!sv", name = "q", descriptor = "(Lclient!jh;B)B", line = 246)
	byte method30958(@OriginalArg(0) Class342 arg0, @OriginalArg(1) byte arg1) throws IOException {
		@Pc(1) int local1 = 1;
		do {
			@Pc(7) int local7 = arg1 >> 7 & 0x1;
			arg1 = (byte) (arg1 << 1);
			@Pc(25) int local25 = arg0.method27779(this.aShortArray138, local1 + (local7 + 1 << 8));
			local1 = local1 << 1 | local25;
			if (local25 != local7) {
				while (local1 < 256) {
					local1 = local1 << 1 | arg0.method27779(this.aShortArray138, local1);
				}
				return (byte) local1;
			}
		} while (local1 < 256);
		return (byte) local1;
	}
}

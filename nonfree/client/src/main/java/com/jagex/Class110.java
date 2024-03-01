package com.jagex;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public class Class110 implements Interface11 {

	@OriginalMember(owner = "client!ce", name = "hb", descriptor = "Lclient!rn;")
	public static Class436 aClass436_1;

	@OriginalMember(owner = "client!ce", name = "p", descriptor = "Lclient!ny;")
	Class359 aClass359_32;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "Lclient!ny;")
	Class359 aClass359_31;

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(Lclient!ny;Lclient!ny;)V", line = 14)
	public Class110(@OriginalArg(0) Class359 arg0, @OriginalArg(1) Class359 arg1) {
		this.aClass359_32 = arg0;
		this.aClass359_31 = arg1;
	}

	@OriginalMember(owner = "client!ce", name = "p", descriptor = "(ZS)V", line = 15)
	public static void method22005(@OriginalArg(0) boolean arg0) {
		Class510.aClass183_1.method23624();
		if (!Class594.method33424(client.anInt3039 * 1115111877)) {
			return;
		}
		@Pc(11) Class82[] local11 = client.aClass82Array1;
		for (@Pc(13) int local13 = 0; local13 < local11.length; local13++) {
			@Pc(21) Class82 local21 = local11[local13];
			local21.anInt2919 += -1363934375;
			if (local21.anInt2919 * 2119570665 < 50 && !arg0) {
				return;
			}
			local21.anInt2919 = 0;
			if (!local21.aBoolean531 && local21.method21621() != null) {
				@Pc(52) Class3_Sub23 local52 = Class269.method25284(Class311.aClass311_89, local21.aClass577_2);
				local21.method21601(local52);
				try {
					local21.method21617();
				} catch (@Pc(61) IOException local61) {
					local21.aBoolean531 = true;
				}
			}
		}
		Class510.aClass183_1.method23624();
	}

	@OriginalMember(owner = "client!ce", name = "p", descriptor = "(ILclient!sm;FIIZI)Z", line = 20)
	@Override
	public boolean method21977(@OriginalArg(0) int arg0, @OriginalArg(1) Class459 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(1) boolean local1 = true;
		if (this.aClass359_31.method26730(arg0)) {
			local1 = this.aClass359_31.method26674(arg0);
		}
		return local1 & this.aClass359_32.method26674(arg0);
	}

	@OriginalMember(owner = "client!ce", name = "z", descriptor = "(ILclient!sm;FIIZ)Z", line = 20)
	@Override
	public boolean method21970(@OriginalArg(0) int arg0, @OriginalArg(1) Class459 arg1, @OriginalArg(2) float arg2) {
		@Pc(1) boolean local1 = true;
		if (this.aClass359_31.method26730(arg0)) {
			local1 = this.aClass359_31.method26674(arg0);
		}
		return local1 & this.aClass359_32.method26674(arg0);
	}

	@OriginalMember(owner = "client!ce", name = "j", descriptor = "(ILclient!sm;FIIZ)Z", line = 20)
	@Override
	public boolean method21975(@OriginalArg(0) int arg0, @OriginalArg(1) Class459 arg1, @OriginalArg(2) float arg2) {
		@Pc(1) boolean local1 = true;
		if (this.aClass359_31.method26730(arg0)) {
			local1 = this.aClass359_31.method26674(arg0);
		}
		return local1 & this.aClass359_32.method26674(arg0);
	}

	@OriginalMember(owner = "client!ce", name = "n", descriptor = "(ILclient!sm;FIIZ)Z", line = 20)
	@Override
	public boolean method21976(@OriginalArg(0) int arg0, @OriginalArg(1) Class459 arg1, @OriginalArg(2) float arg2) {
		@Pc(1) boolean local1 = true;
		if (this.aClass359_31.method26730(arg0)) {
			local1 = this.aClass359_31.method26674(arg0);
		}
		return local1 & this.aClass359_32.method26674(arg0);
	}

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "(ILclient!sm;FIIZ)Z", line = 20)
	@Override
	public boolean method21973(@OriginalArg(0) int arg0, @OriginalArg(1) Class459 arg1, @OriginalArg(2) float arg2) {
		@Pc(1) boolean local1 = true;
		if (this.aClass359_31.method26730(arg0)) {
			local1 = this.aClass359_31.method26674(arg0);
		}
		return local1 & this.aClass359_32.method26674(arg0);
	}

	@OriginalMember(owner = "client!ce", name = "e", descriptor = "(I)[I", line = 29)
	int[] method21987(@OriginalArg(0) int arg0) {
		@Pc(4) int[] local4 = this.method21988(arg0);
		if (local4 == null) {
			return null;
		}
		for (@Pc(11) int local11 = 0; local11 < local4.length; local11++) {
			if ((local4[local11] & 0xFFFFFF) == 0) {
				local4[local11] &= 0xFFFFFF;
			} else {
				local4[local11] |= 0xFF000000;
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IB)[I", line = 29)
	int[] method21990(@OriginalArg(0) int arg0) {
		@Pc(4) int[] local4 = this.method21988(arg0);
		if (local4 == null) {
			return null;
		}
		for (@Pc(11) int local11 = 0; local11 < local4.length; local11++) {
			if ((local4[local11] & 0xFFFFFF) == 0) {
				local4[local11] &= 0xFFFFFF;
			} else {
				local4[local11] |= 0xFF000000;
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "(I)[I", line = 29)
	int[] method21993(@OriginalArg(0) int arg0) {
		@Pc(4) int[] local4 = this.method21988(arg0);
		if (local4 == null) {
			return null;
		}
		for (@Pc(11) int local11 = 0; local11 < local4.length; local11++) {
			if ((local4[local11] & 0xFFFFFF) == 0) {
				local4[local11] &= 0xFFFFFF;
			} else {
				local4[local11] |= 0xFF000000;
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!ce", name = "q", descriptor = "(I)[I", line = 29)
	int[] method21994(@OriginalArg(0) int arg0) {
		@Pc(4) int[] local4 = this.method21988(arg0);
		if (local4 == null) {
			return null;
		}
		for (@Pc(11) int local11 = 0; local11 < local4.length; local11++) {
			if ((local4[local11] & 0xFFFFFF) == 0) {
				local4[local11] &= 0xFFFFFF;
			} else {
				local4[local11] |= 0xFF000000;
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!ce", name = "m", descriptor = "(I)[I", line = 29)
	int[] method21995(@OriginalArg(0) int arg0) {
		@Pc(4) int[] local4 = this.method21988(arg0);
		if (local4 == null) {
			return null;
		}
		for (@Pc(11) int local11 = 0; local11 < local4.length; local11++) {
			if ((local4[local11] & 0xFFFFFF) == 0) {
				local4[local11] &= 0xFFFFFF;
			} else {
				local4[local11] |= 0xFF000000;
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!ce", name = "v", descriptor = "(I)[I", line = 29)
	int[] method22000(@OriginalArg(0) int arg0) {
		@Pc(4) int[] local4 = this.method21988(arg0);
		if (local4 == null) {
			return null;
		}
		for (@Pc(11) int local11 = 0; local11 < local4.length; local11++) {
			if ((local4[local11] & 0xFFFFFF) == 0) {
				local4[local11] &= 0xFFFFFF;
			} else {
				local4[local11] |= 0xFF000000;
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!ce", name = "r", descriptor = "(I)[I", line = 29)
	int[] method22002(@OriginalArg(0) int arg0) {
		@Pc(4) int[] local4 = this.method21988(arg0);
		if (local4 == null) {
			return null;
		}
		for (@Pc(11) int local11 = 0; local11 < local4.length; local11++) {
			if ((local4[local11] & 0xFFFFFF) == 0) {
				local4[local11] &= 0xFFFFFF;
			} else {
				local4[local11] |= 0xFF000000;
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!ce", name = "g", descriptor = "(IB)[I", line = 43)
	int[] method21988(@OriginalArg(0) int arg0) {
		@Pc(5) byte[] local5 = this.aClass359_32.method26705(arg0);
		if (local5 == null) {
			return null;
		}
		try {
			return this.method21991(local5);
		} catch (@Pc(17) IOException local17) {
			return null;
		}
	}

	@OriginalMember(owner = "client!ce", name = "t", descriptor = "(I)[I", line = 43)
	int[] method21996(@OriginalArg(0) int arg0) {
		@Pc(5) byte[] local5 = this.aClass359_32.method26705(arg0);
		if (local5 == null) {
			return null;
		}
		try {
			return this.method21991(local5);
		} catch (@Pc(17) IOException local17) {
			return null;
		}
	}

	@OriginalMember(owner = "client!ce", name = "w", descriptor = "(I)[I", line = 43)
	int[] method21997(@OriginalArg(0) int arg0) {
		@Pc(5) byte[] local5 = this.aClass359_32.method26705(arg0);
		if (local5 == null) {
			return null;
		}
		try {
			return this.method21991(local5);
		} catch (@Pc(17) IOException local17) {
			return null;
		}
	}

	@OriginalMember(owner = "client!ce", name = "o", descriptor = "(I)[I", line = 43)
	int[] method21998(@OriginalArg(0) int arg0) {
		@Pc(5) byte[] local5 = this.aClass359_32.method26705(arg0);
		if (local5 == null) {
			return null;
		}
		try {
			return this.method21991(local5);
		} catch (@Pc(17) IOException local17) {
			return null;
		}
	}

	@OriginalMember(owner = "client!ce", name = "l", descriptor = "(II)[F", line = 55)
	float[] method21989(@OriginalArg(0) int arg0) {
		@Pc(4) int[] local4 = this.method21988(arg0);
		if (local4 == null) {
			return null;
		}
		@Pc(10) int[] local10 = null;
		@Pc(31) int local31;
		if (this.aClass359_31.method26730(arg0)) {
			@Pc(22) byte[] local22 = this.aClass359_31.method26705(arg0);
			if (local22 != null) {
				try {
					local10 = this.method21991(local22);
					for (local31 = 0; local31 < local10.length; local31++) {
						local10[local31] &= 0xFFF;
					}
				} catch (@Pc(47) IOException local47) {
				}
			}
		}
		if (local10 == null) {
			local10 = new int[local4.length];
		}
		@Pc(59) float[] local59 = new float[local4.length * 4];
		local31 = 0;
		for (@Pc(63) int local63 = 0; local63 < local4.length; local63++) {
			@Pc(71) int local71 = local4[local63];
			@Pc(75) int local75 = local71 >>> 24;
			@Pc(81) int local81 = local71 >> 16 & 0xFF;
			@Pc(87) int local87 = local71 >> 8 & 0xFF;
			@Pc(91) int local91 = local71 & 0xFF;
			@Pc(102) float local102 = (float) local10[local63] * 31.0F / 4096.0F + 1.0F;
			local59[local31++] = (float) local81 * local102 / 255.0F;
			local59[local31++] = (float) local87 * local102 / 255.0F;
			local59[local31++] = local102 * (float) local91 / 255.0F;
			local59[local31++] = (float) local75 / 255.0F;
		}
		return local59;
	}

	@OriginalMember(owner = "client!ce", name = "f", descriptor = "(I)[F", line = 55)
	float[] method21992(@OriginalArg(0) int arg0) {
		@Pc(4) int[] local4 = this.method21988(arg0);
		if (local4 == null) {
			return null;
		}
		@Pc(10) int[] local10 = null;
		@Pc(31) int local31;
		if (this.aClass359_31.method26730(arg0)) {
			@Pc(22) byte[] local22 = this.aClass359_31.method26705(arg0);
			if (local22 != null) {
				try {
					local10 = this.method21991(local22);
					for (local31 = 0; local31 < local10.length; local31++) {
						local10[local31] &= 0xFFF;
					}
				} catch (@Pc(47) IOException local47) {
				}
			}
		}
		if (local10 == null) {
			local10 = new int[local4.length];
		}
		@Pc(59) float[] local59 = new float[local4.length * 4];
		local31 = 0;
		for (@Pc(63) int local63 = 0; local63 < local4.length; local63++) {
			@Pc(71) int local71 = local4[local63];
			@Pc(75) int local75 = local71 >>> 24;
			@Pc(81) int local81 = local71 >> 16 & 0xFF;
			@Pc(87) int local87 = local71 >> 8 & 0xFF;
			@Pc(91) int local91 = local71 & 0xFF;
			@Pc(102) float local102 = (float) local10[local63] * 31.0F / 4096.0F + 1.0F;
			local59[local31++] = (float) local81 * local102 / 255.0F;
			local59[local31++] = (float) local87 * local102 / 255.0F;
			local59[local31++] = local102 * (float) local91 / 255.0F;
			local59[local31++] = (float) local75 / 255.0F;
		}
		return local59;
	}

	@OriginalMember(owner = "client!ce", name = "i", descriptor = "(I)[F", line = 55)
	float[] method21999(@OriginalArg(0) int arg0) {
		@Pc(4) int[] local4 = this.method21988(arg0);
		if (local4 == null) {
			return null;
		}
		@Pc(10) int[] local10 = null;
		@Pc(31) int local31;
		if (this.aClass359_31.method26730(arg0)) {
			@Pc(22) byte[] local22 = this.aClass359_31.method26705(arg0);
			if (local22 != null) {
				try {
					local10 = this.method21991(local22);
					for (local31 = 0; local31 < local10.length; local31++) {
						local10[local31] &= 0xFFF;
					}
				} catch (@Pc(47) IOException local47) {
				}
			}
		}
		if (local10 == null) {
			local10 = new int[local4.length];
		}
		@Pc(59) float[] local59 = new float[local4.length * 4];
		local31 = 0;
		for (@Pc(63) int local63 = 0; local63 < local4.length; local63++) {
			@Pc(71) int local71 = local4[local63];
			@Pc(75) int local75 = local71 >>> 24;
			@Pc(81) int local81 = local71 >> 16 & 0xFF;
			@Pc(87) int local87 = local71 >> 8 & 0xFF;
			@Pc(91) int local91 = local71 & 0xFF;
			@Pc(102) float local102 = (float) local10[local63] * 31.0F / 4096.0F + 1.0F;
			local59[local31++] = (float) local81 * local102 / 255.0F;
			local59[local31++] = (float) local87 * local102 / 255.0F;
			local59[local31++] = local102 * (float) local91 / 255.0F;
			local59[local31++] = (float) local75 / 255.0F;
		}
		return local59;
	}

	@OriginalMember(owner = "client!ce", name = "k", descriptor = "(I)[F", line = 55)
	float[] method22001(@OriginalArg(0) int arg0) {
		@Pc(4) int[] local4 = this.method21988(arg0);
		if (local4 == null) {
			return null;
		}
		@Pc(10) int[] local10 = null;
		@Pc(31) int local31;
		if (this.aClass359_31.method26730(arg0)) {
			@Pc(22) byte[] local22 = this.aClass359_31.method26705(arg0);
			if (local22 != null) {
				try {
					local10 = this.method21991(local22);
					for (local31 = 0; local31 < local10.length; local31++) {
						local10[local31] &= 0xFFF;
					}
				} catch (@Pc(47) IOException local47) {
				}
			}
		}
		if (local10 == null) {
			local10 = new int[local4.length];
		}
		@Pc(59) float[] local59 = new float[local4.length * 4];
		local31 = 0;
		for (@Pc(63) int local63 = 0; local63 < local4.length; local63++) {
			@Pc(71) int local71 = local4[local63];
			@Pc(75) int local75 = local71 >>> 24;
			@Pc(81) int local81 = local71 >> 16 & 0xFF;
			@Pc(87) int local87 = local71 >> 8 & 0xFF;
			@Pc(91) int local91 = local71 & 0xFF;
			@Pc(102) float local102 = (float) local10[local63] * 31.0F / 4096.0F + 1.0F;
			local59[local31++] = (float) local81 * local102 / 255.0F;
			local59[local31++] = (float) local87 * local102 / 255.0F;
			local59[local31++] = local102 * (float) local91 / 255.0F;
			local59[local31++] = (float) local75 / 255.0F;
		}
		return local59;
	}

	@OriginalMember(owner = "client!ce", name = "h", descriptor = "(I)V", line = 96)
	@Override
	public void method21972() {
	}

	@OriginalMember(owner = "client!ce", name = "at", descriptor = "()V", line = 96)
	@Override
	public void method21981() {
	}

	@OriginalMember(owner = "client!ce", name = "aa", descriptor = "(IFIIZ)[I", line = 99)
	@Override
	public int[] method21980(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		return this.method21990(arg0);
	}

	@OriginalMember(owner = "client!ce", name = "af", descriptor = "(IFIIZ)[I", line = 99)
	@Override
	public int[] method21978(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		return this.method21990(arg0);
	}

	@OriginalMember(owner = "client!ce", name = "ak", descriptor = "(IFIIZ)[I", line = 99)
	@Override
	public int[] method21979(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		return this.method21990(arg0);
	}

	@OriginalMember(owner = "client!ce", name = "ah", descriptor = "(IFIIZ)[I", line = 99)
	@Override
	public int[] method21971(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		return this.method21990(arg0);
	}

	@OriginalMember(owner = "client!ce", name = "x", descriptor = "(IFIIZS)[I", line = 99)
	@Override
	public int[] method21969(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return this.method21990(arg0);
	}

	@OriginalMember(owner = "client!ce", name = "s", descriptor = "(IFIIZI)[I", line = 103)
	@Override
	public int[] method21974(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return this.method21988(arg0);
	}

	@OriginalMember(owner = "client!ce", name = "an", descriptor = "(IFIIZ)[I", line = 103)
	@Override
	public int[] method21982(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		return this.method21988(arg0);
	}

	@OriginalMember(owner = "client!ce", name = "aj", descriptor = "(IFIIZ)[I", line = 103)
	@Override
	public int[] method21968(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		return this.method21988(arg0);
	}

	@OriginalMember(owner = "client!ce", name = "as", descriptor = "(IFIIZ)[I", line = 103)
	@Override
	public int[] method21984(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		return this.method21988(arg0);
	}

	@OriginalMember(owner = "client!ce", name = "t", descriptor = "(Lclient!vs;I)V", line = 105)
	static void method22007(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[arg0.anInt5319 * 960738381 - 2] = Class239.aClass505_1.method29516(arg0.anIntArray496[arg0.anInt5319 * 960738381 - 2]).method29486(Class424.aClass165_1, arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1]) ? 1 : 0;
		arg0.anInt5319 -= 312124549;
	}

	@OriginalMember(owner = "client!ce", name = "ai", descriptor = "(IFIIZ)[F", line = 107)
	@Override
	public float[] method21985(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		return this.method21989(arg0);
	}

	@OriginalMember(owner = "client!ce", name = "u", descriptor = "(IFIIZS)[F", line = 107)
	@Override
	public float[] method21983(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return this.method21989(arg0);
	}

	@OriginalMember(owner = "client!ce", name = "aq", descriptor = "(IFIIZ)[F", line = 107)
	@Override
	public float[] method21986(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		return this.method21989(arg0);
	}

	@OriginalMember(owner = "client!ce", name = "y", descriptor = "([BI)[I", line = 111)
	int[] method21991(@OriginalArg(0) byte[] arg0) throws IOException {
		@Pc(5) BufferedImage local5 = ImageIO.read(new ByteArrayInputStream(arg0));
		return Class283.method25454(local5);
	}

	@OriginalMember(owner = "client!ce", name = "av", descriptor = "([B)[I", line = 111)
	int[] method22003(@OriginalArg(0) byte[] arg0) throws IOException {
		@Pc(5) BufferedImage local5 = ImageIO.read(new ByteArrayInputStream(arg0));
		return Class283.method25454(local5);
	}

	@OriginalMember(owner = "client!ce", name = "ax", descriptor = "([B)[I", line = 111)
	int[] method22004(@OriginalArg(0) byte[] arg0) throws IOException {
		@Pc(5) BufferedImage local5 = ImageIO.read(new ByteArrayInputStream(arg0));
		return Class283.method25454(local5);
	}

	@OriginalMember(owner = "client!ce", name = "v", descriptor = "(I)V", line = 172)
	static void method22006() {
		if (Class338.aClass448_1 == null) {
			return;
		}
		try {
			@Pc(10) short local10;
			if (Class338.anInt4598 * -254105187 == 0) {
				local10 = 250;
			} else {
				local10 = 2000;
			}
			Class338.anInt4597 += -632880231;
			if (Class338.anInt4597 * 389521577 > local10) {
				Class13_Sub20.method7228();
			}
			@Pc(63) int local63;
			if (Class338.aClass448_1 == Class448.aClass448_2) {
				client.aClass82_1.method21606(Class49.method9255(Class570.aClass585_5.method33272(), 15000), Class570.aClass585_5.aString242);
				client.aClass82_1.method21599();
				@Pc(44) Class3_Sub23 local44 = Class368.method26925();
				local44.aClass3_Sub41_Sub1_1.method20250(Class293.aClass293_1.anInt4371 * 946648601);
				local44.aClass3_Sub41_Sub1_1.method20251(0);
				local63 = local44.aClass3_Sub41_Sub1_1.anInt2803 * 62066237;
				local44.aClass3_Sub41_Sub1_1.method20251(797);
				local44.aClass3_Sub41_Sub1_1.method20251(1);
				Class338.anIntArray421 = Class25.method6478(local44);
				@Pc(83) int local83 = local44.aClass3_Sub41_Sub1_1.anInt2803 * 62066237;
				local44.aClass3_Sub41_Sub1_1.method20260(client.aString147);
				local44.aClass3_Sub41_Sub1_1.method20251(client.anInt3073 * -720912181);
				local44.aClass3_Sub41_Sub1_1.method20254(client.anInt3082 * 277198609);
				local44.aClass3_Sub41_Sub1_1.method20254(client.anInt3056 * -116258853);
				local44.aClass3_Sub41_Sub1_1.method20260(Class511.aString232);
				local44.aClass3_Sub41_Sub1_1.method20250(Class469.aClass530_2.method33765());
				local44.aClass3_Sub41_Sub1_1.method20250(client.aClass543_2.anInt5326 * 1050721143);
				Class527.method32429(local44.aClass3_Sub41_Sub1_1);
				@Pc(135) String local135 = client.aString145;
				local44.aClass3_Sub41_Sub1_1.method20250(local135 == null ? 0 : 1);
				if (local135 != null) {
					local44.aClass3_Sub41_Sub1_1.method20260(local135);
				}
				Class298.aClass3_Sub47_1.method13198(local44.aClass3_Sub41_Sub1_1);
				local44.aClass3_Sub41_Sub1_1.anInt2803 += -2137895021;
				local44.aClass3_Sub41_Sub1_1.method20296(Class338.anIntArray421, local83, local44.aClass3_Sub41_Sub1_1.anInt2803 * 62066237);
				local44.aClass3_Sub41_Sub1_1.method20265(local44.aClass3_Sub41_Sub1_1.anInt2803 * 62066237 - local63);
				client.aClass82_1.method21601(local44);
				client.aClass82_1.method21617();
				Class338.aClass448_1 = Class448.aClass448_3;
			}
			if (Class338.aClass448_1 == Class448.aClass448_3) {
				if (client.aClass82_1.method21621() == null) {
					Class13_Sub20.method7228();
					return;
				}
				if (!client.aClass82_1.method21621().method12856(1)) {
					return;
				}
				client.aClass82_1.method21621().method12848(client.aClass82_1.aClass3_Sub41_Sub1_2.aByteArray51, 0, 1);
				Class338.aClass563_1 = (Class563) Class356.method26649(Class63.method13052(), client.aClass82_1.aClass3_Sub41_Sub1_2.aByteArray51[0] & 0xFF);
				if (Class338.aClass563_1 == Class563.aClass563_6) {
					client.aClass82_1.aClass577_2 = new Class577(Class338.anIntArray421);
					@Pc(249) int[] local249 = new int[4];
					for (local63 = 0; local63 < 4; local63++) {
						local249[local63] = Class338.anIntArray421[local63] + 50;
					}
					client.aClass82_1.aClass577_3 = new Class577(local249);
					new Class577(local249);
					client.aClass82_1.aClass3_Sub41_Sub1_2.method19823(client.aClass82_1.aClass577_3);
					Class166.method23342(16);
					client.aClass82_1.method21599();
					client.aClass82_1.aClass3_Sub41_Sub1_2.anInt2803 = 0;
					client.aClass82_1.aClass301_3 = null;
					client.aClass82_1.aClass301_1 = null;
					client.aClass82_1.aClass301_4 = null;
					client.aClass82_1.anInt2918 = 0;
					Class424.aClass165_1.aClass460_1.method28564();
					Class60_Sub13.method13461();
				} else {
					client.aClass82_1.method21604();
				}
				client.aClass82_1.aClass301_2 = null;
				Class338.aClass448_1 = null;
			}
		} catch (@Pc(320) IOException local320) {
			Class13_Sub20.method7228();
		}
	}

	@OriginalMember(owner = "client!ce", name = "gw", descriptor = "(B)V", line = 3516)
	public static final void method22012() {
		if (!client.aBoolean602) {
			client.aFloat240 += (-12.0F - client.aFloat240) / 2.0F;
			client.aBoolean586 = true;
			client.aBoolean602 = true;
		}
	}

	@OriginalMember(owner = "client!ce", name = "ch", descriptor = "(Lclient!vs;I)V", line = 4525)
	static final void method22011(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class480.method28970(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!ce", name = "ii", descriptor = "(IIIIIII)V", line = 5342)
	static final void method22013(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(4) Class53_Sub4 local4 = (Class53_Sub4) client.aClass559_7.method32822(); local4 != null; local4 = (Class53_Sub4) client.aClass559_7.method32837()) {
			if (client.anInt3034 >= local4.anInt1168 * 1986511927) {
				local4.method20615();
			} else {
				Class55.method11859(local4.anInt1167 * 1051633151, (local4.anInt1164 * -1880097831 << 9) + 256, (local4.anInt1166 * 485012927 << 9) + 256, 0, local4.anInt1165 * -391145794, false, false);
				Class568.aClass14_13.method3282(local4.aString42, (int) ((float) arg0 + client.aFloatArray96[0]), (int) ((float) arg1 + client.aFloatArray96[1]), local4.anInt1169 * 989293863 | 0xFF000000, 0);
			}
		}
	}

	@OriginalMember(owner = "client!ce", name = "io", descriptor = "(Lclient!act;Lclient!act;IIIIIIIB)V", line = 5907)
	static final void method22014(@OriginalArg(0) Class26_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) Class26_Sub1_Sub1_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(3) int local3 = arg1.method16694();
		if (local3 == -1) {
			return;
		}
		@Pc(15) Class6 local15 = (Class6) client.aClass161_14.method23219((long) local3);
		if (local15 == null) {
			@Pc(23) Class15[] local23 = Class137.method22942(Class294.aClass359_54, local3, 0);
			if (local23 == null) {
				return;
			}
			local15 = Class613.aClass21_13.method17089(local23[0], true);
			client.aClass161_14.method23222(local15, (long) local3);
		}
		@Pc(42) Class320 local42 = arg0.method21431().aClass320_61;
		Class55.method11859(arg0.aByte101, (int) local42.aFloat259, (int) local42.aFloat261, arg0.method16630() * 256, 0, false, false);
		@Pc(70) int local70 = (int) (client.aFloatArray96[0] + (float) arg3 - 18.0F);
		@Pc(82) int local82 = (int) (client.aFloatArray96[1] + (float) arg4 - 16.0F - 54.0F);
		@Pc(90) int local90 = local70 + arg2 / 4 * 18;
		@Pc(98) int local98 = local82 + arg2 % 4 * 18;
		local15.method16783(local90, local98);
		if (arg1 == arg0) {
			Class613.aClass21_13.method17062(local90 - 1, local98 - 1, 18, 18, -256);
		}
		@Pc(120) Class53_Sub6 local120 = Class223.method24444();
		local120.aClass26_Sub1_Sub1_Sub1_1 = arg1;
		local120.anInt1229 = local90 * -604543343;
		local120.anInt1227 = local98 * -53629947;
		local120.anInt1230 = (local90 + 16) * 320109195;
		local120.anInt1231 = (local98 + 16) * -1440378757;
		client.aClass559_6.method32819(local120);
	}

	@OriginalMember(owner = "client!ce", name = "aho", descriptor = "(Lclient!vs;I)V", line = 10439)
	static final void method22008(@OriginalArg(0) Class536 arg0) {
		Class578.method33182();
		Class250.aBoolean689 = false;
	}

	@OriginalMember(owner = "client!ce", name = "aio", descriptor = "(Lclient!vs;I)V", line = 10473)
	static final void method22010(@OriginalArg(0) Class536 arg0) {
		@Pc(1) String local1 = "";
		if (Class146.aClipboard1 != null) {
			@Pc(8) Transferable local8 = Class146.aClipboard1.getContents(null);
			if (local8 != null) {
				try {
					local1 = (String) local8.getTransferData(DataFlavor.stringFlavor);
					if (local1 == null) {
						local1 = "";
					}
				} catch (@Pc(22) Exception local22) {
				}
			}
		}
		arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = local1;
	}

	@OriginalMember(owner = "client!ce", name = "aso", descriptor = "(Lclient!vs;I)V", line = 12258)
	static final void method22009(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class370.aClass417_1.method27802("jagtheora") ? 1 : 0;
	}
}

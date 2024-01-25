import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dxVertexLayout")
public final class dxVertexLayout extends Class48 {

	@OriginalMember(owner = "client!dxVertexLayout", name = "f", descriptor = "Lclient!jagdx/IDirect3DVertexDeclaration;")
	public final IDirect3DVertexDeclaration anIDirect3DVertexDeclaration1;

	@OriginalMember(owner = "client!dxVertexLayout", name = "<init>", descriptor = "(Lclient!hg;[Lclient!rk;)V")
	public dxVertexLayout(@OriginalArg(0) Class43_Sub1_Sub1 arg0, @OriginalArg(1) Class289[] arg1) {
		@Pc(7) VertexElementCollection local7 = new VertexElementCollection(arg0.aBda1);
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			@Pc(17) int local17 = 0;
			@Pc(21) Class289 local21 = arg1[local11];
			for (@Pc(23) int local23 = 0; local21.method6372() > local23; local23++) {
				@Pc(33) Class68 local33 = local21.method6371(local23);
				@Pc(40) byte local40;
				@Pc(38) byte local38;
				@Pc(42) int local42;
				if (local33 == Static100.aClass68_1) {
					local38 = 0;
					local40 = 2;
					local42 = 0;
				} else if (Static100.aClass68_2 == local33) {
					local42 = 0;
					local38 = 3;
					local40 = 2;
				} else if (local33 == Static100.aClass68_3) {
					local38 = 10;
					local40 = 4;
					local42 = 0;
				} else if (Static100.aClass68_4 == local33) {
					local40 = 0;
					local42 = local9++;
					local38 = 5;
				} else if (Static100.aClass68_5 == local33) {
					local38 = 5;
					local42 = local9++;
					local40 = 1;
				} else if (Static100.aClass68_6 == local33) {
					local38 = 5;
					local40 = 2;
					local42 = local9++;
				} else {
					local38 = 5;
					local40 = 3;
					local42 = local9++;
				}
				local7.addElement(local11, local40, 0, local38, local42, local17);
				local17 += local33.anInt2406;
			}
		}
		local7.finish();
		this.anIDirect3DVertexDeclaration1 = arg0.anIDirect3DDevice1.a(local7, null);
	}
}

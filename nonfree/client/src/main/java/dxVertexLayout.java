import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dxVertexLayout")
public final class dxVertexLayout extends Class318 {

	@OriginalMember(owner = "client!dxVertexLayout", name = "g", descriptor = "Lclient!jagdx/IDirect3DVertexDeclaration;")
	public final IDirect3DVertexDeclaration anIDirect3DVertexDeclaration1;

	@OriginalMember(owner = "client!dxVertexLayout", name = "<init>", descriptor = "(Lclient!de;[Lclient!wg;)V")
	public dxVertexLayout(@OriginalArg(0) Class62_Sub1_Sub1 arg0, @OriginalArg(1) Class313[] arg1) {
		@Pc(7) VertexElementCollection local7 = new VertexElementCollection(arg0.aWn1);
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			@Pc(17) int local17 = 0;
			@Pc(21) Class313 local21 = arg1[local11];
			for (@Pc(23) int local23 = 0; local21.method7295() > local23; local23++) {
				@Pc(37) Class253 local37 = local21.method7297(local23);
				@Pc(52) byte local52;
				@Pc(48) byte local48;
				@Pc(50) int local50;
				if (local37 == Static422.aClass253_1) {
					local50 = 0;
					local52 = 2;
					local48 = 0;
				} else if (local37 == Static422.aClass253_2) {
					local48 = 3;
					local52 = 2;
					local50 = 0;
				} else if (local37 == Static422.aClass253_3) {
					local48 = 10;
					local50 = 0;
					local52 = 4;
				} else if (local37 == Static422.aClass253_4) {
					local50 = local9++;
					local52 = 0;
					local48 = 5;
				} else if (Static422.aClass253_5 == local37) {
					local48 = 5;
					local52 = 1;
					local50 = local9++;
				} else if (local37 == Static422.aClass253_6) {
					local48 = 5;
					local50 = local9++;
					local52 = 2;
				} else {
					local50 = local9++;
					local52 = 3;
					local48 = 5;
				}
				local7.addElement(local11, local52, 0, local48, local50, local17);
				local17 += local37.anInt7453;
			}
		}
		local7.finish();
		this.anIDirect3DVertexDeclaration1 = arg0.anIDirect3DDevice1.a(local7, null);
	}
}

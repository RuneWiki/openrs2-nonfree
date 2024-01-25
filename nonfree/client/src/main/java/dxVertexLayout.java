import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dxVertexLayout")
public final class dxVertexLayout extends Class284 {

	@OriginalMember(owner = "client!dxVertexLayout", name = "f", descriptor = "Lclient!jagdx/IDirect3DVertexDeclaration;")
	public final IDirect3DVertexDeclaration anIDirect3DVertexDeclaration1;

	@OriginalMember(owner = "client!dxVertexLayout", name = "<init>", descriptor = "(Lclient!tb;[Lclient!af;)V")
	public dxVertexLayout(@OriginalArg(0) Class134_Sub1_Sub2 arg0, @OriginalArg(1) Class7[] arg1) {
		@Pc(7) VertexElementCollection local7 = new VertexElementCollection(arg0.aJv1);
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			@Pc(17) int local17 = 0;
			@Pc(21) Class7 local21 = arg1[local11];
			for (@Pc(23) int local23 = 0; local23 < local21.method109(); local23++) {
				@Pc(37) Class198 local37 = local21.method106(local23);
				@Pc(46) byte local46;
				@Pc(44) byte local44;
				@Pc(42) int local42;
				if (local37 == Static282.aClass198_1) {
					local42 = 0;
					local44 = 0;
					local46 = 2;
				} else if (Static282.aClass198_2 == local37) {
					local42 = 0;
					local46 = 2;
					local44 = 3;
				} else if (local37 == Static282.aClass198_3) {
					local44 = 10;
					local42 = 0;
					local46 = 4;
				} else if (local37 == Static282.aClass198_4) {
					local42 = local9++;
					local46 = 0;
					local44 = 5;
				} else if (local37 == Static282.aClass198_5) {
					local42 = local9++;
					local44 = 5;
					local46 = 1;
				} else if (Static282.aClass198_6 == local37) {
					local42 = local9++;
					local44 = 5;
					local46 = 2;
				} else {
					local42 = local9++;
					local44 = 5;
					local46 = 3;
				}
				local7.addElement(local11, local46, 0, local44, local42, local17);
				local17 += local37.anInt4934;
			}
		}
		local7.finish();
		this.anIDirect3DVertexDeclaration1 = arg0.anIDirect3DDevice1.a(local7, null);
	}
}

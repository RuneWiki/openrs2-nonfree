import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dxVertexLayout")
public final class dxVertexLayout extends Class287 {

	@OriginalMember(owner = "client!dxVertexLayout", name = "g", descriptor = "Lclient!jagdx/IDirect3DVertexDeclaration;")
	public final IDirect3DVertexDeclaration anIDirect3DVertexDeclaration1;

	@OriginalMember(owner = "client!dxVertexLayout", name = "<init>", descriptor = "(Lclient!bv;[Lclient!ds;)V")
	public dxVertexLayout(@OriginalArg(0) Class42_Sub1_Sub1 arg0, @OriginalArg(1) Class75[] arg1) {
		@Pc(7) VertexElementCollection local7 = new VertexElementCollection(arg0.aFk1);
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			@Pc(17) int local17 = 0;
			@Pc(21) Class75 local21 = arg1[local11];
			for (@Pc(23) int local23 = 0; local23 < local21.method2095(); local23++) {
				@Pc(37) Class262 local37 = local21.method2097(local23);
				@Pc(44) byte local44;
				@Pc(42) byte local42;
				@Pc(46) int local46;
				if (Static427.aClass262_1 == local37) {
					local42 = 0;
					local44 = 2;
					local46 = 0;
				} else if (Static427.aClass262_2 == local37) {
					local46 = 0;
					local44 = 2;
					local42 = 3;
				} else if (Static427.aClass262_3 == local37) {
					local46 = 0;
					local42 = 10;
					local44 = 4;
				} else if (local37 == Static427.aClass262_4) {
					local42 = 5;
					local46 = local9++;
					local44 = 0;
				} else if (local37 == Static427.aClass262_5) {
					local42 = 5;
					local46 = local9++;
					local44 = 1;
				} else if (Static427.aClass262_6 == local37) {
					local42 = 5;
					local44 = 2;
					local46 = local9++;
				} else {
					local46 = local9++;
					local44 = 3;
					local42 = 5;
				}
				local7.addElement(local11, local44, 0, local42, local46, local17);
				local17 += local37.anInt7894;
			}
		}
		local7.finish();
		this.anIDirect3DVertexDeclaration1 = arg0.anIDirect3DDevice1.a(local7, null);
	}
}
